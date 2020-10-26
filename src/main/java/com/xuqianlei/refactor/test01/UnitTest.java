package com.xuqianlei.refactor.test01;

/**
 * UnitTest class
 *
 * @author qianlei.xu
 * @date 2020/10/20
 */
public class UnitTest {

    public static void main(String[] args) {
        Customer customer = new Customer("徐前磊");
        Movie movie = new Movie("你的名字", Movie.REGULAR);
        Movie movie1 = new Movie("我的名字", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 5);
        Rental rental1 = new Rental(movie1, 3);
        customer.addRental(rental);
        customer.addRental(rental1);
        String statement = customer.statement();
        System.out.println(statement);
    }
}
