package com.xuqianlei.test;

import javax.annotation.concurrent.NotThreadSafe;
import javax.annotation.concurrent.ThreadSafe;

/**
 * HashMapSizeTest class
 *
 * @author qianlei.xu
 * @date 2020/8/21
 */
@ThreadSafe
public class ThreadTest implements Runnable {

    private int value;

    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("=========" + value++);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadTest());
        Thread thread2 = new Thread(new ThreadTest());
        thread1.start();
        thread2.start();
    }


}