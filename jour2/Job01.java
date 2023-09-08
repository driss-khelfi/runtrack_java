import java.util.Scanner;


public class Job01 {
    float mainAccount = 100;
    float savingAccount = 200;
    float interestRate = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Job01 bank = new Job01();

        System.out.println("Solde actuel : " + bank.mainAccount + "€");

        while (true) { // Utilisation d'une boucle pour répéter les actions
            System.out.print("Choisissez une action à effectuer (w: retrait,  d: dépôt, r:consulter, i: ajouter de l'interêt, q: quitter) : ");
            String choixBase = scanner.nextLine();

            if (choixBase.equalsIgnoreCase("d")) {
                bank.deposit(scanner);
            } else if (choixBase.equalsIgnoreCase("w")) {
                bank.withdraw(scanner);
            } else if (choixBase.equalsIgnoreCase("r")) {
                bank.read(scanner);
            } else if (choixBase.equalsIgnoreCase("i")) {
                bank.interest(scanner);
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
        mainAccount += num1;
        System.out.println(num1 + "€ déposés. Nouveau solde : " + mainAccount + "€");
    }

    public void withdraw(Scanner scanner) {
        System.out.print("Choisissez la somme à retirer : ");
        float num1 = scanner.nextFloat();
        mainAccount -= num1;
        if (mainAccount >= 0) {
            System.out.println(num1 + "€ retirés. Nouveau solde : " + mainAccount + "€");
        } else {
            System.out.println("Tentative de retrait de " + num1 + "€... Solde insuffisant");
        }
    }
    public void interest(Scanner scanner) {
        System.out.print("Ajout de l'interêt : ");
        float oldSaving = savingAccount;
        savingAccount += savingAccount*(interestRate/100);
        float diffSaving = savingAccount - oldSaving;


        System.out.println("Intrêts ajoutés:"+ diffSaving+" Nouveau solde : " + savingAccount + "€");
    }



    public void read(Scanner scanner) {
        System.out.println("Votre solde du compte courant est de: "+mainAccount+"€");
        System.out.println("Votre solde du compte épargne est de: "+savingAccount+"€");
    }
}



