package hackerrank;

import java.util.List;

public class SimpleArraySum {
    public static void main(String[] args) {
        int i = simpleArraySum(List.of(1, 2, 3, 4, 10, 11));
        System.out.println(i);
    }

    public static int simpleArraySum(List<Integer> ar) {
        var count = 0;
        for (Integer integer : ar) {
            count +=integer;
        }
        return count;
    }

}
