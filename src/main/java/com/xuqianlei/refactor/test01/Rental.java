package com.xuqianlei.refactor.test01;

/**
 * Rental class
 *
 * @author qianlei.xu
 * @date 2020/10/20
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }


    double getCharge() {
        return _movie.getCharge(_daysRented);
    }

    /**
     * add bonus for a two day new release rental
     *
     * @return
     */
    int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }
}
