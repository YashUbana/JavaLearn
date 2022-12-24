public class PrivateAccess {
    public static void main(String[] args) {
        Text text = new Text();
        text.setX(10);
        System.out.println(text.getX());



    }
    static public class Text {
        private int x;
        int getX(){
            return x;
        }
        void setX(int x){
            this.x=x;
        }
    }
}
