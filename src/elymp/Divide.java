package elymp;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a % b;

        if (c == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println(a / b + " " + c);
        }
    }
}
