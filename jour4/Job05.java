import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class Job05 {
    public static void main(String[] args) {
        // Créez un pool de threads avec un nombre fixe de threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Créez des tâches Callable pour multiplier un argument par un facteur
        Callable<Integer> task1 = new MultiplyTask(1, 3);
        Callable<Integer> task2 = new MultiplyTask(2, 3);
        Callable<Integer> task3 = new MultiplyTask(3, 3);

        // Soumettez les tâches au pool d'exécution
        Future<Integer> future1 = executorService.submit(task1);
        Future<Integer> future2 = executorService.submit(task2);
        Future<Integer> future3 = executorService.submit(task3);

        // Attendez les résultats
        try {
            int result1 = future1.get();
            int result2 = future2.get();
            int result3 = future3.get();

            System.out.println("Résultat de la tâche : " + result1);
            System.out.println("Résultat de la tâche : " + result2);
            System.out.println("Résultat de la tâche : " + result3);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Arrêtez le pool d'exécution
        executorService.shutdown();
    }
}

class MultiplyTask implements Callable<Integer> {
    private int number;
    private int factor;

    public MultiplyTask(int number, int factor) {
        this.number = number;
        this.factor = factor;
    }

    @Override
    public Integer call() throws Exception {
        return number * factor;
    }
}
