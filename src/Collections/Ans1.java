package Collections;

//  Write Java code to define List.
//Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ans1{
    public static void main(String[] args) {
        List <Integer> MyList = new ArrayList<>();
        MyList.addLast(1);
        MyList.addLast(2);
        MyList.addLast(3);
        MyList.addLast(4);
        MyList.addLast(5);

        Iterator<Integer> iterator = MyList.iterator();
        int sum = 0;

        while (iterator.hasNext()) {
            int number = iterator.next();
            //iterator initially points to null
            sum += number; // add to the sum
        }
//        int sum2 = 0;
//        for (int i = 0; i < MyList.size(); i++) {
//            sum2 += MyList.get(i);
//        }
//        System.out.println("Using loop: " + sum2);


        System.out.println("sum is " + sum);
    }
}
