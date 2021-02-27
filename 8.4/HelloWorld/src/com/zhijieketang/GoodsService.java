package com.zhijieketang;

public class GoodsService {

    /**
     * 结算商品金额
     *
     * @param input 购买商品金额
     * @return 实际支付金额
     */
    double balance(double input) {

        if (input <= 100) {//商品金额不超过100元	1	不打折
            return input;
        } else if (input > 100 && input <= 1000) {//商品金额在大于100元，但不超过1000元之间	0.9	　
            return input * 0.9;
        } else if (input > 1000 && input <= 5000) { //商品金额在大于1000元，但不超过至5000元之间	0.8
            return input * 0.8;
        } else { //商品金额超过5000元	0.7	　
            return input * 0.7;
        }

    }

}
