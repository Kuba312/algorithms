package repetition;

import java.util.Scanner;

public class BinarySearchLearn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = sc.nextInt();
        System.out.println("Enter the integers: ");
        int[] inputArray = new int[length];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = sc.nextInt();
        }


        System.out.println("Enter the number what do you search: ");
        int key = sc.nextInt();

        int index = recursiveSearch(inputArray, key);

        if (index == -1) {
            System.out.println(key);
        } else {
            System.out.println(key + " at index: " + index);
        }


    }

    public static int recursiveSearch(int[] array, int target) {
        return binarySearch(array, 0, array.length - 1, target);
    }

    private static int binarySearch(int[] array, int start, int end, int target) {
        int middle = (start + end) / 2;
        if (end < start) {
            return -1;
        }
        if (target == array[middle]) {
            return middle;
        } else if (target < array[middle]) {
            return binarySearch(array, start, middle - 1, target);
        } else {
            return binarySearch(array, middle + 1, end, target);
        }
    }


}
