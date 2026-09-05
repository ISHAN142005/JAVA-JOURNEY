package self_learning.TELUSKO.ONE;

public class TypeCasting {
    public static void main(String[] args) {
//        byte b=127;
//        int a=b;
//        System.out.println(a);

        int a = 257;
        byte k = (byte) a;
        System.out.println(k); //1 Modulo concept 257%256

        float f = 5.66f;
        int i = (int) f;
        System.out.println(i); //5


        //Type promotion
        byte x = 10;
        byte y = 30;
        int result = x * y;
        System.out.println(result);


    }
}
