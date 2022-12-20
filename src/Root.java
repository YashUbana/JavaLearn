import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        //Find the biggest root of a number
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int root = 0;
        for (int i = 1; i <= n; i++) {
            if (i * i <= n) {
                root = i;
            }
        }
        System.out.println(root);

    }
}
