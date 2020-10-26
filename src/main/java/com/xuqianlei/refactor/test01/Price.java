package com.xuqianlei.refactor.test01;

/**
 * Price class
 *
 * @author qianlei.xu
 * @date 2020/10/21
 */
public abstract class Price {

    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
            return 2;
        else return 1;
    }
}
