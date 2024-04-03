import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] numbers = {19, 8, 43, 1, 25, 26, 19};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 43) {
                System.out.println(i);
            } else {
                System.out.println("Not found");
            }
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time in millis: " + executionTime);
    }
}
