import java.util.Scanner;

public class Job04 {
    float account = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Job04 bank = new Job04();

        System.out.println("Solde actuel : " + bank.account + "€");

        while (true) { // Utilisation d'une boucle pour répéter les actions
            System.out.print("Choisissez une action à effectuer (w: retrait,  d: dépôt, r:consulter, q: quitter) : ");
            String choixBase = scanner.nextLine();

            if (choixBase.equalsIgnoreCase("d")) {
                bank.deposit(scanner);
            } else if (choixBase.equalsIgnoreCase("w")) {
                bank.withdraw(scanner);
            } else if (choixBase.equalsIgnoreCase("r")) {
                bank.read(scanner);
            } else if (choixBase.equalsIgnoreCase("q")) {
                break; // Quitter la boucle si l'utilisateur choisit de quitter
            } else {
                System.out.println("Choix invalide. Veuillez choisir  d, w, r ou q.");
            }
        }
    }

    public void deposit(Scanner scanner) {
        System.out.print("Choisissez la somme à déposer : ");
        float num1 = scanner.nextFloat();
        account += num1;
        System.out.println(num1 + "€ déposés. Nouveau solde : " + account + "€");
    }

    public void withdraw(Scanner scanner) {
        System.out.print("Choisissez la somme à retirer : ");
        float num1 = scanner.nextFloat();
        account -= num1;
        if (account >= 0) {
            System.out.println(num1 + "€ retirés. Nouveau solde : " + account + "€");
        } else {
            System.out.println("Tentative de retrait de " + num1 + "€... Solde insuffisant");
        }
    }

    public void read(Scanner scanner) {
        System.out.println("Votre solde actuel est de: "+account+"€");
    }
}
