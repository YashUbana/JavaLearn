public class ThisKeyword {
    public static void main(String[] args) {
        This x1 = new This(1);
        System.out.println(x1.getX());

    }
}
class This{
    private int x;
    public This(int x){
        this.x=x;
    }
    public int getX() {
        return x;
    }
}
