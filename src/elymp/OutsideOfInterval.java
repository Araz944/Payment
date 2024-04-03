package elymp;

import java.util.Scanner;

public class OutsideOfInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        if (x < a || x > b) {
            System.out.println("OUT");
        } else {
            System.out.println("IN");
        }
    }
}
