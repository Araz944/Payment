package elymp;

import java.util.Scanner;

public class SumDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = findSmallestNumberDivisibleByK(k);
        System.out.println(n);
        scanner.close();
    }

    public static int findSmallestNumberDivisibleByK(int k) {
        int sum = 0;
        int n = 1;

        while (true) {
            sum += n;
            if (sum % k == 0) return n;
            n++;
        }
    }
}
