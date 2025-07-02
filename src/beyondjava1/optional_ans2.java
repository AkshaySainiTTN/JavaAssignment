package beyondjava1;

import java.util.Optional;

public class optional_ans2 {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Akshay");
        Optional<Integer> list = Optional.of(1);
        list.stream().forEach(System.out::println);
        name.stream()
                .forEach(System.out::println);

    }
}
