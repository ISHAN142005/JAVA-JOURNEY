package college_work.practice.if_else_que;
//Take a year and check whether it is a leap year or not.

import java.util.Scanner;

public class que_4 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year here:");
        year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("Entered year is a leap year");
        } else if (year % 100 == 0) {
            System.out.println("Entered year is not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Entered year is a leap year");
        } else {
            System.out.println("Entered year is not a leap year");
        }
        sc.close();
    }
}
