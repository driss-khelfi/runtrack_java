import java.util.Scanner;
public class Job07 {
    private Scanner scanner = new Scanner(System.in); // Déclarez le scanner comme une variable de classe.
    public static void main(String[] args) {

        Job07 shape = new Job07();
        while (true) {
            System.out.println("Choisissez une action à effectuer (s: calculer l'aire d'un carré, c: calculer l'aire d'un cercle, t: calculer l'aire d'un triangle, q: quitter) : ");
            String choixBase = shape.scanner.nextLine();

            if (choixBase.equalsIgnoreCase("s")) {
                shape.squareArea();
            } else if (choixBase.equalsIgnoreCase("c")) {
                shape.circleArea();
            } else if (choixBase.equalsIgnoreCase("t")) {
                shape.triangleArea();

            } else if (choixBase.equalsIgnoreCase("q")) {
                break;
            } else {
                System.out.println("Choix invalide. Veuillez choisir s, c, t ou q.");
            }
        }
    }

        public void squareArea() {
            System.out.println("Entrez la longueur de côté : ");
            float num1 = scanner.nextFloat();
            float area = num1 * num1;
            System.out.println("Aire du carré de côté "+num1+"est de"+area+" cm²");
            scanner.nextLine();
        }

        public void circleArea() {
            System.out.println("Entrez la longueur de rayon : ");
            float num1 = scanner.nextFloat();
            float area = (float) (Math.PI * num1 * num1);
            System.out.println("Aire du cercle de rayon "+num1+"est de"+area+" cm²");
            scanner.nextLine();
        }

        public void triangleArea() {
            System.out.println("Entrez la longueur de la base : ");
            float base = scanner.nextFloat();
            System.out.println("Entrez la longueur de la hauteur : ");
            float height = scanner.nextFloat();
            float area = 0.5f * base * height;
            System.out.println("Aire du triange de base "+base+" et de hauteur "+height+" est de "+area+" cm²");
            scanner.nextLine();
        }
    }


