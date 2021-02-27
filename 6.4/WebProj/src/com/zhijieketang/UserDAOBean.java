package com.zhijieketang;

import com.zhijieketang.db.core.DBHelp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOBean {

    public List<UserBean> findAll() {

        List<UserBean> list = new ArrayList<UserBean>();

        try (Connection conn = DBHelp.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select name, userid from user")) {

            while (rs.next()) {

                int id = rs.getInt("userid");
                String name = rs.getString("name");

                UserBean userBean = new UserBean();
                userBean.setId(id);
                userBean.setName(name);

                list.add(userBean);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }


    public void remove(int id) {

        try (Connection conn = DBHelp.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("delete from user where userid = ?")) {
            // 绑定参数
            pstmt.setInt(1, id);
            // 执行处理
            int count = pstmt.executeUpdate();

            System.out.printf("成功删除%d条数据.\n", count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
