package beyondjava8part2;

import java.util.Objects;

public class Ans3 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Akshay", "Btech");
        Student s2 = new Student(1, "Aryan", "Mtech");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
record Student(int id, String name, String classs) {
    public Student {
        Objects.requireNonNull(name);
        Objects.requireNonNull(classs);
        if (id <= 0) {
            throw new IllegalArgumentException("must be positive");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(classs, student.classs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, classs);
    }


}
