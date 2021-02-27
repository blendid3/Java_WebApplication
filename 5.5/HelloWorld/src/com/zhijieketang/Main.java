package com.zhijieketang;

import java.sql.*;

public class Main {

    // 获得数据库连接
    static String url = "jdbc:mysql://localhost:3306/mydb?verifyServerCertificate=false&useSSL=false";
    static String user = "root";
    static String password = "12345";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("加载驱动程序成功...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("加载驱动程序失败...");
        }
    }

    public static void main(String[] args) {

        // 无条件查询数据
        int maxUserId = readMaxUserId();
        System.out.println(maxUserId);
        // 有条件查询数据
        read();
        //数据插入
        create();
        //数据更新
        update();
        //删除数据
        delete();

    }

    public static void read() {
        //2、有条件查询
        // 采用自动资源释放
        String sql = "select name, userid from user where userid > ? order by userid";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // 绑定参数
            preparedStatement.setInt(1, 0);
            ResultSet resultSet = preparedStatement.executeQuery();

            //遍历结果集
            while (resultSet.next()) {
                System.out.printf("name: %s     id: %d \n",
                        resultSet.getString("name"),
                        resultSet.getInt("userid"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int readMaxUserId() {
        //1、无条件查询
        // 采用自动资源释放
        int maxId = 0;
        String sql = "select max(userid) from user";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            //变量结果集
            while (resultSet.next()) {
                maxId = resultSet.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maxId;
    }

    private static void create() {

        String sql = "insert into user (userid, name) values (?, ?)";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            int maxUserId = readMaxUserId();
            // 绑定参数
            preparedStatement.setInt(1, ++maxUserId);
            preparedStatement.setString(2, "Tony" + maxUserId);
            // 执行SQL语句
            int count = preparedStatement.executeUpdate();

            System.out.printf("成功插入%d条数据.\n", count);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void update() {

        String sql = "update user set name=? where userid > ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // 绑定参数
            preparedStatement.setString(1, "Tom");
            preparedStatement.setInt(2, 3);
            // 执行SQL语句
            int count = preparedStatement.executeUpdate();

            System.out.printf("成功更新%d条数据.\n", count);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void delete() {

        String sql = "delete from user where userid = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            int maxUserId = readMaxUserId();
            // 绑定参数
            preparedStatement.setInt(1, maxUserId);
            // 执行SQL语句
            int count = preparedStatement.executeUpdate();

            System.out.printf("成功删除%d条数据.\n", count);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
