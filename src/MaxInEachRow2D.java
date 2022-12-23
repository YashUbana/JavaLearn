import java.util.Arrays;



public class MaxInEachRow2D {
    public static void main(String[] args) {
        int[][] arr = {{22,44,66,33,77,88,44,22},{22,44,66,88,44,88,11,77,44,99}};
        getMax(arr);
    }

    private static void getMax(int[][] arr) {
        for (int i=0;i< arr.length;i++){
            int max = arr[i][0];
            for (int j=1; j<arr[i].length; j++) {
                if (max < arr[i][j])
                    max = arr[i][j];
            }
            System.out.println("The max in "+(i+1)+":"+max);
        }
    }
}
