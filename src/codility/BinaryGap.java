package codility;

public class BinaryGap {

    public static void main(String[] args) {

        BinaryGap binaryGap = new BinaryGap();
        String s = Long.toBinaryString(1041);
        System.out.println(s);
        int solution = binaryGap.solution(1041);
        System.out.println(solution);

    }

    private int solution(int n) {
        String binaryNumber = Long.toBinaryString(n);

        int modifier = 0;
        if (binaryNumber.endsWith("0")) {
            modifier = 1;
        }
        String[] split = binaryNumber.split("1");

        int max = 0;
        for (int i = 0; i < split.length - modifier; i++) {
            int length = split[i].length();
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}
