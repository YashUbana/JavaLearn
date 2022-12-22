public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {11,22,55,99,33,55,77,44};
        int max=arr[0],min=arr[0];
        System.out.println("Max: "+getMaxInArray(arr,max));
        System.out.println("Min: "+getMinInArray(arr,min));

    }

    private static int getMinInArray(int[] arr, int min) {
        for (int j : arr) {
            if (j < min)
                min = j;
        }
        return min;
    }

    private static int getMaxInArray(int[] arr, int max) {
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        return max;
    }
}
