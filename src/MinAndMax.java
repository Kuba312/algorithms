public class MinAndMax {

    public static void main(String[] args) {
        int[] ints = {3, 2, 1, 5, 6, 1, 10, 14, 18};
        MinAndMax minAndMax = new MinAndMax();

        System.out.println("Max value: " + minAndMax.max(ints));
        System.out.println("Min value: " + minAndMax.min(ints));


    }

    public int max(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public int min(int[] ints) {
        int minValue = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < minValue) {
                minValue = ints[i];
            }
        }
        return minValue;
    }
}
