import java.awt.*;

public class CreatingClass {
    public static void main(String[] args) {
        Circle c1 = new Circle(); // Default constructor

        c1.setCenter(new Point(1,2));
        c1.setRadius(5);
        System.out.println("Area : "+ c1.getArea());
        System.out.println("Area : "+ c1.getPerimeter());
    }

}
class Circle{
    Point center;
    double radius;
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

}
