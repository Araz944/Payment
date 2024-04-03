package elymp;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the month in number:");
        int month = sc.nextInt();

        if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        }
        else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        }
        else if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        }
        else if (month == 12 || (month >= 1 && month <= 2)) {
            System.out.println("Winter");
        }
        else {
            System.out.println("Wrong number entered");
        }
    }
}
