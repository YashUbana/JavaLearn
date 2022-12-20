import java.util.Scanner;

public class SpaceBetween {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String s = a.nextLine();

        for (int i = 0; i<= s.length()-1; i++){
            System.out.print(s.charAt(i)+" ");
        }

    }
}
