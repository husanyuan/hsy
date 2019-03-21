package hsy.practice2;

public class Buy {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Customer customer = new Customer(clerk);
        Product product = new Product(clerk);
        Thread thread1 = new Thread(product);
        Thread thread2 = new Thread(customer);
        thread2.start();
        thread1.start();

    }
}
