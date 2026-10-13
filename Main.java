import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);
        Thread[] threads = new Thread[4];
        for (int i = 0; i < 4; i++) {
            threads[i] = new Thread(() -> {
                // Increment counter 250 times.
                // Declare a NEW loop variable here: i is already in scope,
                // and a lambda may neither reuse its name nor modify it.

                for (int j = 1; j <= 250; j++) {
                    counter.incrementAndGet();
                }
            });
            threads[i].start();
        }
        for (Thread t : threads)
            t.join();
        System.out.println(counter.get());
    }
}
