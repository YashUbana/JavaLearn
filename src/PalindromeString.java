import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String s = a.nextLine();
        String x="";

        for (int i = s.length()-1; i>=0;i--){
            x += String.valueOf(s.charAt(i));
        }
        if(s.equals(x))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");

    }
}
