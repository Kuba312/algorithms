package codility;


//      Two positive integers N and M are given. Integer N represents the number of chocolates arranged in a circle,
//      numbered from 0 to N − 1.
//
//        You start to eat the chocolates. After eating a chocolate you leave only a wrapper.
//
//        You begin with eating chocolate number 0. Then you omit the next M − 1 chocolates or
//        wrappers on the circle, and eat the following one.
//
//        More precisely, if you ate chocolate number X,
//        then you will next eat the chocolate with number (X + M) modulo N (remainder of division).
//
//        You stop eating when you encounter an empty wrapper.
//
//        For example, given integers N = 10 and M = 4.
//        ou will eat the following chocolates: 0, 4, 8, 2, 6.
public class ChocolatesByNumbers {
    public static void main(String[] args) {
        System.out.println(gcd(10,4));
        System.out.println(solution(10, 4));
    }

    public static int solution(int N, int M) {
        return N / gcd(N, M);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}
