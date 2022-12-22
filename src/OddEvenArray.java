import java.util.Arrays;

public class OddEvenArray {
    public static void main(String[] args) {
        int[] arr = {11,44,55,88,99,77,55,22};
        int[] arr1 = new int[arr.length];
        int j = 0;
        int k = arr.length - 1;
        for (int i =0; i< arr.length; i++){
            if(arr[i] % 2 != 0)
                arr1[j++] = arr[i];
            else
                arr1[k--] = arr[i];
        }
        copyArray(arr,arr1);
        System.out.println(Arrays.toString(arr1));
    }
    public static void copyArray(int[] arr, int[] arr1){
        for (int i=0; i<arr1.length;i++){
            arr[i] = arr1[i];
        }
    }


}
