package lesson16.daysOfTheWeek;

import java.util.Scanner;

public class WeekPlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] schedule = new String [7][2];

        // days of the week:
        schedule[0][0] = "Sunday";
        schedule[1][0] = "Monday";
        schedule[2][0] = "Tuesday";
        schedule[3][0] = "Wednesday";
        schedule[4][0] = "Thursday";
        schedule[5][0] = "Friday";
        schedule[6][0] = "Saturday";

        // daily plans:
        schedule[0][1] = "rest";
        schedule[1][1] = "go to work";
        schedule[2][1] = "listen to music";
        schedule[3][1] = "read book";
        schedule[4][1] = "go to market";
        schedule[5][1] = "go to gym";
        schedule[6][1] = "watch movie";

        for (String[] strings : schedule) {
            System.out.println("Day: " + strings[0] + ", Plan: " + strings[1]);
        }

        while (true) {
            String day = sc.nextLine();

            switch (day.toLowerCase()) {
                case "sunday":
                    System.out.println("On Sunday, plan: " + schedule[0][1]);
                    break;
                case "monday":
                    System.out.println("On Monday, plan: " + schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.println("On Tuesday, plan: " + schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.println("On Wednesday, plan: " + schedule[3][1]);
                    break;
                case "thursday":
                    System.out.println("On Thursday, plan: " + schedule[4][1]);
                    break;
                case "friday":
                    System.out.println("On Friday, plan: " + schedule[5][1]);
                    break;
                case "saturday":
                    System.out.println("On Saturday, plan: " + schedule[6][1]);
                    break;
                default:
                    System.out.println("Invalid day");
                    break;
            }
        }
    }
}
