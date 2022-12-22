import java.util.Arrays;
import java.util.Scanner;

public class ArraySumProductAverage {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number of element for array: ");
        int n = a.nextInt();
        int[] arr = new int[n];
        enterArr(arr);
        printArr(arr);
        System.out.println("\nSum for the Array :"+sum(arr)+"\nProduct of the array : "+product(arr)+"\nAverage of the array : "+average(arr));


    }

    private static float average(int[] arr) {
        return (float) sum(arr)/arr.length;
    }

    private static long product(int[] arr) {
        long temp = 1;
        for (int j : arr) temp *= j;
        return temp;
    }

    public static int sum(int[] arr) {
        int temp = 0;
        for (int j : arr) temp += j;
        return temp;
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
