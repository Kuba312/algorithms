import java.util.Scanner;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {

        int[] ints = {1, 3, 4, 5, 6, 7, 4, 23};


        int key = 7;

        int index = linearSearch(ints, key);

        if (index == -1) {
            System.out.println(key);
        } else {
            System.out.println("The key: " + key + " has index: " + index);

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
