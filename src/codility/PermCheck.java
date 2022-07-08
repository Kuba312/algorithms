package codility;

//This alghoritm checks if array contains permutation
public class PermCheck {
    public static void main(String[] args) {

        int[] ints = new int[]{1, 2, 3, 4, 5};
        int solution = solution(ints);
        System.out.println(solution);

    }

    public static int solution(int[] a) {
        boolean[] result = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            int index = a[i] - 1;
            if (index > a.length - 1) {
                return 0;
            }
            if (!result[index]) {
                result[index] = true;
            } else {
                return 0;
            }
        }
        return 1;
    }

}
