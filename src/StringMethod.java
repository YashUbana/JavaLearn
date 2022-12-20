public class StringMethod {
    public static void main(String[] args) {
        String s= "YaSH ubANa";
        String s1=s.toLowerCase();
        System.out.println(s1);
        String s2 = s.toUpperCase();
        System.out.println(s2);
        int s3 = s.length();
        System.out.println(s3);

        System.out.println(s1.lastIndexOf("a") );
        System.out.println(s.concat(" is a good boy"));

        String name1 = new String("Yash");
        String name2 =  "Yash with new";
        System.out.println(name1+" "+name2);

    }
}
