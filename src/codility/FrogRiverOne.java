package codility;

import java.util.*;

public class FrogRiverOne {
    public static void main(String[] args) {

    }

    public static int solution(int positionOfFrog, int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= positionOfFrog)
                if (!map.containsKey(array[i])) map.put(array[i], i);
                else if (i < map.get(array[i])) map.put(array[i], i);
        }

        for (int i = 1; i <= positionOfFrog; i++) {
            if (!map.containsKey(i)) return -1;
        }

        int max = 0;
        for (int i : map.values())
            if (i > max) max = i;
        return max;
    }
}

