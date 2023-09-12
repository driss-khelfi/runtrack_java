
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
public class Job03 {

    public static void main(String args[]) {
        HashMap<String, String> nom = new HashMap<String, String>();
        HashMap<String, String> age = new HashMap<String, String>();
        HashMap<String, String> ville = new HashMap<String, String>();
        nom.put("nom: ", "Jean");
        age.put("age: ", "25");
        ville.put("ville: ", "Paris");


        for(String i :nom.keySet()){
            System.out.println( i  + nom.get(i));
        }
        for(String i :age.keySet()){
            System.out.println( i  + age.get(i));
        }
        for(String i :ville.keySet()){
            System.out.println( i  + ville.get(i));
        }
    }
}

