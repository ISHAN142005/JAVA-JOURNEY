package self_learning.day2;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number here:");
        num1 = sc.nextInt();
        System.out.print("Enter second number here:");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }
        sc.close();
    }
}
