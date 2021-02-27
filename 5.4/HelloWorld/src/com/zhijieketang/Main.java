package com.zhijieketang;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("加载驱动程序成功...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("加载驱动程序失败...");
            return;
        }

        // 获得数据库连接
        String url = "jdbc:mysql://localhost:3306/mydb?verifyServerCertificate=false&useSSL=false";
        String user = "root";
        String password = "12345";

        String sql = "select userid, name from user";

        // 采用自动资源释放
//        try (Connection connection = DriverManager.getConnection(url, user, password);
//             Statement statement = connection.createStatement();
//             ResultSet resultSet = statement.executeQuery(sql)) {
//
//            //变量结果集
//            while (resultSet.next()) {
//                System.out.printf("name: %s     id: %d \n",
//                        resultSet.getString("name"),
//                        resultSet.getInt("userid"));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


        // 采用手动释放
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            //变量结果集
            while (resultSet.next()) {
                System.out.printf("name: %s     id: %d \n",
                        resultSet.getString("name"),
                        resultSet.getInt("userid"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
