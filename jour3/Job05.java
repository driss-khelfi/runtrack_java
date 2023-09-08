
import java.util.ArrayList;


public class Job05 {
    //Ne pas suivre l'output qui est faux, se référer à la consigne
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(2);
        myList.add(4);
        myList.add(6);
        myList.add(3);
        myList.add(8);
        myList.forEach((n) ->{
            n *= 2;
            if (n>10){
                System.out.println(n);
            }

        });


    }
}
