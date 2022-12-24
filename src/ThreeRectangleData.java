import java.util.Scanner;

public class ThreeRectangleData {
    public static void main(String[] args) {
        Rectangle[] a = new Rectangle[3];
        Scanner input = new Scanner(System.in);

        for(int i=0; i<a.length; i++){
            System.out.print("Do you want to add a rectangle :(y/n):");

            char choice = input.next().charAt(0);
            if (choice == 'y')
                a[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            else
                a[i]= new Rectangle();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Rectangle "+ (i+1)+ " Width "+ a[i].getWidth() +" Length "+a[i].getHeight());
            System.out.println("Rectangle "+(i+1)+ " area "+ a[i].getArea()+" Perimeter "+a[i].getPerimeter());
        }
    }
}
