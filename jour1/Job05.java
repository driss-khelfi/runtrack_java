public class Job05 {
    public static void main(String[] args) {
        Job05 dice = new Job05();
        int randomNum1 = dice.rand1();
        int randomNum2 = dice.rand2();
        dice.addition(randomNum1, randomNum2);
    }

        public int rand1() {
        int randomNum1 = (int) (Math.random() * 6) + 1; // Génère un nombre aléatoire entre 1 et 6
        System.out.println("Dé 1 : " + randomNum1);
        return randomNum1; // Retourne la valeur générée
        }

         public int rand2() {
        int randomNum2 = (int) (Math.random() * 6) + 1; // Génère un nombre aléatoire entre 1 et 6
        System.out.println("Dé 2 : " + randomNum2);
        return randomNum2; // Retourne la valeur générée
        }

        public void addition(int randNum1, int randNum2) {
            int sum = randNum1 + randNum2;
            System.out.println("Somme : " + sum);
        }

    }








