package self_learning.TELUSKO.ARRAYS_GO;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];

        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];

        jagged[0][0] = 10;
        jagged[0][1] = 20;

        jagged[1][0] = 30;
        jagged[1][1] = 40;
        jagged[1][2] = 50;
        jagged[1][3] = 60;

        jagged[2][0] = 70;
        jagged[2][1] = 80;
        jagged[2][2] = 90;

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
