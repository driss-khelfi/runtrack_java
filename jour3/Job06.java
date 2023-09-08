import java.util.ArrayList;


public class Job06 {
    //Ne pas suivre l'output qui est faux, se référer à la consigne
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        ArrayList<String> myNewList = new ArrayList<String>();
        myList.add("ant");
        myList.add("ape");
        myList.add("cat");
        myList.add("axe");

        myList.forEach((n) ->{
                if (n.length()==3){
                    if( n.charAt(0)=='a')
                        myNewList.add(n);
                    }
        });
        System.out.print("Mots filtrés:" +myNewList);

    }
}
