package java2;
import java.io.FileWriter;
import java.util.*;

class User {
    String firstname;
    String lastname;
    int age;
    String phonenumber;

    // Constructor to assign values
    public User(String firstname, String lastname, int age, String phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    // Overriding the toString method Method to return user data as string
    public String toString() {
        return firstname + " " + lastname + ", Age: " + age + ", Phone: " + phonenumber;
    }
}


public class Ans2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("users.txt", true); // true = append mode

            while (true) {
                System.out.print("Enter First Name ");
                String fname = sc.nextLine();
                System.out.print("Enter Last Name");
                String lname = sc.nextLine();
                System.out.print("Enter Age");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("Enter Phone Number");
                String phone = sc.nextLine();
                User user = new User(fname, lname, age, phone);
                writer.write(user.toString() + "\n");

                //continuew to next vlue
                System.out.print("Continue creating users?Type QUIT to exit: ");
                String response = sc.nextLine();

                if (response.equalsIgnoreCase("Quit")) {
                    System.out.println("Exiting");
                    break;
                }
            }

            writer.close(); // always close resources
        } catch (Exception e) {
            System.out.println("An error occurred while writing to file.");
        }

       // sc.close();
    }
}