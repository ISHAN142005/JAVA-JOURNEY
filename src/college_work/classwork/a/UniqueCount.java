package college_work.classwork.a;

public class UniqueCount {
    public static void main(String[] args) {

        String str = "RANJANA";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                count++;
            }
        }

        System.out.println("Unique characters: " + count);
    }
}