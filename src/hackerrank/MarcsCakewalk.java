package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarcsCakewalk {
    public static void main(String[] args) {
        System.out.println(marcsCakewalk(List.of(1, 3, 2)));
    }

    public static long marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        var sortedList = new ArrayList<>(calorie);
        sortedList.sort(Collections.reverseOrder());


        double v = 0;
        double sum =  (0 + (sortedList.get(0) + Math.pow(2, 0)));

        System.out.println(sum);

        return 0;
    }
}
