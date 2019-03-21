package hsy.practice;

public class Thread1 implements Runnable {
    int[] arr = { 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300 };

    int num = arr.length;

    boolean[] flag = new boolean[arr.length];

    @Override
    public void run() {
        synchronized (this) {
            while (true) {

                if (num > 0) {
                    int index = (int) ((Math.random()) * num);
                    int get = arr[index];
                    if (flag[index] != true) {
                        flag[index] = true;
                        System.out.println(Thread.currentThread().getName() + "我抽到了奖金,金额为" + get);
                        num--;
                    }
                }
                if (num == 0) {
                    System.out.println("奖金已经配送完毕了");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }

    }

}
