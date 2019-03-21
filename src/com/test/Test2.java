package com.test;

public class Test2 implements Runnable {
    Num num;

    public Test2(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        synchronized (num) {
            while (num.i <= 100) {

                if (!num.flag) {
                    try {
                        Thread.sleep(1000);
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("打印偶数++" + num.i);
                    num.i++;
                    num.flag = false;
                    num.notify();
                }

            }
        }
    }

}
