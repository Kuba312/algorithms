package repetition;

import java.util.Arrays;

public class SortArraySecondMethod {

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 5, 10, 0, 18};

        System.out.println("Bubble sort: ");
        sort(array);
        System.out.println("\n" + "Reverse: ");
        reverse(array);
    }

    //bubble sort alghoritm
    private static void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int value : array) {
            System.out.print(" " + value);
        }

    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}

