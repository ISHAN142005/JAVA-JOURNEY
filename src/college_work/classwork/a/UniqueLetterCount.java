package college_work.classwork.a;

import java.util.LinkedList;

public class UniqueLetterCount {
    public static void main(String[] args) {
        String str = "RANJANA";
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> checked = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (checked.contains(ch)) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " = " + count);
            checked.add(ch);
        }
    }
}
