package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysDS {
    public static void main(String[] args) {
        System.out.println(reverseArray(List.of(2,3,4,1)));
    }

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        var result = new ArrayList<Integer>(a);
        Collections.reverse(result);
        System.out.println(result);

        return null;
    }
}
