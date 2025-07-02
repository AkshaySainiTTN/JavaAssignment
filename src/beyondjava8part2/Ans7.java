package beyondjava8part2;
import java.util.*;
public class Ans7 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(2, "B");
        map.put(3, "C");

        ((SequencedMap<Integer, String>) map).putFirst(1, "A");
        ((SequencedMap<Integer, String>) map).putLast(4, "D");

        System.out.println(map);
        System.out.println(((SequencedMap<Integer, String>) map).firstEntry());
        System.out.println(((SequencedMap<Integer, String>) map).lastEntry());

        ((SequencedMap<Integer, String>) map).pollFirstEntry();
        ((SequencedMap<Integer, String>) map).pollLastEntry();

        System.out.println(map);
        System.out.println(((SequencedMap<Integer, String>) map).reversed());
    }
}
