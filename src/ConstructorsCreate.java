import java.awt.*;

public class ConstructorsCreate {
    public static void main(String[] args) {
        System.out.println( Circle1.getNumberOfCircle() );
        Circle1 c1 = new Circle1(new Point(1,2),4); // Constructor with Parameters
        c1.numberOfCircle =10;
        Circle1 c2 = new Circle1(new Point(1,3),6); // Constructor with Parameters
        System.out.println( c2.getNumberOfCircle() );

    }

}
class Circle1{
    Point center;
    double radius;
    static int numberOfCircle;
    double getPerimeter(){
        return 2*Math.PI*radius;
    }
    double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }
    void setCenter(Point newCenter){
        center = newCenter;
    }
    static int getNumberOfCircle(){
        return numberOfCircle;
    }

    Circle1(){
        numberOfCircle++;
    }

    Circle1(Point initialCenter, double initialRadius){//Constructor with parameter
        numberOfCircle++;
        center = initialCenter;
        radius = initialRadius;
    }


}
