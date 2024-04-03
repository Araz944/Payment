package elymp;

import java.util.Scanner;

public class MonthsAndQuarters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        String quarter;
        if (month >= 1 && month <= 3) {
            quarter = "First";
        } else if (month >= 4 && month <= 6) {
            quarter = "Second";
        } else if (month >= 7 && month <= 9) {
            quarter = "Third";
        } else {
            quarter = "Fourth";
        }

        System.out.println(quarter);
    }
}
