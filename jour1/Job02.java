public class Job02 {
    String marque = "Peugeot";
    String couleur = "Rouge";
    int speed = 150;
    int currentSpeed = 0;


    public  static void main(String[] args) {
        Job02 car = new Job02();
        //System.out.println(car.marque);
        //System.out.println(car.couleur);
        //System.out.println(car.speed);
        //System.out.println(car.currentSpeed);
        car.carStart();
        car.carSpeedUp();
        car.carSpeedUp();
        car.carBrake();



    }
    public  void carStart() {

        System.out.println("La voiture démarre!");
        int currentSpeed =+ 10;



    }

    public  void carSpeedUp() {

        currentSpeed += 10;
        System.out.println("La vitesse est maintenant de "+currentSpeed+" km/h.");
    }

    public  void carBrake() {

        currentSpeed = 0;
        System.out.println("La voiture s'arrête. Vitesse réinitialisée à "+currentSpeed+" km/h.");
    }






}

