public class ThreadInterruptionExercice {
    public static void main(String[] args) {
        int sleepSeconds = 6; // Temps total de sommeil en secondes
        long startTime = System.currentTimeMillis();

        // Créez un thread qui dort pendant le temps spécifié
        Thread sleepingThread = new Thread(() -> {
            try {
                System.out.println("Le thread commence à dormir.");
                Thread.sleep(sleepSeconds * 1000); // Convertit les secondes en millisecondes
                System.out.println("Le thread a terminé de dormir.");
            } catch (InterruptedException e) {
                System.out.println("Le thread a été interrompu pendant son sommeil.");
            }
        });

        // Démarrer le thread
        sleepingThread.start();

        // Attendez la moitié du temps spécifié avant d'interrompre le thread
        try {
            Thread.sleep(sleepSeconds * 500); // Attendre la moitié du temps en millisecondes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrompre le thread
        sleepingThread.interrupt();

        // Attendez que le thread se termine
        try {
            sleepingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Temps total écoulé : " + (endTime - startTime) + " ms");
    }
}
