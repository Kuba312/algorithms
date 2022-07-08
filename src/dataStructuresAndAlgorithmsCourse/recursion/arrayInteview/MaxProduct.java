package dataStructuresAndAlgorithmsCourse.recursion.arrayInteview;

import java.util.*;
import java.util.stream.Collectors;

public class MaxProduct {
    public static void main(String[] args) {

        System.out.println(maxProduct(new int[]{10, 20, 30, 40, 50}));
    }


    //    public int max(int[] numbers) {
//        int maxValue = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > maxValue) {
//                maxValue = numbers[i];
//            }
//        }
//        return maxValue;
//    }
    //{10,20,30,40,50}==>(40,50)
    public static String maxProduct(int[] intArray) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < intArray.length-1; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > maxProduct) {
                    maxProduct = intArray[i] * intArray[j];
                    pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }
}
