package Java8_Part2;
import java.util.Optional;
public class Ans4{
    public static void main(String[] args) {
        String name = "Akshay";
        Optional<String> optionalName = Optional.ofNullable(name);
        if (optionalName.isPresent()) {
            System.out.println("Name is: " + optionalName.get());
        } else {
            System.out.println("Name is not available.");
        }
        optionalName.ifPresent(n -> System.out.println("Length of name: " + n.length()));
        String result = optionalName.orElse("Default Name");
        System.out.println("Result: " + result);
    }
}
