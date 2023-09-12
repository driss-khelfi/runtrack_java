
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
public class Job02 {

    public static void main(String args[]) {
        HashMap<String, String> animals = new HashMap<String, String>();
        animals.put("chat ", "chat");
        animals.put("chien ", "chien");
        animals.put("chat ", "chat");
        animals.put("oiseau ", "oiseau");

        for (String i : animals.keySet()) {
            System.out.println(i);


        }
    }
}





