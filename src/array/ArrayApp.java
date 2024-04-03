package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        String str = String.valueOf(number);
//
//        if (number >= 0) {
//            System.out.println(str.length());
//        }

//        int[] array = {5, 8, 77, 42, 56, 38};
//        Arrays.sort(array);
//        int firstElement = array[0];
//        int lastElement = array[array.length - 1];
//        System.out.println("The smallest: " + firstElement + ", and the biggest: " + lastElement);

//        int[] array = {5, 8, 77, 42, 56, 38, 128};
//
//        int smallest = array[0];
//        int greatest = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < smallest) {
//                smallest = array[i];
//            }
//            if (array[i] > greatest) {
//                greatest = array[i];
//            }
//        }
//
//        System.out.println("Smallest number: " + smallest);
//        System.out.println("Greatest number: " + greatest);

//        int[] array = new int[5];
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(array));

//        int[] array = new int[5];
//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//        int prod = 1;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//            sum += array[i];
//            prod *= array[i];
//        }
//
//        System.out.println("sum is: " + sum + ", prod is: " + prod);

        int[] array = {5, 8, 77, 42, 56, 38, 128};

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            } else if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}