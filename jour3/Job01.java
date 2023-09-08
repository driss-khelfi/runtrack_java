import java.util.ArrayList;
import java.util.Collections;
public class Job01 {

    public static void main (String args[])
    {
        ArrayList<Integer> myList = new ArrayList<>();
        int evenNumberSum=0;

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        System.out.println(myList);
        for (int i = 0; i < myList.size(); i++){
            if (myList.get(i) % 2==0) {
                evenNumberSum += myList.get(i);
            }
            }
        System.out.println(evenNumberSum);
        }
    }


