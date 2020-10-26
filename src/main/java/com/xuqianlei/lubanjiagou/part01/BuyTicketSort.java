package com.xuqianlei.lubanjiagou.part01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * BuyTicketSort class
 *
 * @author qianlei.xu
 * @date 2020/10/19
 */
public class BuyTicketSort {



    public static void main(String[] args) {
        BuyTicket ticket = new BuyTicket();

        Thread thread1 = new Thread(ticket);
        Thread thread2 = new Thread(ticket);
        Thread thread3 = new Thread(ticket);
        Thread thread4 = new Thread(ticket);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

}

class BuyTicket implements Runnable {


    private int ticket = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket > 0) {
                    Thread.sleep(50);
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "卖出一张票, 当前剩余余票: " + ticket);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }
}
