package com.zhijieketang.layerdemo.dao;

import com.zhijieketang.layerdemo.domain.Customer;

import java.util.List;

public interface CustomerDao {

    void create(Customer customer);

    void modify(Customer customer);

    void remove(Customer customer);

    Customer findByPk(String pk);

    List<Customer> findAll();

}
