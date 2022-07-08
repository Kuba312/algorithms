package dataStructuresAndAlgorithmsCourse.recursion;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int rec = factorial.factorial(24);
        System.out.println(rec);
    }

    //Factorial is for example 3! = 3 * 2 * 1 = 6;
    // In this method we use recursion instead of iteration. We evoke this method itself
    // and we keep state of representing number in memory
    public int factorial(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
