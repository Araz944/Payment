package elymp;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = (long) n * (n + 1) * (2L * n + 1) / 6;

        System.out.println(sum);
    }
}
