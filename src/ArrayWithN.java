import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithN {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number of element for array(2-19): ");
        int n = a.nextInt();
        while(n<1 || n >20){
            System.out.println("Invalid input. Try Again");
            n = a.nextInt();
        }
        int[] arr = new int[n];
        System.out.print("Enter the array with spaces: ");
        for (int i = 0; i<n; i++){
            arr[i] = a.nextInt();
        }
        System.out.print(Arrays.toString(arr));
    }
}
