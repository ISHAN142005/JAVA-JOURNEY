package self_learning.TELUSKO.ARRAYS_GO;

public class ARRAYS {
    public static void main(String[] args) {
        int[] num = {91, 24, 43, 942, 600};

        //If no idea about element si in arrays
        int[] num2 = new int[10];//10 here is the size of array which can,t be changed
        //Currently all values will be zero

        num[0]=99;//Will be changed
        for (int i = 0; i <= 4; i++) {
            System.out.println(num[i]);
        }

        System.out.println();

        for (int i = 0; i <= 9; i++) {
            System.out.println(num2[i]);
        }
    }
}
