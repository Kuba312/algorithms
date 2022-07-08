package hackerrank;

import java.util.*;

public class PickingNumbers {

    public static void main(String[] args) {

        System.out.println(pickingNumbers(List.of(1, 1, 2, 2, 4, 4, 5, 5, 5)));
    }

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int[] frequency = new int[101];
        var result = Integer.MIN_VALUE;

        for (Integer index : a) {
            frequency[index]++;
        }
       // System.out.println(Arrays.toString(frequency));

        for (int i = 1; i <= 100; i++) {
            result = Math.max(result, frequency[i] + frequency[i - 1]);
        }
        return result;
    }
}
