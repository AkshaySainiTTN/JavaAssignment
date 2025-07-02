package beyondjava1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ans4 {
    public static void main(String[] args) {
        List<String> list = Stream.of("A", "B", "C")
                .collect(Collectors.toUnmodifiableList());

        //if i try to add an element it will show error
//        list.add("H");

    }
}
