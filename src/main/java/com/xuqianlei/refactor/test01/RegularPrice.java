package com.xuqianlei.refactor.test01;

/**
 * RegularPrice class
 *
 * @author qianlei.xu
 * @date 2020/10/21
 */
public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) result += (daysRented - 2) * 1.5;
        return result;
    }
}
