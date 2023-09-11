public class Job03 implements Runnable {
    private static int sold = 200;

    public static void main(String[] args) {
        Job03 job = new Job03();
        Thread t1 = new Thread(job, "Thread 1"); // Nommez le thread 1
        Thread t2 = new Thread(job, "Thread 2"); // Nommez le thread 2
        t1.start();
        t2.start();


    }

    @Override
    public void run() {
        synchronized (Job03.class) {
            if (sold >= 50) {
                sold -= 50;
                System.out.println(Thread.currentThread().getName() + " a retiré 50 : solde restant : " + sold);
            } else {
                System.out.println(Thread.currentThread().getName() + " : Fonds insuffisants.");
            }
        }
    }
}
