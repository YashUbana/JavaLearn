import java.util.Scanner;

public class SearchOccurrenceArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 3, 3, 3, 5, 2, 8, 4};
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = a.nextInt();
        System.out.println(checkOccurrence(arr,n));
    }

    private static int checkOccurrence(int[] arr,int n) {
        int count = 0;
        for (int i: arr){
            if(n == i){
                count++;
            }
        }
        return count;
    }

}
