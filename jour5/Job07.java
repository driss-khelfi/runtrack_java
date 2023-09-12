import java.util.stream.Stream;

public class Job07 {
    public static void main(String args[]) {
        Stream<Integer> myStream = Stream.of(25, 10, 22, 40, 15, 5, 30);

        myStream
                .filter(num -> num < 25) // Filtrer les nombres supérieurs à 25
                .forEach(System.out::println); // Afficher les nombres filtrés
    }
}