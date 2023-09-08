import java.util.Scanner;

public class Job01 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        System.out.println("java Hello World");
        System.out.println("Veuillez saisir votre nom:");
        userName = myObj.nextLine();

        System.out.println("Hello, " + userName+"!");
    }
}
