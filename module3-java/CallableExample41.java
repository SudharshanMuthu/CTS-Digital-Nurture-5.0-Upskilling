import java.util.concurrent.*;

public class CallableExample41 {

    public static void main(String[] args) throws Exception {

        ExecutorService executor =
                Executors.newFixedThreadPool(2);

        Callable<String> task = () -> {

            return "Hello from Callable";

        };

        Future<String> result =
                executor.submit(task);

        System.out.println(result.get());

        executor.shutdown();

    }
}