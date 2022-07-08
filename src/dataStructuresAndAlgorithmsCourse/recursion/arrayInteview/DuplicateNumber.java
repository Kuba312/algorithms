package dataStructuresAndAlgorithmsCourse.recursion.arrayInteview;

import java.util.*;
import java.util.stream.Collectors;


public class DuplicateNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[]{1, 1, 2, 3, 4, 5, 5})));
    }

    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).boxed()
                .collect(Collectors.toSet())
                .stream().mapToInt(Number::intValue).toArray();
    }
}
