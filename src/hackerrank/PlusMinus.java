package hackerrank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        plusMinus(List.of(1, 1, 0, -1, -1));
    }

    public static void plusMinus(List<Integer> arr) {
        double denominator = arr.size();
        double negativeNumbers = 0;
        double positiveNumbers = 0;
        double zeroNumbers = 0;
        for (var nominator : arr) {
            if (nominator < 0) {
                negativeNumbers++;
            }
            if (nominator > 0) {
                positiveNumbers++;
            }
            if (nominator == 0) {
                zeroNumbers++;
            }
        }
        double negativeFraction = negativeNumbers / denominator;
        double zeroFraction = zeroNumbers / denominator;
        double positiveFraction = positiveNumbers / denominator;
        DecimalFormat numberFormat = new DecimalFormat("0.000000");
        System.out.println(numberFormat.format(positiveFraction));
        System.out.println(numberFormat.format(negativeFraction));
        System.out.println(numberFormat.format(zeroFraction));
    }

}
