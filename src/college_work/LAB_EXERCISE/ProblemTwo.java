package college_work.LAB_EXERCISE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            numbers.add(scanner.nextInt());
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println(sum);
        System.out.println(Collections.max(numbers));

        scanner.close();
    }
}