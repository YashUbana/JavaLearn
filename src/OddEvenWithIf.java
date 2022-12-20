import java.util.Scanner;

public class OddEvenWithIf {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = a.nextInt();
        System.out.println("You entered "+ x);

        if(x%2==0)
            System.out.println(x+" is EVEN");
        else
            System.out.println(x+" is ODD");
    }
}
