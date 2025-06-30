package Java8_Part2;

import java.time.LocalDate;
import java.util.Scanner;

public class Ans6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first date yyyy-mm-dd");
        String date1Str = sc.nextLine();
        System.out.println("Enter second date yyyy-mm-dd");
        String date2Str = sc.nextLine();

        LocalDate date1 = LocalDate.parse(date1Str);
        LocalDate date2 = LocalDate.parse(date2Str);

        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second ");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second ");
        } else {
            System.out.println("Both are same.");
        }
    }
}
