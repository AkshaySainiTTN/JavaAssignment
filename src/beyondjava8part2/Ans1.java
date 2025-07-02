package beyondjava8part2;

public class Ans1 {
    public static void main(String[] args) {
        Education ed = new Education(120,"CS", "MIET");
        System.out.println(ed.branch());
        System.out.println(ed.Clg());
        System.out.println(ed.money());
    }
}
record Education(int money , String branch , String Clg){

}