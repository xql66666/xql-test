package com.xuqianlei.test;

/**
 * ValueChangeTest class
 *
 * @author qianlei.xu
 * @date 2020/10/27
 */
public class ValueChangeTest {

    private static final int i = 1;

    public static void main(String[] args) {
        //int i = 1;
        System.out.println("1====" + i);
        int num = num(i);
        System.out.println("num==" + num);
        System.out.println("3=====" + i);
    }

    private static int num(int n) {
            n = 5;
        System.out.println("2=====" + n);
        return n;
    }
}
