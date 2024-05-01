package lesson22;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left <= right) {
            count = count + 1;
            int midIndex = left + (right - left) / 2;

            if (arr[midIndex] == target)
                return count;

            if (arr[midIndex] < target)
                left = midIndex + 1;

            else
                right = midIndex - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the number:");
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        if (result == -1)
            System.out.println("Element not present in array");
        else
            System.out.println("Element found in this step: " + result);
    }
}
