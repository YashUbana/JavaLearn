package Polymorphism;

public class Polymorphism {
    void test(){}
    public static void main(String[] args) {
        Class1 x = new Class1();
        Class2 y = new Class2();
        Class3 z = new Class3();

        Polymorphism[] value = {x,y,z};

        for (Polymorphism a:value){
            a.test();
        }


    }
}
