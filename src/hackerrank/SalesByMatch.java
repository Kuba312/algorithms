package hackerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SalesByMatch {
    public static void main(String[] args) {

        System.out.println(sockMerchant(9, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        final long[] count = {0};
        ar.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((key, value) -> {
            if (value % 2 == 0) {
                count[0] += value / 2;
            } else {
                count[0] += (value - 1) / 2;
            }
        });

        return Integer.parseInt(Arrays.toString(count).replaceAll("[\\[\\]()]", ""));
    }

}
