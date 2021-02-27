package com.zhijieketang;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("结算测试类")
class GoodsServiceTest {

    GoodsService sv;

    @BeforeAll
    static void setUpAll() {
        System.out.println("setUpAll...");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("tearDownAll...");
    }

    @BeforeEach
    void setUp() {
        sv = new GoodsService();
        System.out.println("setUp...");
    }

    @AfterEach
    void tearDown() {
        sv = null;
        System.out.println("tearDown...");
    }

    @Test
    @DisplayName("商品金额小于100元")
    void balance1() {
        double output = sv.balance(80);
        assertEquals(80, output);
    }

    @Test
    @DisplayName("商品金额等于100元")
    void balance2() {
        double output = sv.balance(100);
        assertEquals(100.0, output);
    }

    @Test
    @DisplayName("商品金额大于100元，但小于1000元")
    void balance3() {
        double output = sv.balance(500);
        assertEquals(450.0, output);
    }

    @Test
    @DisplayName("商品金额等于1000元")
    void balance4() {
        double output = sv.balance(1000);
        assertEquals(900.0, output);
    }

    @Test
    @DisplayName("商品金额在大于1000元，但不超过至5000元之间")
    void balance5() {
        double output = sv.balance(3000);
        assertEquals(2400.0, output);
    }

    @Test
    @DisplayName("商品金额等于5000元")
    void balance6() {
        double output = sv.balance(5000);
        assertEquals(4000.0, output);
    }

    @Test
    @DisplayName("商品金额大于5000元")
    void balance7() {
        double output = sv.balance(6000);
        assertEquals(4200.0, output);
    }

}