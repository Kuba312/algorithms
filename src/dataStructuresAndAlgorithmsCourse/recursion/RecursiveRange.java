package dataStructuresAndAlgorithmsCourse.recursion;

import java.util.stream.IntStream;

public class RecursiveRange {
    public static void main(String[] args) {
        System.out.println(recursiveRange(5));
    }

    public static int recursiveRange(int num) {
        return IntStream.range(0, num + 1).sum();
    }

    public static int recursiveRange2(int num) {
        if (num < 0 || num ==0) return 0;
        return num + recursiveRange2(num - 1);
    }
}
