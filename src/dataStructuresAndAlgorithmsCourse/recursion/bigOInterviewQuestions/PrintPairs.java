package dataStructuresAndAlgorithmsCourse.recursion.bigOInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

//Create a function which prints to the console the pairs from given array
public class PrintPairs {
    public static void main(String[] args) {
        printPairs(new int[]{1,3,4,5});
    }

    public static void printPairs(int[] array) {
        for (int k : array) { // ===> O(N)
            for (int i : array) { // ===> O(N)
                System.out.println(k + ", " + i);
            }
        }
    }
    // result == O(N) * O(N) ===> O(N^2)
}
