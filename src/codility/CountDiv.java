package codility;

public class CountDiv {
    public static void main(String[] args) {
        int solution = solution(5, 11, 2);
        System.out.println(solution);

    }

    //For example, for A = 6, B = 11 and K = 2, your function should return 3,
    // because there are three numbers divisible by 2 within
    // the range [6..11], namely 6, 8 and 10
    public static int solution(int A, int B, int K) {
        //A=5, B=11, K=2;
        //      11/2     5/2        5%2
        //        5   -    2     +     0  =  3
        return (B / K) - (A / K) + (A % K == 0 ? 1 : 0);
    }
}





//        int length = B - A + 1;
//        int[] result = new int[length];
//        int d = A - 1;
//        for (int i = 0; i <= result.length - 1; i++) {
//            d++;
//            result[i] = d;
//        }
//        int k = 0;
//        List<Integer> resultNumbers = new ArrayList<>();
//        for (int i : result) {
//            if (i % K == 0) {
//                k = i;
//                resultNumbers.add(k);
//            }
//        }
