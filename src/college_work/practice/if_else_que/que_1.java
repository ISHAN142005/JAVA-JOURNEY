package college_work.practice.if_else_que;
//Take a number and check whether it is positive, negative, or zero.

import java.util.Scanner;

public class que_1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here:");
        num = sc.nextInt();
        if (num > 0) {
            System.out.println("Entered number is positive number.");
        } else if (num == 0) {
            System.out.println("Entered number is zero.");
        } else {
            System.out.println("Entered number is negative.");
        }
        sc.close();

    }
}
