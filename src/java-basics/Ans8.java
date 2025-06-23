
public class Ans8 {
    public static void main(String[] args) {
        // Try to load a class that doesn't exist to get ClassNotFoundException
        try {
            Class.forName("UnknownClass"); // Class doesn't exist
        } catch (ClassNotFoundException e) {
            System.out.println("This is  ClassNotFoundException: " + e);
        }

        System.out.println("Next part of code to show class not found at run time ");
        // 2. This will compile fine, but fail at runtime if the .class is deleted
        MissingClass obj = new MissingClass(); // Will cause NoClassDefFoundError at runtime
        obj.display();
    }
}

// This is a helper class you will delete after compiling
class MissingClass {
    void display() {
        System.out.println("Hello from MissingClass");
    }
}
//after compiling the code delete the MissingClass and we get the NoClassFoundError