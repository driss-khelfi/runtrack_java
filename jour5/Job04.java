
import java.util.Collections;
import java.util.ArrayList;

public class Job04 {

    public static void main(String args[]) {
        ArrayList<String> myString = new ArrayList<String>();
        myString.add("Hello World!");
        myString.add("What a nice day, how are you today ?");

        for (String n : myString) {
            if (n.length() > 25) {
                System.out.println("La chaîne "+n+" a une longueur supérieure à 25");
            }
            else {
                System.out.println("La chaîne "+n+" a une longueur inferieure à 25");
            }

            ;


        }
    }
}


