package Java8_Part2;


interface MyInterface {
    default void showMessage() {
        System.out.println("Hello from default");
    }
    static void showStaticMessage() {
        System.out.println("Hello from static");
    }
}

class MyClass implements MyInterface {
    @Override
    public void showMessage() {
        System.out.println("Hello from override default method");
    }
}
public class Ans2{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showMessage();
        MyInterface.showStaticMessage();
    }
}
