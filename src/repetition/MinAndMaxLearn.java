package repetition;

import java.util.Arrays;

public class MinAndMaxLearn {
    public static void main(String[] args) {
        int[] numbersToFindValue = {1, 4, 6, 7, 9, 10, 102, 123, 450, 132, 187, 5, 0,};

        System.out.println("Max value: " + findMax(numbersToFindValue));
        System.out.println("Min value: " + findMin(numbersToFindValue));
        sort(numbersToFindValue);
        reverseArray(numbersToFindValue);
        System.out.println("Bubble sort:");
        sort2(numbersToFindValue);

    }

    private static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("\n" + "Reverse array: " + Arrays.toString(array));
    }

    private static void sort(int[] numbersToFindValue) {
        Arrays.sort(numbersToFindValue);
        for (int i = 0; i < numbersToFindValue.length; i++) {
            System.out.print(numbersToFindValue[i] + ", ");

        }
    }

    //Bubble sort
    private static void sort2(int[] array) {
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

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static int findMax(int[] ints) {
        int maxValue = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > maxValue) {
                maxValue = ints[i];
            }
        }
        return maxValue;
    }

    public static int findMin(int[] ints) {
        int minValue = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < minValue) {
                minValue = ints[i];
            }
        }
        return minValue;
    }


}

