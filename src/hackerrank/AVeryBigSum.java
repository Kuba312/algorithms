package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class AVeryBigSum {
    public static void main(String[] args) {
        long l = aVeryBigSum(List.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L));
        System.out.println(l);
    }

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long count = 0;
        for (Long aLong : ar) {
            count += aLong;
        }
        return count;
    }
}
