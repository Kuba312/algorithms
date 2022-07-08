package dataStructuresAndAlgorithmsCourse.recursion;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(greatestDivisor(8, 4));
    }

    public static int greatestDivisor(int a, int b) {
        if (a < 0 || b < 0) return 0;
        if (b == 0) return a;
        return greatestDivisor(b, a % b);
    }
}
