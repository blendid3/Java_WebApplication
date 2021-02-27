package com.zhijieketang.layerdemo.service.imp;

import com.zhijieketang.layerdemo.domain.Customer;
import com.zhijieketang.layerdemo.service.CustomerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImpTest {

    CustomerService customerService = null;

    @BeforeEach
    void setUp() {
        customerService = new CustomerServiceImp();
    }

    @AfterEach
    void tearDown() {
        customerService = null;
    }

    @Test
    @DisplayName("登录成功")
    void login1() {
        Customer customer = new Customer();
        customer.setId("tony");
        customer.setPassword("111");

        assertTrue(customerService.login(customer));
        assertNotNull(customer);
        assertEquals("tony", customer.getId());
        assertEquals("关东升", customer.getName());
        assertEquals("111", customer.getPassword());
        assertEquals("北京丰台", customer.getAddress());
        assertEquals("888888", customer.getPhone());
        assertEquals(11111111111L, customer.getBirthday().getTime());
    }


    @Test
    @DisplayName("登录失败")
    void login2() {
        Customer customer = new Customer();
        customer.setId("tony");
        customer.setPassword("123");

        assertFalse(customerService.login(customer));

    }


    @Test
    void register() {
    }

    @Test
    void search() {
    }
}