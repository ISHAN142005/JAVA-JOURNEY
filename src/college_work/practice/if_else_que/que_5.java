package college_work.practice.if_else_que;
//Take marks as input and print the grade:
//
//90+ → A
//80–89 → B
//70–79 → C
//60–69 → D
//Below 60 → Fail

import java.util.Scanner;

public class que_5 {
    public static void main(String[] args) {
        float marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks here:");
        marks = sc.nextFloat();

        if (marks >= 90) {
            System.out.println("Student Grade:A+");
        } else if (marks < 90 && marks >= 80) {
            System.out.println("Student Grade:B");
        } else if (marks < 80 && marks >= 70) {
            System.out.println("Student Grade:C");
        } else if (marks < 70 && marks >= 60) {
            System.out.println("Student Grade:D");
        } else {
            System.out.println("Student Grade:Failed");
        }
        sc.close();
    }
}
