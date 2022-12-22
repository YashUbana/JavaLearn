import java.util.Arrays;

public class SumOfColumeInTwoD {
    public static void main(String[] args) {
        int[][] arrays = new int[][]{{1,446,2,2,12,21},{2,58,2,3,155,2}};
        sumOfRow(arrays);
        sumOfCol(arrays);
    }

    private static void sumOfCol(int[][] arrays) {

        for (int i=0; i<arrays[i].length;i++){
            int sumRow = 0;
            for (int j=0; j<arrays.length;j++)
                sumRow += arrays[j][i];

            System.out.println("Sum of Columns:"+(i+1)+":"+sumRow);
        }
    }

    private static void sumOfRow(int[][] arrays) {
        int[][] b = Arrays.copyOf(arrays,arrays.length);
        for (int i=0; i<b.length;i++){
            int sumRow = 0;
            for (int j=0; j<b[i].length;j++)
                sumRow += b[i][j];

            System.out.println("Sum of row:"+(i+1)+":"+sumRow);
        }
    }

}
