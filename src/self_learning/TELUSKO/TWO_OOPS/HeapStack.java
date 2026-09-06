package self_learning.TELUSKO.TWO_OOPS;

class Cal {
    int num = 5;

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class HeapStack {
    public static void main(String[] args) {
        int data = 10;

        Cal obj = new Cal();
        Cal obj1 = new Cal();
        int r1 = obj.add(3, 4);

        obj.num = 8;

        System.out.println(r1);
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}
