package com.zhijieketang.layerdemo.service;

import com.zhijieketang.layerdemo.domain.Customer;

import java.util.List;

public interface CustomerService {

    boolean login(Customer customer);

    boolean register(Customer customer);

    List<Customer> search();
}
