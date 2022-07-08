package dataStructuresAndAlgorithmsCourse.recursion;

public class IsPalindrome {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(String s){
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) stringBuilder.append(chars[i]);
        for (char aChar : chars) stringBuilder2.append(aChar);
        return stringBuilder.toString().equals(stringBuilder2.toString());
    }

}
