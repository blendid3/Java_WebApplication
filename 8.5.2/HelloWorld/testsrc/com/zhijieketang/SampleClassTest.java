package com.zhijieketang;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleClassTest {

    @Test
    void div() {
        assertThrows(ArithmeticException.class,
                () -> SampleClass.div(10, 0));
    }

    @Test
    void test1() {
        assertEquals(30, 10 + 20, "相等");
        assertNotEquals(3, 1 + 1);

        assertNotSame(new Object(), new Object());

        assertTrue(10 > 9);
        assertFalse(9 < 8);

        String s = null;
        assertNull(s);
    }

    @Test
    void test2() {
        String[] ary1 = {"Hello", "World"};
        String[] ary2 = {"Hello", "World"};
        assertArrayEquals(ary1, ary2);
    }
}