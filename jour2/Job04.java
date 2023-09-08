import java.util.Scanner;

public class Job04 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        Job04 calc = new Job04();

        System.out.print("Entrez le premier nombre:");
        float num1 = myObj.nextFloat();
        System.out.print("Entrez le deuxième nombre:");
        float num2 = myObj.nextFloat();

        System.out.println(num1);
        System.out.println(num2);

        try {
            calc.division(num1, num2);
        } catch (DivisionParZeroException e) {
            System.out.println("Erreur: Division par zéro.");
        }
    }

    public void division(float num1, float num2) throws DivisionParZeroException {
        if (num2 == 0) {
            throw new DivisionParZeroException();
        }

        float sum = num1 / num2;
        System.out.println("Quotient: " + sum);
    }
}

class DivisionParZeroException extends Exception {


}
