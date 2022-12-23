import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListUniqueSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of ArrayList :");
        int a = in.nextInt();
        ArrayList <Integer>inputs = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            int temp = in.nextInt();
            if (!inputs.contains(temp)){
                inputs.add(temp);
            }
        }
        Collections.sort(inputs);
        System.out.println(inputs);

    }
}
