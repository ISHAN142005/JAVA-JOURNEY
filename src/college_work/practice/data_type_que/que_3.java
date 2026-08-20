package college_work.practice.data_type_que;
//Take the price of a product as input
// and store it using an appropriate decimal data type. Print the price.

import java.util.Scanner;

public class que_3 {
    public static void main(String[] args) {
        String p_name;
        double price;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the product here:");
        p_name = sc.nextLine();
        System.out.print("Enter the price of " + p_name + " here:");
        price = sc.nextDouble();

        System.out.println("The price of " + p_name + " is:$" + price);
        sc.close();

    }
}
