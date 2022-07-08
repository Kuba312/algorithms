package dataStructuresAndAlgorithmsCourse.recursion;

public class FirstUppercase {
    public static void main(String[] args) {
        System.out.println(first("asdSasds"));
    }

    static char first(String str) {
        char[] chars = str.toCharArray();
        for (char aChar : chars)
            if (aChar == Character.toUpperCase(aChar))
                return aChar;
        return 0;
    }
}
