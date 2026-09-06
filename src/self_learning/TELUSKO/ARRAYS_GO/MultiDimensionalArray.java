package self_learning.TELUSKO.ARRAYS_GO;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {
                {21, 22, 44},
                {33, 14, 12},
                {99, 88, 77},
        };
        int[][][] arr1 = new int[2][4][6];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 6; k++) {
                    arr1[i][j][k] = (int) (Math.random() * 10);//*10 bcoz random has value<1
                    System.out.print(arr1[i][j][k] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
