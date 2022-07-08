package hackerrank;

import java.util.List;

public class AngryProfessor {
    public static void main(String[] args) {
        System.out.println(angryProfessor(3, List.of(-2, -1, 0, 1, 2)));
    }

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        var count = 0;
        for (Integer i : a) {
            if (i <= 0) count++;

        }
        return ((count >= k) ? "NO" : "YES");
    }

}
