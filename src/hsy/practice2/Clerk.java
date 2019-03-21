package hsy.practice2;

public class Clerk {
    private int num = 0;

    // 生产商品
    public synchronized void add() {
        if (num >= 20) {
            try {
                wait();
                System.out.println("请暂停生产！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            num++;
            System.out.println("生产者生产了第" + num + "个商品！");
            notifyAll();

        }
    }

    // 消费商品
    public synchronized void remove() {
        if (num <= 0) {
            try {

                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("顾客取走了第" + num + "个商品");
            num--;
            notifyAll();
        }
    }

}
