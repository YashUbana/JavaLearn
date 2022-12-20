import java.util.Scanner;

public class WhileForLoop {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = a.nextInt();
        int sum = n;
        if (n<=100) {
            while (n <= 100) {
                System.out.println("Smaller than 100");
                sum += a.nextInt();
                System.out.println(sum);
            }
        }
        if (sum > 100) {
            System.out.println("Done");
        }
    }
}
