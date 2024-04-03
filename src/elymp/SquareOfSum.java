package elymp;

import java.util.Scanner;

public class SquareOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int tensDigit = number / 10;
        int onesDigit = number % 10;

        int sum = tensDigit + onesDigit;

        int square = sum * sum;

        System.out.println(square);
    }
}
