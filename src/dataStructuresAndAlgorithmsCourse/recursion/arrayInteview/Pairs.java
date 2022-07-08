package dataStructuresAndAlgorithmsCourse.recursion.arrayInteview;

import java.util.Arrays;

public class Pairs {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 9, 11, 15}, 20)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ints = null;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ints = new int[]{i, j};
                }
            }
        }
        return ints;
    }
}
