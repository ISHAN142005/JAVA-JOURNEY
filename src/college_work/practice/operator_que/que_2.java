package college_work.practice.operator_que;
//Take a number and check whether it is even or odd using the modulus operator.

import java.util.Scanner;

public class que_2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number here:");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Entered number(" + num + ") is a even number.");
        } else {
            System.out.println("Entered number is a odd number.");
        }
        sc.close();
    }
}
