package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDigits {
    public static void main(String[] args) {
        int digits = findDigits(1012);
        System.out.println(digits);
    }

    public static int findDigits(int n) {
        // Write your code here
        var numbersFromN = Arrays
                .stream(String.valueOf(n).split(""))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        var counter = 0;
        for (Integer integer : numbersFromN) {
            if (!integer.equals(0) && n % integer == 0) {
                counter++;
            }
        }
        return counter;
    }
}
