import java.util.Arrays;

public class TwoDArrayRowByRow {
    public static void main(String[] args) {
        System.out.println("Printing Two array Row by Row");
        int[][] numbers = {{2,4,3},
                            {6,62,6}};
        System.out.println(Arrays.deepToString(numbers));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print (numbers[j][i]+ " ");
            }

        }
    }
}
