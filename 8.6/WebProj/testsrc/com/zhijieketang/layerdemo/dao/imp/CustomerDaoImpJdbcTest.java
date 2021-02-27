package com.zhijieketang.layerdemo.dao.imp;

import com.zhijieketang.layerdemo.dao.CustomerDao;
import com.zhijieketang.layerdemo.domain.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class CustomerDaoImpJdbcTest {

    CustomerDao dao = null;
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    @BeforeEach
    void setUp() {
        dao = new CustomerDaoImpJdbc();
    }

    @AfterEach
    void tearDown() {
        dao = null;
    }

    @Test
    void findByPk() {
        Customer customer = dao.findByPk("tony");
        assertNotNull(customer);
        assertEquals("tony", customer.getId());
        assertEquals("关东升", customer.getName());
        assertEquals("111", customer.getPassword());
        assertEquals("北京丰台", customer.getAddress());
        assertEquals("888888", customer.getPhone());
        assertEquals(11111111111L, customer.getBirthday().getTime());
    }

    @Test
    void findAll() {

        List<Customer> list = dao.findAll();
        assertEquals(list.size(), 1);
    }

    @Test
    void create() {
        Customer customer = new Customer();
        customer.setId("tom");
        customer.setName("关1");
        customer.setPassword("123");
        customer.setAddress("黑龙江");
        customer.setPhone("8888888");

        Date birthday = null;
        try {
            birthday = df.parse("1980-12-8");
        } catch (ParseException e) {
        }

        customer.setBirthday(birthday);

        //插入数据
        dao.create(customer);
        // 按照主键查询数据
        Customer customer1 = dao.findByPk("tom");
        assertNotNull(customer1);
        assertEquals("tom", customer1.getId());
        assertEquals("关1", customer1.getName());
        assertEquals("123", customer1.getPassword());
        assertEquals("黑龙江", customer1.getAddress());
        assertEquals("8888888", customer1.getPhone());
        assertEquals(birthday, customer1.getBirthday());
    }

    @Test
    void modify() {

        Customer customer = new Customer();
        customer.setId("tom");
        customer.setName("关2");
        customer.setPassword("2222");
        customer.setAddress("吉林");
        customer.setPhone("66666");

        Date birthday = null;
        try {
            birthday = df.parse("1988-12-8");
        } catch (ParseException e) {
        }

        customer.setBirthday(birthday);


        dao.modify(customer);

        // 按照主键查询数据
        Customer customer1 = dao.findByPk("tom");
        assertNotNull(customer1);
        assertEquals("tom", customer1.getId());
        assertEquals("关2", customer1.getName());
        assertEquals("2222", customer1.getPassword());
        assertEquals("吉林", customer1.getAddress());
        assertEquals("66666", customer1.getPhone());
        assertEquals(birthday, customer1.getBirthday());
    }

    @Test
    void remove() {

        Customer customer = new Customer();
        customer.setId("tom");

        dao.remove(customer);
        Customer customer1 = dao.findByPk("tom");
        assertNull(customer1);

    }

}