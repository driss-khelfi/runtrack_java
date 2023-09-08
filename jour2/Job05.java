public class Job05 {
    String marque = "Peugeot";
    String couleur = "Rouge";
    int maxSpeed = 100;
    int currentSpeed = 0;

    public static void main(String[] args) {
        Job05 car = new Job05();
        car.carStart();
        car.carSpeedUp();
        car.carSpeedUp();
        car.carSpeedUp();
        car.carSpeedUp();
        car.carSpeedUp();
        car.carSpeedUp();
    }

    public void carStart() {
        System.out.println("La voiture démarre!");
        currentSpeed += 10; // Utilisation de += pour augmenter la vitesse actuelle de 10 km/h.
    }

    public void carSpeedUp() {
        try {
            SpeedUp(20);
            System.out.println("La vitesse est maintenant de " + currentSpeed + " km/h.");
        } catch (VitesseException e) {
            System.out.println("Erreur: Vitesse Trop élevée!");
        }
    }

    public void carBrake() {
        currentSpeed = 0;
        System.out.println("La voiture s'arrête. Vitesse réinitialisée à " + currentSpeed + " km/h.");
    }

    public void SpeedUp(int speedIncrease) throws VitesseException {
        if (currentSpeed + speedIncrease > maxSpeed) {
            throw new VitesseException();
        }
        currentSpeed += speedIncrease;
    }

    class VitesseException extends Exception {
        // Vous pouvez personnaliser cette classe d'exception si nécessaire.
    }
}
