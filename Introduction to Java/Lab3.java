// package com.lq.exercises;

public class Lab3 {
    public static void main(String[] args) {

        String daysOfWeek[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        System.out.println("Standard For loop");
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i]);
        }

        System.out.println("For-Each loop");

        for (String day : daysOfWeek) {
            System.out.println(day);
        }

        System.out.println("Reverse For loop");

        for (int i = daysOfWeek.length - 1; i >= 0; i--) {
            System.out.println(daysOfWeek[i]);
        }

        System.out.println("While Loop");

        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
            if (i % 2 == 1) {
                continue;
            }
        }

        for (int j = 1; j < 101; j++) {
            if ((j >= 50) && (j <= 60)) {
                continue;
            }
            System.out.print(j + " ");
        }
        System.out.println();
        String monthNames[] = { "January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October", "November", "December" };
        int month = 1;
        while (month <= 12) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(monthNames[month - 1] + " has 31 days");
                    break;
                case 2:
                    System.out.println(monthNames[month - 1] + " has 28 days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(monthNames[month - 1] + " has 30 days");
                    break;
                default:
                    System.out.println("Something else");
            }
            month++;
        }

        for (i = 0; i < daysOfWeek.length; i++) {
            System.out.print(daysOfWeek[i].substring(0, 3) + "\t");
        }
        System.out.println();
        for (i = -4; i <= 31; i++) {
            if (i < 1) {
                System.out.print("\t");
            } else if ((i == 2) || (i == 9) || (i == 16) || (i == 23) || (i == 30)) {
                System.out.print(i + "\n");
            } else {
                System.out.print(i + "\t");
            }

        }
    }
}
