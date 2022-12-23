import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperation {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();
        boolean q = true;
        while (q) {

            System.out.println("1) Add Item");
            System.out.println("2) Remove Item");
            System.out.println("3) Display Item ");
            System.out.println("4) Exit");
            System.out.print("Enter you choice: ");
            int a = x.nextInt();

            switch (a) {
                case 1: {
                    System.out.print("Enter element to add : ");
                    int temp = x.nextInt();
                    n.add(temp);
                    break;
                }
                case 2: {
                    System.out.print("Enter element to remove :");
                    int temp = x.nextInt();
                    if(n.contains(temp)){
                        n.remove(Integer.valueOf(temp));
                        System.out.println("Removed");
                    }
                    else
                        System.out.println("No found");
                    break;
                }
                case 3: {
                    System.out.println(n);
                    break;
                }
                case 4:{
                    System.out.println("Good Bye");
                    q = false;
                    break;
                }
                default:{
                    System.out.println("Please enter value among 1,2,3,4");
                    break;
                }

            }
        }
    }
}
