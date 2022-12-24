import java.awt.*;

public class ConstructorsCreate {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(new Point(1,2),4); // Constructor with Parameters

        System.out.println(c1.getRadius());
        System.out.println(c1.getNumberOfCircle());

    }

}
class Circle1{

    Point center;
    private double radius;
    private static int numberOfCircle;
    double getPerimeter(){
        return 2*Math.PI*radius;
    }
    double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    void setRadius(double radius){
        this.radius = (radius >=0)? radius:0;
    }
    double getRadius(){
        return radius;
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
