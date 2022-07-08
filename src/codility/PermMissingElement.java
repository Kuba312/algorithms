package codility;

public class PermMissingElement {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 5};
        int solution = solution(array);
        System.out.println(solution);
    }

    //This algorithm returns missing number from array due to array of booleans.
    // This element which has left as a false is correct answer
    public static int solution(int[] a) {
        boolean[] booleans = new boolean[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            booleans[a[i] - 1] = true;
        }
        for (int i = 0; i < booleans.length; i++) {
            if (!booleans[i]) {
                return i + 1;
            }
        }
        return 0;
    }
}
