package dataStructuresAndAlgorithmsCourse.recursion.arrayInteview;

import java.util.stream.IntStream;

public class SearchInArray {
    public static void main(String[] args) {
        System.out.println(searchInArray(new int[]{1, 2, 3, 4, 5, 6}, 6));
    }

    public static int searchInArray(int[] intArray, int valueToSearch) {
        return IntStream.range(0, intArray.length)
                .filter(i -> valueToSearch == intArray[i])
                .findFirst().orElse(0);
    }
}
