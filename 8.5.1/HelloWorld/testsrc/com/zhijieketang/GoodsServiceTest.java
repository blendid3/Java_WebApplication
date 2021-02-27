package com.zhijieketang;

import org.junit.jupiter.api.*;

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
    @DisplayName("结算测试方法")
    @Disabled
    void balance() {
    }
}