import java.util.Arrays;

public class SumOfColumeInTwoD {
    public static void main(String[] args) {
        int[][]data = { {3, 2, 5},
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8}};

        int[]rowlength = new int[data.length];
        int sum = 0;


        for (int row=0; row<data.length;row++)
        {
            rowlength[row]=data[row].length;
        }

        for (int col=0; col<rowlength[0];col++)
        {
            sum=0;
            for (int row=0; row<data.length;row++)
            {
                sum = sum + data [row][col];
            }
            System.out.println(sum);
        }

    }

}
