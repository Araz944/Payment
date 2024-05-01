package lesson16;

import java.util.Scanner;

public class RandomNumberFind {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");

        while (true) {
            int givenNumber = sc.nextInt();
            if (givenNumber == randomNum) {
                System.out.println("Congratulations, you found the number, It is " + randomNum);
                break;
            }
            else if (givenNumber > randomNum) {
                System.out.println("Enter smaller number please");
            }
            else {
                System.out.println("Enter bigger number please");
            }
        }
    }
}
