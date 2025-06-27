package java8;
@FunctionalInterface
interface CompareTwoNumbers {
    boolean isGreater(int a, int b);
}
// create functional interface to increment a number, to concat , to convert string to upper case and
@FunctionalInterface
interface IncrementNumber {
    int increment(int a);
}
@FunctionalInterface
interface ConcatStr {
    String join(String s1, String s2);
}
@FunctionalInterface
interface ToUpperCase {
    String convert(String str);
}

public class Ans1{
    public static void main(String[] args) {
        CompareTwoNumbers compare = (a, b) -> a > b;
        System.out.println("is 5greater than 7 " + compare.isGreater(5, 7));
        IncrementNumber increment = a -> a + 1;
        System.out.println("increment a given number " + increment.increment(5));
        ConcatStr concat = (s1, s2) -> s1 + s2;
        System.out.println("Concat " + concat.join("namaste", "duniya"));
        ToUpperCase upper = str -> str.toUpperCase();
        System.out.println("Uppercase " + upper.convert("namaste duniya"));
    }
}
