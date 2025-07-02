package beyondjava8part2;

import java.util.Objects;

public class Ans2 {
    public static void main(String[] args) {
        educate ed = new educate(1,"Akshay");
        System.out.println(ed);
        educate ed2 = new educate(2,null);
        System.out.println(ed2);
    }
}
record educate(int id , String name) {
    public educate {
        Objects.requireNonNull(name, "it cant be null");
        Objects.requireNonNull(id, "cant be null");
    }
}
