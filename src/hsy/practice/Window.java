package hsy.practice;

public class Window {
    public static void main(String[] args) {
        Thread1 th = new Thread1();
        Thread thread1 = new Thread(th, "抽奖箱1");

        thread1.start();

    }
}
