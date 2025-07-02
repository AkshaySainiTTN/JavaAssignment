package beyondjava8part2;

public class Ans5 {
    public static void main(String[] args) {
        Person p1 = new Teacher("Arun");
        Person p2 = new Engineer("Ansh");
        Person p3 = new Students("Aarav");
        Person p4 =new NewAdmission("Aman");

        p1.work();
        p2.work();
        p3.work();
        p4.work();
    }
}

// Sealed base class
sealed class Person permits Teacher, Engineer, Students {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is working.");
    }
}

// Non-sealed subclass
non-sealed class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " is teaching in the class.");
    }
}

// Non-sealed subclass
final class Engineer extends Person {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " is in college lab.");
    }
}

// Non-sealed subclass
sealed class Students extends Person permits NewAdmission{
    public Students(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " is studying and attending lectures.");
    }
}

final class NewAdmission extends Students{
    public NewAdmission(String name){
        super(name);
    }
    @Override
    public void work(){
        System.out.println(name + " New Admission is coming.");

    }

}
