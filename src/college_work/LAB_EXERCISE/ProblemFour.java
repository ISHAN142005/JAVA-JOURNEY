package college_work.LAB_EXERCISE;

import java.util.HashMap;

public class ProblemFour {
    public static void main(String[] args) {
        String text = "engineering";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }

        System.out.println(frequencyMap);
    }
}