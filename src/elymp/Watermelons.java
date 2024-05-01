package elymp;

import java.util.Scanner;

public class Watermelons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];


        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int smallest = array[0];
        int greatest = array[0];

        if (size > 1) {
            for (int i = 1; i < size; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                }
                if (array[i] > greatest) {
                    greatest = array[i];
                }
            }
            System.out.println(smallest + " " + greatest);
        }
        else {
            System.out.println("Ooops!");
        }
    }
}
