package com.zhijieketang;

public class SampleClass {

    static double div(double n1, double n2) {

        if (n2 == 0) {
            throw new ArithmeticException(" / by zore");
        }

        return n1 / n2;
    }
}
