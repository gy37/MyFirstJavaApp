package com.company;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class RunnableTest implements Runnable {
    private Thread thread;
    private String threadName;

    RunnableTest(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}

class ThreadTest extends Thread {
    private Thread thread;
    private String threadName;

    ThreadTest(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}

class CallableThreadTest implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }
}


class ThreadTestDemo {
    public static void main(String[] args) {
//        RunnableTest r1 = new RunnableTest("Runnable-1");
//        r1.start();
//        RunnableTest r2 = new RunnableTest("Runnable-2");
//        r2.start();

        ThreadTest t1 = new ThreadTest("Thread-1");
        t1.start();
        ThreadTest t2 = new ThreadTest("Thread-2");
        t2.start();

//        CallableThreadTest ctt = new CallableThreadTest();
//        FutureTask<Integer> ft = new FutureTask<>(ctt);
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + " 的循环变量i的值 " + i);
//            if (i == 20) {
//                new Thread(ft, "有返回值的线程").start();
//            }
//        }
//        try {
//            System.out.println("子线程的返回值：" + ft.get());
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
    }
}
