package dataStructuresAndAlgorithmsCourse.recursion.arrayInteview;

import java.util.*;

public class BestScore {
    public static void main(String[] args) {
        System.out.println(firstSecond(new Integer[]{84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0}));
    }

    public static String firstSecond(Integer[] myArray) {
        var integers = new TreeSet<>(Arrays.asList(myArray));
        var bestScore = 0;
        var bestSecondScore = 0;
        var objects = integers.toArray();
        for (var i = 0; i < objects.length; i++) {
            bestScore = (int) objects[objects.length-1];
            bestSecondScore = (int) objects[objects.length-2];
        }
        return bestScore + " " + bestSecondScore;
    }
}
