package com.test;

public class Test1 implements Runnable {
    Num num;

    public Test1(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        synchronized (num) {
            while (num.i <= 100) {
                if (num.flag) {
                    try {
                        Thread.sleep(1000);
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    System.out.println("打印奇数++" + num.i);
                    num.i++;
                    num.flag = true;
                    num.notify();
                }

            }
        }
    }

}
