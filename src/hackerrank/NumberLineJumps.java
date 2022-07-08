package hackerrank;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(2, 1, 1, 2));
    }

//    x1 + y * v1 = x2 + y * v2 where "y" is number of jumps... so if (x1 - x2) % (v2 - v1) == 0
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if((x2 - x1) * (v2 - v1) < 0 && (x2 - x1) % (v2 - v1) == 0){
            return "YES";
        }
        return "NO";
    }


}
