package com.xuqianlei.refactor.test01;

/**
 * ChildrensPrice class
 *
 * @author qianlei.xu
 * @date 2020/10/21
 */
public class ChildrensPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) result += (daysRented - 3) * 1.5;
        return result;
    }
}
