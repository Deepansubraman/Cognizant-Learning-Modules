import java.util.concurrent.*;
import java.util.*;

class ExecuterServiceandCallable{
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            tasks.add(() -> "Task " + finalI + " result");
        }
        List<Future<String>> results = executor.invokeAll(tasks);
        for (Future<String> f : results) {
            System.out.println(f.get());
        }
        executor.shutdown();
    }
}
