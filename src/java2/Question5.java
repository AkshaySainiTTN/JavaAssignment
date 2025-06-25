package java2;
class Singleton {
    private static Singleton instance;
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // Create only once
        }
        return instance;
    }
}
public class Question5 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        // lets confirm that both references point to the same instance
        //as the instance is one so address will be same
        System.out.println("Are both instances same? " + (s1 == s2));
    }
}
