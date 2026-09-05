package self_learning.TELUSKO.ONE;

public class Logical_Relational {
    public static void main(String[] args) {
        int a = 2;
        int b = 9;
        int c = 99;
        int d = 112;

        System.out.println(d > c);//true
        System.out.println(d < c);//false

        boolean result = a < b && c < d;
        System.out.println(result);
        boolean result1 = a < b || c < d;
        System.out.println(result1);
        System.out.println(!result1);
    }
}
