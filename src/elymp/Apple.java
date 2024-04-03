package elymp;

import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pupil = sc.nextInt();
        int apple = sc.nextInt();
        int n = apple / pupil;
        System.out.println(n);
    }
}
