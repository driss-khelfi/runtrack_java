import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ExecutionException;

public class Job04 implements Callable<Integer> {
    private int num1;
    private int num2;

    public Job04(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Integer call() throws Exception {
        return num1 * num2;
    }

    public static void main(String[] args) {
        int myNum1 = 5;
        int myNum2 = 6;

        // Créez une instance de Callable avec les nombres à multiplier
        Callable<Integer> callable = new Job04(myNum1, myNum2);

        // Créez une FutureTask pour exécuter Callable
        FutureTask<Integer> futureTask = new FutureTask<>(callable);

        // Créez un thread pour exécuter FutureTask
        Thread thread = new Thread(futureTask);
        thread.start();

        try {
            // Attendez que le thread se termine et obtenez le résultat
            Integer result = futureTask.get();

            // Affichez le résultat
            System.out.println("Le résultat de la multiplication est : " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
