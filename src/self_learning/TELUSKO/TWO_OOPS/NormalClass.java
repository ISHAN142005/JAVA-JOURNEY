package self_learning.TELUSKO.TWO_OOPS;

class Calculator {
    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }

    public int sub(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }
}

public class NormalClass {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 20;
        Calculator calc = new Calculator();
        int addition = calc.add(num1, num2);
        int subtraction = calc.sub(num1, num2);

        System.out.println("Sum of both the numbers is:" + addition);
        System.out.println("Difference of both the numbers is:" + subtraction);
    }
}
