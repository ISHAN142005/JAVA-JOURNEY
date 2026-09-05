package self_learning.TELUSKO.ONE;

public class SwitchNewVersion {
    public static void main(String[] args) {
        int n = 2;
        String day = switch (n) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid day";
        };

        System.out.println(day);
    }
}
