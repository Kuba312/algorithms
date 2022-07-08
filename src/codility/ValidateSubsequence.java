package codility;

import java.util.*;

public class ValidateSubsequence {

    public static void main(String[] args) {
        boolean validSubsequence = isValidSubsequence(List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(1, 6, -1, 10));
        System.out.println(validSubsequence);
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        var seqIdx = 0;
        for (var integer : array) {
            if (seqIdx == sequence.size()) {
                break;
            }
            if (sequence.get(seqIdx).equals(integer)) {
                seqIdx++;
            }
        }

        return seqIdx == sequence.size();
    }
}
