package college_work.practice.data_type_que;
//Take a person's name, age, height, and first letter of their name as input and
// store them using appropriate data types.

import java.util.Scanner;

public class que_1 {
    public static void main(String[] args) {
        String name;
        int age;
        float height;
        char f_letter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name here:");
        name = sc.nextLine();
        System.out.print("Enter your age here:");
        age = sc.nextInt();
        System.out.print("Enter your height(in cm) here:");
        height = sc.nextFloat();

        sc.nextLine();
        System.out.print("Enter your name first letter here:");
        f_letter = sc.nextLine().charAt(0);
        sc.close();
    }
}
