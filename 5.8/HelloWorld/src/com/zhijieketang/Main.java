package com.zhijieketang;

import com.zhijieketang.db.core.JdbcTemplate;
import com.zhijieketang.db.core.PreparedStatementCreator;
import com.zhijieketang.db.core.RowCallbackHandler;

import java.sql.*;

public class Main {

    private static JdbcTemplate jdbcTemplate = new JdbcTemplate();

    private static int maxId = 0;

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
        final String sql = "select name, userid from user where userid > ? order by userid";
        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setInt(1, 0);
                return preparedStatement;
            }
        }, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                System.out.printf("name: %s     id: %d \n",
                        rs.getString("name"),
                        rs.getInt("userid"));
            }
        });

    }

    public static int readMaxUserId() {
        //1、无条件查询
        // 采用自动资源释放
        String sql = "select max(userid) from user";

        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                return preparedStatement;
            }
        }, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                maxId = rs.getInt(1);
            }
        });

        return maxId;
    }

    private static void create() {

        String sql = "insert into user (userid, name) values (?, ?)";

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);

                int maxUserId = readMaxUserId();
                // 绑定参数
                preparedStatement.setInt(1, ++maxUserId);
                preparedStatement.setString(2, "Tony" + maxUserId);

                return preparedStatement;
            }
        });

    }

    private static void update() {

        String sql = "update user set name=? where userid > ?";

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);

                // 绑定参数
                preparedStatement.setString(1, "Tom");
                preparedStatement.setInt(2, 3);

                return preparedStatement;
            }
        });

    }

    private static void delete() {

        String sql = "delete from user where userid = ?";

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);

                int maxUserId = readMaxUserId();
                // 绑定参数
                preparedStatement.setInt(1, maxUserId);
                return preparedStatement;
            }
        });

    }
}
