import java.util.Scanner;

public class DivisorSum {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = a.nextInt();
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0 )
                sum += i;
            System.out.println("List of Divior:"+i);
        }
        System.out.println("The sum of divisor of this number "+(sum+n));
    }
}
