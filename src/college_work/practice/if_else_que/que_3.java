package college_work.practice.if_else_que;
//Take two numbers and print the greater number.

import java.util.Scanner;

public class que_3 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number  here:");
        num1 = sc.nextInt();
        System.out.print("Enter the second number  here:");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("First number is greater than the second one.");
        } else if (num1 < num2) {
            System.out.println("Second number is greater than the first one.");
        } else {
            System.out.println("Both the number are equal");
        }
        sc.close();
    }
}