package beyondjava1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ans3 {
    public static void main(String[] args) {
        List<String> l1= List.of("Abc","bcd ", "cde");
        Set<String > set1= Set.of("acd","sde");
        Map<Integer,String> mp = Map.of(1,"asd",2,"tre");
        System.out.println(l1);
        System.out.println(set1);
        System.out.println(mp);
    }
}
