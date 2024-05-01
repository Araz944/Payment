package lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindOddNumbers {
    public static List<Integer> findAndAddOddNumbers(int start, int end) {
        List<Integer> oddNumbersList = new ArrayList<>();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                oddNumbersList.add(i);
            }
        }

        return oddNumbersList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            List<Integer> oddNumbersList = findAndAddOddNumbers(a, b);

            System.out.println("Odd numbers between " + a + " and " + b + ": " + oddNumbersList);
        }
    }
}
