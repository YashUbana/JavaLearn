import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,6,3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(arr,4));
    }
}
