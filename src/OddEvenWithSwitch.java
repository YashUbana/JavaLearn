import java.util.Scanner;



public class OddEvenWithSwitch {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        if(a.hasNextBigInteger()){
            int n = a.nextInt();
            int x = n%2;
            switch (x) {
                case 0:
                    System.out.println("Even");
                    break;
                default:
                    System.out.println("odd");
            }
        }
        else {
            System.out.println("Please enter a number");

        }
    }
}
