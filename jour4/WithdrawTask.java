public class WithdrawTask implements Runnable {
    private int initialBalance = 200;
    private int withdrawalAmount = 50;

    public WithdrawTask(int initialBalance, int withdrawalAmount) {

    }

    public void Job06(int initialBalance, int withdrawalAmount) {
        this.initialBalance = initialBalance;
        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public void run() {
        synchronized (WithdrawTask.class) {
            if (initialBalance >= withdrawalAmount) {
                initialBalance -= withdrawalAmount;
                System.out.println(Thread.currentThread().getName() + " a retiré " + withdrawalAmount +
                        " : solde restant : " + initialBalance);
            } else {
                System.out.println(Thread.currentThread().getName() + " : Fonds insuffisants.");
            }
        }
    }

    public static void main(String[] args) {
        int initialBalance = 200;
        int withdrawalAmount = 50;

        WithdrawTask withdrawTask = new WithdrawTask(initialBalance, withdrawalAmount);

        Thread thread1 = new Thread(withdrawTask, "Thread 1");
        Thread thread2 = new Thread(withdrawTask, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
