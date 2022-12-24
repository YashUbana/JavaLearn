public class InnerClass {
    public static void main(String[] args) {
        x a = new x();
        x.y u = a.new y();
        u.y1();
    }
}
class x{
    private int x1;
      class y{
        void y1(){
            x1 = 9;
            System.out.println("Inner"+" "+x1);
        }
    }
}
