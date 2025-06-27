package java8;


//Using (instance) Method reference create and apply add and subtract method and using (Static)
// Method reference create and apply multiplication method for the functional interface created
@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}
class Calculate {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
}
public class Ans2 {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        // refering instance method so need to create an instance first and give refernce of method using instance
        Operation addition = calc::add;
        Operation subtraction = calc::subtract;

        //reference static method
        Operation multiplication = Calculate::multiply;
        System.out.println("Addition: " + addition.apply(10, 5));       // 15
        System.out.println("Subtraction: " + subtraction.apply(10, 5)); // 5
        System.out.println("Multiplication: " + multiplication.apply(10, 5)); // 50
    }
}
