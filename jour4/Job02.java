public class Job02 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 5) { // Utilisez une boucle while pour répéter l'exécution 5 fois
            System.out.println("En cours d'exécution...");
            try {
                Thread.sleep(1000); // Attendez une seconde entre chaque impression
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Job02 job = new Job02(); // Créez une instance de votre classe Runnable
        Thread thread = new Thread(job); // Créez un thread en passant l'instance Runnable
        thread.start(); // Démarrez le thread
    }
}



