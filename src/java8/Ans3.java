package java8;

//Implement multiple inheritance with default method inside interface.
interface A {

    default void show() {
        System.out.println("hello from A");
    }
}
interface B {
    default void show() {
        System.out.println("hello from B ");
    }
}
class MyClass implements A, B {
    // we need to override show method as there is conflict
    @Override
    public void show() {
        System.out.println("Hello from conflict resolve ");
    }
}
public class Ans3{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}
