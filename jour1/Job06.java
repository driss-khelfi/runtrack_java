import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Job06 {
    private ArrayList<Float> grades = new ArrayList<Float>();
    private Scanner scanner = new Scanner(System.in); // Déclarez le scanner comme une variable de classe.

    public static void main(String[] args) {
        Job06 school = new Job06();
        String student = "Bob";
        System.out.println("Nom de l'étudiant : " + student);

        while (true) {
            System.out.print("Choisissez une action à effectuer (a: rajouter une note, b: voir la meilleure note, w: voir la pire note, m: voir la moyenne, q: quitter) : ");
            String choixBase = school.scanner.nextLine();

            if (choixBase.equalsIgnoreCase("a")) {
                school.addGrades();
            } else if (choixBase.equalsIgnoreCase("b")) {
                school.bestGrade();
            } else if (choixBase.equalsIgnoreCase("w")) {
                school.worstGrade();
            } else if (choixBase.equalsIgnoreCase("m")) {
                school.averageGrade();
            } else if (choixBase.equalsIgnoreCase("q")) {
                break;
            } else {
                System.out.println("Choix invalide. Veuillez choisir a, b, w, m ou q.");
            }
        }
    }

    public void addGrades() {
        System.out.print("Ajouter une note : ");
        float num1 = scanner.nextFloat();
        grades.add(num1);
    }

    public void bestGrade() {
        if (!grades.isEmpty()) {
            float maxGrade = Collections.max(grades);
            System.out.println("Meilleure note : " + maxGrade);
        } else {
            System.out.println("Aucune note n'a été ajoutée.");
        }
    }

    public void worstGrade() {
        if (!grades.isEmpty()) {
            float minGrade = Collections.min(grades);
            System.out.println("Pire note : " + minGrade);
        } else {
            System.out.println("Aucune note n'a été ajoutée.");
        }
    }

    public void averageGrade() {
        if (!grades.isEmpty()) {
            float sum = 0;
            for (float grade : grades) {
                sum += grade;
            }
            float average = sum / grades.size();
            System.out.println("Moyenne des notes : " + average);
        } else {
            System.out.println("Aucune note n'a été ajoutée.");
        }
    }
}
