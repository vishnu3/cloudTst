package multithreading;

import java.util.concurrent.*;

public class CallableFutureDemo {
    public static void main(String[] args) {
        MyCallable[] jobs = {
                new MyCallable(10),
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(70),
                new MyCallable(50),
                new MyCallable(100)
        };


        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(MyCallable callable : jobs){
            Future f = executorService.submit(callable);

            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
