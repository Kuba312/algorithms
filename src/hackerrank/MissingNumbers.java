package hackerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MissingNumbers {
    public static void main(String[] args) {
        System.out.println(missingNumbers(List.of(203, 204, 205, 206, 207, 208, 203, 204, 205, 206), List.of(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204)));
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        var brrList = new ArrayList<Integer>(brr);
        var arrList = new ArrayList<Integer>(arr);

        var count = new HashMap<Integer, Integer>();
        for (Integer integer : brrList) {
            count.merge(integer, 1, Integer::sum);
        }
        for (Integer integer : arrList) {
            count.merge(integer, -1, Integer::sum);
        }
        count.values().removeIf(i -> i == 0);

        return new ArrayList<>(new TreeSet<>(count.keySet()));
    }

}
