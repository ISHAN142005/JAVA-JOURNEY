package college_work.practice.data_type_que;
//Take your name, age, marks, and percentage as input and print all the details

import java.util.Scanner;

public class que_5 {
    public static void main(String[] args) {
        String name;
        int age, marks1, marks2, marks3, marks4, marks5;
        float percentage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name here:");
        name = sc.nextLine();
        System.out.print("Enter your age here:");
        age = sc.nextInt();
        System.out.print("Enter your marks in subject 1 here:");
        marks1 = sc.nextInt();
        System.out.print("Enter your marks in subject 2 here:");
        marks2 = sc.nextInt();
        System.out.print("Enter your marks in subject 3 here:");
        marks3 = sc.nextInt();
        System.out.print("Enter your marks in subject 4 here:");
        marks4 = sc.nextInt();
        System.out.print("Enter your marks in subject 5 here:");
        marks5 = sc.nextInt();

        float sum = (marks1 + marks2 + marks3 + marks4 + marks5);
        percentage = (sum / 5);

        System.out.println("***********STUDENT DETAILS***********");
        System.out.println("NAME:" + name);
        System.out.println("AGE:" + age);
        System.out.println("MARKS:");
        System.out.println("1)" + marks1);
        System.out.println("2)" + marks2);
        System.out.println("3)" + marks3);
        System.out.println("4)" + marks4);
        System.out.println("5)" + marks5);
        System.out.println("PERCENTAGE:" + percentage + "%"); //CAN USE printf and %.2f%%
        sc.close();
    }
}
