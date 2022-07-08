package hackerrank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindtheMedian {
    public static void main(String[] args) {
        System.out.println(findMedian(List.of(5,3,1,2,4)));
    }


    public static int findMedian(List<Integer> arr) {
        // Write your code here
        var list = new ArrayList<>(arr);
        var middleOfList = 0;
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            middleOfList = list.get(list.size() / 2);
        }
        return middleOfList;
    }
}
