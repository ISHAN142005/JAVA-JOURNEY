package college_work.practice.control_flow.for_loop;
//Take n as input and print numbers from 1 to n

import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here:");
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            System.out.print(i + " ");
        }
    }
}
