import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        checkBetweenTwoNumber(10,20);

    }
    public static boolean checkPrime(int a){
        for(int i=2; i<=a/2; i++)
            if (a % i == 0)
                return false;
        return true;
    }
    public static void checkBetweenTwoNumber(int start, int end){
        for(int i=start; i<=end; i++)
            if(checkPrime(i))
                System.out.print(i+" ");
    }
}

