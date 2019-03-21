package hsy.com;

public class Test2 implements Runnable {

    @Override
    public void run() {
        synchronized (Tickets.class) {
            while (Tickets.num > 0) {
                for (int i = 0; i <= Tickets.num; i++) {
                    System.out.println("我抢到了第 1张票,还剩" + (Tickets.num - 1) + "张票");
                    Tickets.num--;
                }
            }
        }

    }

}
