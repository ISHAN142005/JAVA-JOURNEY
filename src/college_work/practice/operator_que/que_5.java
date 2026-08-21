package college_work.practice.operator_que;
//Take marks of a student and check whether the student has:
//
//Marks greater than 40
//Attendance greater than or equal to 75
//
//Print whether the student is eligible to pass.

import java.util.Scanner;

public class que_5 {
    public static void main(String[] args) {
        int marks;
        double attendance;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks here:");
        marks = sc.nextInt();

        System.out.print("Enter your attendance percentage here:");
        attendance = sc.nextInt();

        if (attendance >= 75 && marks >= 40) {
            System.out.println("Student is eligible for examination.");
        } else {
            System.out.println("Student is not eligible for examination.");
        }
        sc.close();


    }
}
