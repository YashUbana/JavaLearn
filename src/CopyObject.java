public class CopyObject {
    public static void main(String[] args) {
        GetCopy x = new GetCopy("yash",12);
        GetCopy y = new GetCopy("numb",14);

        y.copy(x);
        System.out.println(x);
        System.out.println(y);
        System.out.println();
        System.out.println(x.getAge());
        System.out.println(x.getName());
        System.out.println();
        System.out.println(y.getAge());
        System.out.println(y.getName());
    }
}
class GetCopy{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    GetCopy(String name, int age){
        this.age=age;
        this.name=name;
    }

    public void copy(GetCopy x) {
        this.setAge(x.getAge());
        this.setName(x.getName());
    }
}
