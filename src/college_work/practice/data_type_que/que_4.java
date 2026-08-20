package college_work.practice.data_type_que;
//Take a single character as input and print its ASCII/Unicode value.

import java.util.Scanner;

public class que_4 {
    public static void main(String[] args) {
        char single;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the letter here:");
        single = sc.nextLine().charAt(0);
        int asc = single;
        System.out.println("The ASCII value/UNICODE of " + single + " is:" + asc);
        sc.close();
    }
}
