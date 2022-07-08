package dataStructuresAndAlgorithmsCourse.recursion.arrayInteview;

public class SumOfDiagonal {

    public int sumDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
        return sum;
    }
}
