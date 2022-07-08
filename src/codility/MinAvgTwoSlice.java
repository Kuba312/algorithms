package codility;

public class MinAvgTwoSlice {
    public static void main(String[] args) {
        int solution = solution(new int[]{4, 2, 2, 5, 1, 5, 8});
        System.out.println(solution);
    }


    public static int solution(int[] A) {
        int N = A.length;

        // test for every possible slice of length 2 or 3
        double min = Double.MAX_VALUE;
        int minIndex = 0;
        for (int p = 0; p < N - 1; p++) {
            double sum = A[p];
            for (int q = p + 1; q <= p + 2 && q < N; q++) {
                // only slices length 2 or 3 (any larger slice is made up of smaller ones, so it can't have smaller average)
                sum += A[q];
                double avg = sum / (q - p + 1);
                //Jeśli nowa średnia jest mniejsza niż najmniejsza średnia s poprzednich części zbiorów liczb to ustaw ją jako min
                // i ustaw jako index tego zbioru
                if (avg < min) {
                    min = avg;
                    minIndex = p;
                }
            }
        }
        return minIndex;
    }
}
