import java.util.Arrays;

public class ReverseArray {


    public static void main(String[] args) {

        int[] ints = {1, 2, 3};

        for (int i = 0; i < ints.length / 2; i++) {
            int tmp = ints[i];
            ints[i] = ints[ints.length - i - 1];
            ints[ints.length - i - 1] = tmp;
        }


        String[] cars = {"Volvo", "BMW", "Fordaq", "Mazdaaa"};
        Arrays.sort(cars, (a, b)->Integer.compare(a.length(), b.length()));
        System.out.println(Arrays.toString(cars));
    }

}
