package codility;


import java.util.HashSet;
import java.util.Set;



public class AbsDistinct {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-5, -3, -1, 0, 3, 6}));
    }

    public static int solution(int[] A) {
        Set<Integer> integers = new HashSet<>();
        for (int j : A) {
            integers.add(Math.abs(j));
        }
        return integers.size();
    }
}
