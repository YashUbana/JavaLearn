//  USE ALT + INSERT KEY FOR SHORTCUT
public class GetterSetter {
    public static void main(String[] args) {
        GetSet x1 = new GetSet();
        x1.setX(9);

        System.out.println(x1.getX());

    }
    static class GetSet{
        private int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }
}
