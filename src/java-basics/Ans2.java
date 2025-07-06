import java.util.Scanner;
public class Ans2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder userInput = new StringBuilder();

        System.out.println("Enter text and to stop enter XDONE");

        while (true) {
            String line = scanner.nextLine();

            // after getting input from the user we will compare
            // if we get XDONE then we will break else we will apend this in out string
            if (line.equals("XDONE")) {
                break;
            }
            // Append the input line to userInput
            userInput.append((line));
            //userInput.append(line).append("\n");
        }

        System.out.println("You entered: \n");
         // System.out.println(userInput);
        System.out.println(userInput.toString());

   //     scanner.close();

    }
}

