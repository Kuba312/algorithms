package hackerrank;

import java.util.List;

public class IntrotoTutorialChallenges {
    public static void main(String[] args) {
        System.out.println(introTutorial(4,List.of(1, 4, 5, 7, 9, 12)));
    }

    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
        var result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(V)) {
                result = i;
            }
        }
        return result;
    }
}
