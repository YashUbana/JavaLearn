public class RectangleClass {
    public static void main(String[] args) {
        Rectangle x = new Rectangle(4,2);
        System.out.println("Area: "+x.getArea());
        System.out.println("Area: "+x.getPerimeter());


    }
}
class Rectangle{
    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(){
        this.width = 1;
        this.height = 1;
    };
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
}
