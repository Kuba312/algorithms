package dataStructuresAndAlgorithmsCourse.recursion.arrayInteview;

import java.util.HashSet;
import java.util.Set;

public class Unique {
    public static void main(String[] args) {
        System.out.println(isUnique(new int[]{1, 2, 3, 4, 5}));
    }

    public static boolean isUnique(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
