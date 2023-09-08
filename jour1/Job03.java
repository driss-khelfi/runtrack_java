import java.util.Scanner;
public class Job03 {

    public  static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        Job03 calc = new Job03();

        System.out.print("Entrez le premier nombre:");
        float num1 = myObj.nextFloat();
        System.out.print("Entrez le deuxième nombre:");
        float num2 = myObj.nextFloat();

        System.out.println(num1);
        System.out.println(num2);
        calc.addition(num1, num2);
        calc.substraction(num1, num2);
        calc.multiplication(num1, num2);
        calc.division(num1, num2);

    }

    public  void addition(float num1, float num2) {
        float sum =  num1 + num2;
        System.out.println("Somme:"+ sum);


    }

    public  void substraction(float num1, float num2) {
        float sum =  num1 - num2;
        System.out.println("Différence:"+ sum);


    }

    public  void multiplication(float num1, float num2) {
        float sum =  num1 * num2;
        System.out.println("Produit:"+ sum);


    }

    public  void division(float num1, float num2) {
        float sum =  num1 / num2;
        System.out.println("Quotient:"+ sum);


    }

}

