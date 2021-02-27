package com.zhijieketang.db.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelp {

    // 获得数据库连接
    private static String url = "jdbc:mysql://localhost:3306/mydb?verifyServerCertificate=false&useSSL=false";
    private static String user = "root";
    private static String password = "12345";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
