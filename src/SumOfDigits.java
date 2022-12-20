import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int sum = 0;
        while (true){
            if (x<1)
                break;
            sum += x % 10;
            x = x / 10;
            System.out.println(sum+"+"+(x%10));
        }
        System.out.println("Sum : "+sum);

    }
}
