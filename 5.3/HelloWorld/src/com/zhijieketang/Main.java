package com.zhijieketang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

        try (Connection connection = DriverManager.getConnection(url, user, password);) {
            System.out.println("数据库连接成功:" + connection);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接成功失败...");
        }

    }
}
