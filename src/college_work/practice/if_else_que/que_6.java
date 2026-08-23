package college_work.practice.if_else_que;
//Take three numbers as input and find the largest number using only if-else.

import java.util.Scanner;

public class que_6 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number here");
        n1 = sc.nextInt();
        System.out.print("Enter the second number here");
        n2 = sc.nextInt();
        System.out.print("Enter the third number here");
        n3 = sc.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("First number(" + n1 + ") is largest among entered numbers.");
            } else if (n1 < n3) {
                System.out.println("Third number(" + n3 + ") is largest among entered numbers.");
            } else {
                System.out.println("Both first number and third number are largest and equal.");
            }
        } else if (n1 < n2) {
            if (n2 > n3) {
                System.out.println("Second number(" + n2 + ") is largest among entered numbers.");
            } else if (n2 < n3) {
                System.out.println("Third number(" + n3 + ") is largest among entered numbers.");
            } else {
                System.out.println("Both second number and third number are largest and equal.");
            }

        } else if (n1 == n3 && n3 == n2) {
            System.out.println("All the numbers are equal.");

        }
        sc.close();
    }

}