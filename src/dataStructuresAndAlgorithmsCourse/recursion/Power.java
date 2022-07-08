package dataStructuresAndAlgorithmsCourse.recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(powerOfNumber(2, 4));
    }

    public static int powerOfNumber(int x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        return x * powerOfNumber(x, n - 1);
    }
}
