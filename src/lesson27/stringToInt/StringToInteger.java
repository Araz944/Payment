package lesson27.stringToInt;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        try {
            Integer num = Integer.parseInt(input);
            System.out.println(num);
        }
        catch (NumberFormatException e) {
            System.out.println("not a number");
        }
    }
}
