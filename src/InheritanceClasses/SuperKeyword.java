package InheritanceClasses;

public class SuperKeyword extends MethodOverride {
    int year;

    SuperKeyword(String name, int age, int year){
        super(name, age);
        this.year=year;
    }

}
