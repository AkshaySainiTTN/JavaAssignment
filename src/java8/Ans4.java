package java8;
//  implement constructor reference
interface Creator {
    Dummy create();
}
class Dummy {
    Dummy() {
        System.out.println("Dummy constructor called");
    }

    void show() {
        System.out.println("Hello from Dummy object");
    }
}
public class Ans4 {
    public static void main(String[] args) {
        Creator creator = Dummy::new;
        Dummy obj = creator.create();
        obj.show();
    }
}