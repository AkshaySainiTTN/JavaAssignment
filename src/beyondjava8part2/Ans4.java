package beyondjava8part2;
public class Ans4{
    public static void main(String[] args) {
        Employee e1 = new Manager("Akshay");
        Employee e2 = new Developer("Anuj");
        Employee e3 = new Intern("Akash");

        e1.work();
        e2.work();
        e3.work();
    }
}
sealed class Employee permits Manager, Developer, Intern {
     String name;
    public Employee(String name) {
        this.name = name;
    }
    public void work() {
        System.out.println(name + " is working.");
    }
}
non-sealed class Manager extends Employee {
    public Manager(String name) {
       super(name);
    }
    @Override
    public void work() {
        System.out.println(name + " is managing the team");
    }
}
non-sealed class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }
    @Override
    public void work() {
        System.out.println(name + " is writing code.");
    }
}
non-sealed class Intern extends Employee {
    public Intern(String name) {
        super(name);
    }
    @Override
    public void work() {
        System.out.println(name + " is learning and helping.");
    }
}


