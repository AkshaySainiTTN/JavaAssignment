package Java8_Part2;
import java.util.Arrays;
import java.util.List;
public class Ans3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,6,3,7,8,2);
        int sum = numbers.stream()
                .filter(n -> n > 5) // Include 5
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of numbers geater than 5 is  " + sum);
    }
}
