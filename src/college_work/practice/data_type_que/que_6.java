package college_work.practice.data_type_que;
//Take a byte value as input from the user and print its value.

import java.util.Scanner;

public class que_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a byte value here:");
        byte num = sc.nextByte();
        System.out.println("You entered:" + num);
        sc.close();

    }
}
