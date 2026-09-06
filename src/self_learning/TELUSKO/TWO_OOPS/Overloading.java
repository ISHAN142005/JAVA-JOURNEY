package self_learning.TELUSKO.TWO_OOPS;

class Calci {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calci obj = new Calci();

        int result1 = obj.add(5, 10);
        System.out.println("Sum of 2 numbers: " + result1);

        int result2 = obj.add(5, 10, 15);
        System.out.println("Sum of 3 numbers: " + result2);
    }
}
