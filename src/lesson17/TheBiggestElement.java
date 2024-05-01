package lesson17;

import java.util.Arrays;
import java.util.Scanner;

public class TheBiggestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int biggestNumber = -1;
        int row = 0;

        for (int i = 0; i < n; i++) {
            int arrayElement = sc.nextInt();
            array[i] = arrayElement;
            if (biggestNumber < arrayElement) {
                biggestNumber = arrayElement;
                row = i + 1;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(biggestNumber + " " + row);
    }
}
