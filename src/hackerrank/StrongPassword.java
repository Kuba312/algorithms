package hackerrank;

import java.util.regex.Pattern;

public class StrongPassword {
    public static void main(String[] args) {
        System.out.println(minimumNumber(3, "9pg"));
    }

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        Pattern specialCharacters = Pattern.compile("[!@#$%^&*()+-]");
        int lengthOfPass = 6;
        Pattern oneDigit = Pattern.compile("[0-9]");
        Pattern small = Pattern.compile("[a-z]+");
        Pattern big = Pattern.compile("[A-Z]+");

        var counterContaining = 0;
        var counterNotContaining = 0;
        if (oneDigit.matcher(password).find()) {
            counterContaining++;
        } else {
            counterNotContaining++;
        }
        if (small.matcher(password).find()) {
            counterContaining++;
        } else {
            counterNotContaining++;
        }

        if (big.matcher(password).find()) {
            counterContaining++;
        } else {
            counterNotContaining++;
        }

        if (specialCharacters.matcher(password).find()) {
            counterContaining++;
        } else {
            counterNotContaining++;
        }

        if (password.length() < lengthOfPass && password.length() + counterNotContaining < 6) {
            var withAllChar = counterContaining + counterNotContaining;
            var c = 0;
            int abs = Math.abs(password.length() - counterContaining);
            if (abs != 0) {
                c = abs;
            }
            int i = lengthOfPass - withAllChar;
            if (password.length() == withAllChar) {
                return lengthOfPass - password.length();
            }
            return counterNotContaining + i - c;
        }


        return counterNotContaining;
    }

}
