import java.util.Scanner;

public class Ans7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number to divide 100: ");
            int num = scanner.nextInt();
            int result = 100 / num; // if divided by 0 it will throw arithmetic exception
            System.out.println("Result: " + result);
            String text = null;
            System.out.println("Text length: " + text.length()); // May throw NullPointerException

        } catch (ArithmeticException | NullPointerException e) {
            // Multi-catch block: catches both exceptions
            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            // Finally block: always runs
            System.out.println("This block always runs until we add ");
            scanner.close();
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
