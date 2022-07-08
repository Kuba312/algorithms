import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total numbers: ");
        int length = sc.nextInt();
        int[] inputArray = new int[length];

        System.out.println("Enter integers");
        for (int i = 0; i < length; i++) {
            inputArray[i] = sc.nextInt();
        }
        System.out.println("Enter of number what do you want to find: ");
        int key = sc.nextInt();

        int index = recursiveBinarySearch(inputArray, key);

        if (index == -1) {
            System.out.println(key);
        } else {
            System.out.println("is found in array: " + key + "at index:  " + index);
        }
        sc.close();
    }
//****************************************************************************************************************************
    private static int recursiveBinarySearch(int[] input, int key) {
        return binarySearch(input, 0, input.length - 1, key);

    }
//****************************************************************************************************************************
    private static int binarySearch(int[] array, int start, int end, int target) {
        int middle = (end + start) / 2;
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

