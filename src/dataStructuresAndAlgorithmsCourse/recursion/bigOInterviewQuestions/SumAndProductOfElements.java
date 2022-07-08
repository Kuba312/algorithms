package dataStructuresAndAlgorithmsCourse.recursion.bigOInterviewQuestions;

//Create a function which calculates the sum and product of elements of array
//Find the time complexity for created method
public class SumAndProductOfElements {
    public static void main(String[] args) {
        spofArray(new int[]{1, 3, 4, 5});
    }

    public static void spofArray(int[] array) {
        int sum = 0;  // ===>O(1)
        int product = 1; // ===>O(1)
        for (int j : array) sum += j; // ===> O(N) O(1)
        for (int j : array) product *= j; // ===> O(N) O(1)
        System.out.println(sum + " " + product);
    }
}
//result ==> O(N)
