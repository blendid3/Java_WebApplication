package com.zhijieketang;

import com.zhijieketang.db.core.DBHelp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
}
