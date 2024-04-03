package elymp;

import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int firstNumber = number / 100;
        int thirdNumber = number % 10;

        if (firstNumber > thirdNumber) {
            System.out.println(firstNumber);
        }
        else if (thirdNumber > firstNumber) {
            System.out.println(thirdNumber);
        }
        else if (firstNumber == thirdNumber) {
            System.out.println("=");
        }
    }
}
