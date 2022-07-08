package codility;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] ints = new int[]{3, 2, 3, 2, 4};
        int solution = solution(ints);
        System.out.println(solution);
    }

    //This algorithm adds values inn array from left and right side while they meet together.
    //Next They should minus by themself and return the smallest abs value from d
    public static int solution(int[] array) {
        int[] leftSum = new int[array.length];
        int[] rightSum = new int[array.length];

        leftSum[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            leftSum[i] = leftSum[i - 1] + array[i];
        }

        rightSum[array.length - 1] = array[array.length - 1];
        for (int i = array.length - 2; i > 0; i--) {
            rightSum[i] = rightSum[i + 1] + array[i];
        }

        int best = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            int diff = Math.abs(leftSum[i] - rightSum[i + 1]);
            if (diff < best){
                best = diff;
            }
        }
        return best;
    }
}
