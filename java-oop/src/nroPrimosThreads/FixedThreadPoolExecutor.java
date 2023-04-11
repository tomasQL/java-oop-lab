package nroPrimosThreads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class FixedThreadPoolExecutor {
    public FixedThreadPoolExecutor(){
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        for(int i = 10; i < 10; i++){
            Task task = new Task("Task" + i);
            System.out.println("Una nueva tarea ha sido añadida "+ task.getName());
            executor.execute(task);
        }
        System.out.println("Máximos hilos dentro del pool "+ executor.getMaximumPoolSize());
        executor.shutdown();
    }
}
