package college_work.practice.operator_que;

import java.util.Scanner;

//Take two numbers and perform:
//
//Addition
//Subtraction
//Multiplication
//Division
//Modulus
public class que_1 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number here:");
        num1 = sc.nextInt();
        System.out.print("Enter the second number here:");
        num2 = sc.nextInt();
        System.out.println("First number:" + num1);
        System.out.println("Second number:" + num2);
        System.out.println("SUM:" + (num1 + num2));
        System.out.println("DIFFERENCE:" + (num1 - num2));
        System.out.println("PRODUCT:" + (num1 * num2));
        if (num2 != 0) {
            System.out.println("DIVISION:" + (num1 / num2));
            System.out.println("MODULUS:" + (num1 % num2));
        } else {
            System.out.println("Division with 0 not possible!");
            System.out.println("Modulus with 0 not possible!");
        }

        sc.close();

    }
}
