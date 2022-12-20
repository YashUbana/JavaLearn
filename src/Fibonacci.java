import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int first = 1;
        int second = 1;
        int sum = 0;
        System.out.print(first+","+second);

        for(int i =0; i<n;i++){
            sum = first+second;
            first = second;
            second = sum;
            System.out.print(","+sum);
        }
    }
}
