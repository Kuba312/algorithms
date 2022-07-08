package hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class ClosestNumbers {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(closestNumbers(List.of(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470)));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
     //   System.out.println(duration);

    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here

        var newList = new ArrayList<Integer>(arr);
        Collections.sort(newList);
        List<Integer> pairs = new ArrayList<>();
        var min = Integer.MAX_VALUE;
        var diffs = new ArrayList<Integer>();
        for (int i = 0; i < newList.size() - 1; i++) {
            var diff = newList.get(i + 1) - newList.get(i);
            if (diff < min) {
                min = diff;
            }
        }
        for (int i = 0; i < newList.size() - 1; i++) {
            if (newList.get(i + 1) - newList.get(i) == min) {
                pairs.add(newList.get(i));
                pairs.add(newList.get(i + 1));
            }
        }
        return pairs;
    }

}
