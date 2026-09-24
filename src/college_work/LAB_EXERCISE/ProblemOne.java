package college_work.LAB_EXERCISE;

import java.util.ArrayList;

public class ProblemOne {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Sydney");

        System.out.println(cities);

        cities.remove(2);

        System.out.println(cities);
    }
}