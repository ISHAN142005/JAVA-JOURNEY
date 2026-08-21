package college_work.practice.operator_que;
//ake two numbers and check:
//
//Which number is greater
//Whether both numbers are equal

import java.util.Scanner;

public class que_3 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number here:");
        num1 = sc.nextInt();
        System.out.print("Enter second number here:");
        num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("Both the number(" + num1 + "and" + num2 + ")are equal.");
        } else if (num1 > num2) {
            System.out.println("First number(" + num1 + ")is greater than second number(" + num2 + ").");
        } else {
            System.out.println("Second number(" + num2 + ")is greater than first number(" + num1 + ").");
        }
        sc.close();
    }
}
