package dataStructuresAndAlgorithmsCourse.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int i = sumOfDigits(111);
        System.out.println(i);
    }


    public static int sumOfDigits(int n) {
        if (n == 0 || n < 0) return 0;
        return n % 10 + sumOfDigits( n / 10);
    }
}
