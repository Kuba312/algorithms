package hackerrank;


import java.util.*;

public class CompareTheTriplets {
    public static void main(String[] args) {
        var integers = compareTriplets(List.of(17, 28, 30), List.of(99, 16, 8));
        System.out.println(integers);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        var pointsAlice = 0;
        var pointsBob = 0;
        var points = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                pointsAlice++;
            } else if (a.get(i) < b.get(i)) {
                pointsBob++;
            }
        }
        points.add(pointsAlice);
        points.add(pointsBob);
        return points;
    }

}
