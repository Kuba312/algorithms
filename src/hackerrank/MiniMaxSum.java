package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// input:  [1, 3, 5, 7, 9] ==> min sum: 1 + 3 + 5 + 7 = 16; max sum: 3 + 5 + 7 + 9 = 24

public class MiniMaxSum {
    public static void main(String[] args) {
        miniMaxSum(List.of(7, 69, 2, 221, 8974));
    }

    public static void miniMaxSum(List<Integer> arr) {
        long max = 0;
        long min = 0;
        var integers = new ArrayList<>(arr);
        Collections.sort(integers);
        for (int i = 0, j = integers.size() - 1; i < integers.size() - 1; i++, j--) {
            min += integers.get(i);
            max += integers.get(j);
        }
        System.out.print(min + " " + max);
    }
}



