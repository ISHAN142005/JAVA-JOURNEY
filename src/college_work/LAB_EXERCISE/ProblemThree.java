package college_work.LAB_EXERCISE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ProblemThree {
    public static void main(String[] args) {
        ArrayList<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(10, 20, 20, 30, 40, 10, 50));

        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>(listWithDuplicates);
        ArrayList<Integer> uniqueList = new ArrayList<>(uniqueSet);

        System.out.println(uniqueList);
    }
}