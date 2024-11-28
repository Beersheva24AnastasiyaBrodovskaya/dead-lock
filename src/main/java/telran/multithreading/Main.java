package telran.multithreading;

public class Main {

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();
    public static void main(String[] args) throws InterruptedException {
        Worker worker1 = new Worker(lock1, lock2);
        Worker worker2 = new Worker(lock1, lock2);
        worker1.start();
        worker2.start();
    }
}