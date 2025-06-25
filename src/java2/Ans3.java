package java2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Ans3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  this is my file path /home/akshay/Downloads/FileRead.txt
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        System.out.print("Enter the word to count: ");
        String targetWord = scanner.nextLine().toLowerCase();
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                    System.out.println("The word '" + targetWord + "' appears " + count + " times.");
                }
            }
        }
                catch (IOException e){
                System.err.println("Error reading the file: " + e.getMessage());
            }


        scanner.close();
    }
}




