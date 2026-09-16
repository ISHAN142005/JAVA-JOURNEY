package college_work.classwork;

public class UniqueCountTwo {
    public static void main(String[] args) {

        String str = "RANJANA";

        for (int i = 0; i < str.length(); i++) {

            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted)
                continue;

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " = " + count);
        }
    }
}
