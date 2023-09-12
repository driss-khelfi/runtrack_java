import java.util.stream.Stream;
public class Job06 {
    public static void main(String args[]) {

        Stream<String> myStream = Stream.of("alice","bob", "charlie");
        myStream
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }


}
