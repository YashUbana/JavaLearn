import java.util.Scanner;

public class MethodEx1 {
    public static void main(String[] args) {
        name();
        age();
        PrimeNumbers.checkBetweenTwoNumber(10,20);
        
    }
    public static void name(){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter your name: ");
        a.nextLine();
    }
    public static void age(){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter your age: ");
        a.nextInt();

    }
}
