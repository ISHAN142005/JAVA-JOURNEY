package college_work.practice.data_type_que;
//Take two integer numbers and print their sum, difference, and product.

import java.util.Scanner;

public class que_2 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number here:");
        num1 = input.nextInt();
        System.out.print("Enter the second number here:");
        num2 = input.nextInt();
        System.out.println("First number:" + num1);
        System.out.println("Second number:" + num2);
        System.out.println("SUM:" + (num1 + num2));
        System.out.println("DIFFERENCE:" + (num1 - num2));
        System.out.println("PRODUCT:" + (num1 * num2));
        input.close();

    }
}
