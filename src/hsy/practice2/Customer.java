package hsy.practice2;

public class Customer implements Runnable {
    Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("开始消费商品");
        while (true) {
            try {
                Thread.sleep((int) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.remove();
        }
    }
}
