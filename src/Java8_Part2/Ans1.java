package Java8_Part2;
import java.util.function.*;

public class Ans1 {

    public static void main(String[] args) {

        Consumer<String> greet = name -> System.out.println("Hello " + name);
        greet.accept("Akshay");

        Supplier<String> supplyMessage = () -> "Welcome to functional interface";
        System.out.println(supplyMessage.get());

        Predicate<Integer> isPositive = number -> number > 0;
        System.out.println(isPositive.test(5));  // true
        System.out.println(isPositive.test(-3)); // false

        Function<String, Integer> getLength = str -> str.length();
        System.out.println(getLength.apply("Java")); // 4

    }
}


