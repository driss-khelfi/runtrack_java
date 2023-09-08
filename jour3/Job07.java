import java.util.ArrayList;
import java.util.Optional;

public class Job07 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Hello World!");
        myList.add(null);

        myList.forEach((n) -> {
            Optional<String> optionalString = Optional.ofNullable(n);
            if (optionalString.isPresent()) {
                System.out.println(optionalString.get().length());
            } else {
                System.out.println("Chaîne vide");
            }
        });
    }
}
