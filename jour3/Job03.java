import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Job03 {
    public static void main(String args[]) {
        HashMap<Integer, String> students = new HashMap<Integer, String>();

        students.put(191, "Anna");
        students.put(101, "Pierre");
        students.put(143, "Lea");
        students.put(102, "Marie");
        students.put(137, "Paul");
        students.put(103, "Jean");

        List<Integer> keys = new ArrayList<>(students.keySet());
        Collections.sort(keys);

        for (Integer key : keys) {
            System.out.println( key + ": " + students.get(key));
        }
    }
    }



