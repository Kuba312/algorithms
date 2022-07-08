package hackerrank;

public class Staircase {
    public static void main(String[] args) {
        staircase(6);
    }

    public static void staircase(int n) {
        StringBuilder builder = new StringBuilder();
        builder.append(" ".repeat(Math.max(0, n)));
        int j = 0;
        for (int i = 1; i <= n; i++) {
            builder.replace(builder.length() - i, builder.length() - j, "#");
            System.out.println(builder);
            j++;
        }
    }
}

