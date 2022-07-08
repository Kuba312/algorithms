package hackerrank;

import java.util.List;

public class DiagonalDifference {


    public static int diagonalDifference(List<List<Integer>> arr) {
        var mainSum = 0;
        var secondarySum = 0;
        for (int row = 0; row < arr.size(); row++) {
            for (int col = 0; col < arr.get(row).size(); col++) {
                if (row == col) {
                    mainSum += arr.get(row).get(col);
                }
                if (row + col == arr.size() - 1) {
                    secondarySum += arr.get(row).get(col);
                }
            }
        }
        return Math.abs(mainSum - secondarySum);
    }

}
