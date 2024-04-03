package elymp;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int perimeter = width * 2 + height * 2;
        System.out.println(perimeter);
    }
}
