import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String s = a.nextLine();

        for (int i=s.length()-1; i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
