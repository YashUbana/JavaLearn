import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number :");
        int x = a.nextInt();
        boolean check = true;
        for (int i = 2; i < x/2 ; i++) {
            if(x % i ==0) {
                check = false;
                break;
            }
        }
        System.out.println(check ? "Prime":"Not prime");
    }
}
