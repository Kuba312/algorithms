package repetition;

import java.util.Scanner;

public class LinearSearchLearn {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a length of array: ");

        int length = s.nextInt();

        int[] input = new int[length];

        System.out.println("Give a numbers: ");

        for (int i = 0; i < length; i++) {
            input[i] = s.nextInt();
        }

        System.out.println("Give a number what u search: ");
        int target = s.nextInt();

        int index = linearSearch(input, target);

        if (index == -1) {
            System.out.println(target);
        } else {
            System.out.println(target + " is at index " + index);

        }
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
