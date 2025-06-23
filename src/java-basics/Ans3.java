import java.util.Scanner;
public class Ans3 {
    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
//we have to show these to user as menu option and user have to select a one number based on that we are calling a function
            System.out.println("******* Menu *******");
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of a Circle");
            System.out.println("3. Exit.");
            System.out.print("Choose an option (1-3): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Take radius input and calculate the area by calling area function
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of circle: " + calculateArea(radius));
                   break;

                case 2:
                    System.out.print("Enter radius: ");
                    double radius2 = scanner.nextDouble();
                    System.out.println("Circumference of circle: " + calculateCircumference(radius2));
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select 1 to 3.");
            }
        }
    }
}

/*
* Write a java program to show following menu to the user:

*******Menu*******
1. Calculate Area of Circle
2. Calculate Circumference of a Circle
3. Exit.
Choose an option (1-3):

Take radius as user input.

Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static  */