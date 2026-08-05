package self_learning.day2;

import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hi there! What's your name? ");
        String studentName = input.nextLine();

        System.out.print("How old are you? ");
        int studentAge = input.nextInt();

        input.nextLine();

        System.out.print("What grade are you in? ");
        String studentGrade = input.nextLine();

        System.out.println("\nAwesome! Here is what we saved:");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge + " years old");
        System.out.println("Grade: " + studentGrade);

        System.out.println("Have a great day at school, " + studentName + "!");

        input.close();
    }
}
