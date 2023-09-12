
import java.util.stream.Stream;

public class Job05 {
    public static void main(String args[]) {
        Stream<Integer> myStream = Stream.of(25, 12, 35, 46, 18, 50, 11, 20, 50);

        myStream
                .filter(num -> num > 25) // Filtrer les nombres supérieurs à 25
                .forEach(System.out::println); // Afficher les nombres filtrés
    }
}
