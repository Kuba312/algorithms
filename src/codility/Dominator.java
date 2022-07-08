package codility;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.*;

//         A[0] = 3    A[1] = 4    A[2] =  3
//         A[3] = 2    A[4] = 3    A[5] = -1
//         A[6] = 3    A[7] = 3
//         result ==> 3 because more than half elements
public class Dominator {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 3, 4, 3, 4, 3, 3, 6, 4, 3}));
    }

    public static int solution(int[] A) {
        var count = new HashMap<Integer, Integer>();
        int len = A.length;
        int index = 0;
        for (int a : A) {
            count.put(a, count.getOrDefault(a, 0) + 1);
            if (count.get(a) > len / 2) return index;
            index++;
        }
        return -1;
    }
}
