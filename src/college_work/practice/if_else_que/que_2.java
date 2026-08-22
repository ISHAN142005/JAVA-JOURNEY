package college_work.practice.if_else_que;

import java.util.Scanner;

public class que_2 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age here:");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Entered age is eligible to vote.");
        } else if (age <= 0) {
            System.out.println("Invalid age entered");
        } else {
            System.out.println("Entered age is not eligible to vote.");
        }
        sc.close();

    }
}
