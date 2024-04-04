package threaddemo;

public class NumberCountRunnableThread implements Runnable {
    public void run() {
        System.out.println(" From NumberCountRunnableThread ");

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " Count " + i + " Thread Priority " + Thread.currentThread().getPriority());
        }
    }
}
