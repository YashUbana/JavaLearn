import java.util.Scanner;

public class MaxMinValue {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter numbers :");
        int x = a.nextInt();
        int max = x;
        int min = x;
        for(;;){
            x = a.nextInt();
            if (x<0)
                break;
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }

        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }
}
