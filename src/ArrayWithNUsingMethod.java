import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithNUsingMethod {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number of element for array(2-19): ");
        int n = a.nextInt();
        while(n <= 0 || n >19){
            System.out.println("Invalid input. Try Again");
            n = a.nextInt();
        }
        int[] arr = new int[n];
        enterArr(arr);
        printArr(arr);


    }

    private static void printArr(int[] arr) {
        System.out.print("The element are:"+ Arrays.toString(arr));
    }

    private static void enterArr(int[] arr) {
        Scanner x  = new Scanner(System.in);
        for (int i=0;i<arr.length;i++)
            arr[i] = x.nextInt();
    }
}
