package com.zhijieketang;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        System.out.println(SampleClass.div(10, 0));

        GoodsService sv = new GoodsService();

        System.out.println("请输入购买的商品金额:");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = bufferedReader.readLine();
            if (str != null) {
                double input = Double.parseDouble(str);
                double res = sv.balance(input);
                System.out.println("实际支付金额:" + res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
