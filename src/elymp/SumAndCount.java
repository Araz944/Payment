package elymp;

import java.util.Scanner;

public class SumAndCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while(scanner.hasNext()) {
            int a = scanner.nextInt();
            count++;
            sum+=a;
        }

        System.out.print(count + " " + sum);
    }
}
