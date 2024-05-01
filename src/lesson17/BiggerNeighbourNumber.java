package lesson17;

import java.util.Arrays;
import java.util.Scanner;

public class BiggerNeighbourNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            int arrayElement = sc.nextInt();
            array[i] = arrayElement;
            if (i != 0 || i == array.length - 1) {
                if (array[i] > array[i-1] && array[i] > array[i+1]) {
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }
}
