package elymp;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if (grade >= 1 && grade <= 3) {
            System.out.println("Initial");
        }
        else if (grade >= 4 && grade <= 6) {
            System.out.println("Average");
        }
        else if (grade >= 7 && grade <= 9) {
            System.out.println("Sufficient");
        }
        else if (grade >= 10 && grade <= 12) {
            System.out.println("High");
        }
    }
}
