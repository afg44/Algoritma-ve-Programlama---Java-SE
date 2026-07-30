package ders11.konu01;

/**
 *  Thread senkronizasyon için Lock
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class CounterDemo05 {
    private int count = 0;
    private final Lock benimKilidim = new ReentrantLock();

    public void increment(String threadName) {
        benimKilidim.lock(); // kilidi al
        try {
            System.out.println(threadName + " işlemler başladı...");
            count++;
            System.out.println(count);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println(threadName + " işlemler sonlandı!");
            benimKilidim.unlock(); // kilidi bırak
        }
    }

    public int getCount() {
        return count;
    }
}

public class Demo05 {
    public static void main(String[] args) throws InterruptedException {
        CounterDemo05 c = new CounterDemo05();

        Runnable[] tasks = new Runnable[5];
        for(int ti=0; ti < tasks.length; ti++) {
            int finalTi = ti;
            tasks[ti] = () -> {
    //            for (int i = 0; i < 10_000; i++) {
                for (int i = 0; i < 10; i++) {
                    c.increment("Thread" + finalTi);
                }
            };
        }

        Thread[] threads = new Thread[5];
        for(int ti=0; ti < tasks.length; ti++)
            threads[ti] = new Thread(tasks[ti]);

        for(int ti=0; ti < tasks.length; ti++)
            threads[ti].start();

        for(int ti=0; ti < tasks.length; ti++)
            threads[ti].join();


        System.out.println("Final count: " + c.getCount());
    }
}
