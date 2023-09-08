
import java.util.ArrayList;
import java.util.Collections;

public class Job02 {

    public static void main(String args[]) {

        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> myNewList = new ArrayList<>();

        myList.add("chat");
        myList.add("chien");
        myList.add("chat");
        myList.add("oiseau");
        myList.add("poisson");
        myList.add("oiseau");
        System.out.println(myList);

        for (int i = 0; i < myList.size(); i++) {
            for (int j = 0; j < myList.size(); j++) {
                if (myList.get(i) == myList.get(j)) {
                    myList.remove(myList.get(i));
                }
            }
        }
        System.out.println(myList);
    }
}




