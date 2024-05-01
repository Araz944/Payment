package lesson16.maxSalary;

import java.util.Scanner;

public class MaxSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maxSalary = -1;
        double salary;

        while (sc.hasNext()) {
            salary = sc.nextInt();
            if (maxSalary < salary) {
                maxSalary = salary;
            }
        }
        System.out.printf("%.2f", maxSalary);
    }
}
