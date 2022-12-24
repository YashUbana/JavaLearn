public class ImmutableClass {
    public static void main(String[] args) {
        test f = new test(900);
        System.out.println(f.getX());
    }
}
class test{
    private static int x ;

    public test(int x){
        this.x= x;
    }

    public int getX() {
        return this.x;
    }
}
