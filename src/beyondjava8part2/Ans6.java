package beyondjava8part2;

import java.util.*;

public class Ans6{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("One");
        list.addLast("Three");
        list.add(1, "Two");
        System.out.println("List: " + list);
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first & last: " + list);
        System.out.println("Reversed List: " + list.reversed());
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");


        System.out.println("Set: " + set);

        System.out.println("First Element: " + ((SequencedSet<String>) set).getFirst());
        System.out.println("Last Element: " + ((SequencedSet<String>) set).getLast());

        ((SequencedSet<String>) set).removeFirst();
        ((SequencedSet<String>) set).removeLast();
        System.out.println("After removing first & last: " + set);

        System.out.println("Reversed Set: " + ((SequencedSet<String>) set).reversed());
    }
}
