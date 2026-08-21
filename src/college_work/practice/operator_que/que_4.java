package college_work.practice.operator_que;
//Take a number and check whether it is between 10 and 50 using logical operators.

import java.util.Scanner;

public class que_4 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number here:");
        num = sc.nextInt();
        if (num >= 10 && num <= 50) {
            System.out.println("Entered number is in the range(10-50.");
        } else {
            System.out.println("Entered number is not in the range(10-50).");
        }
        sc.close();
    }
}
