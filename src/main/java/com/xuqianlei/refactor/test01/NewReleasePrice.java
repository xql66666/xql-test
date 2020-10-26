package com.xuqianlei.refactor.test01;

/**
 * NewReleasePrice class
 *
 * @author qianlei.xu
 * @date 2020/10/21
 */
public class NewReleasePrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }
}
