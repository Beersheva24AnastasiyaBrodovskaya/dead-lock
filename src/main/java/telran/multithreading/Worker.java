package telran.multithreading;

public class Worker extends Thread {


    private  final Object lock1;
    private  final Object lock2;

    public Worker(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        f1();
        f2();
    }

    private void f1() {
        synchronized (lock1) {
            try {
                sleep(0);
            } catch (InterruptedException e) {
            }
            synchronized (lock2) {

            }
        }
    }

    private void f2() {
        synchronized (lock2) {
            try {
                sleep(100);
              
            } catch (InterruptedException e) {
            }
            synchronized (lock1) {

            }

        }
    }
}