package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.println(maximumSum(List.of(1L,2L,3L),0));
    }

    public static long maximumSum(List<Long> a, long m) {
        // Write your code here
        var list = new ArrayList<Long>();
        for (int i = 0; i < a.size(); i++) {
            
            list.add(a.get(i));
            System.out.println(list);
        }


        return 0;
    }
}
