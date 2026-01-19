package review;
class Parent {
    int id;
    String name;
    public void display(){
        System.out.println("Hey , parent method");
    }
}

class Child extends Parent{
    @Override
    public void display(){
        System.out.println("Hey, child method");
    }
}
public class MethodOverriding{
    public static void main(String[] args) {
        Parent p = new Child();

        p.display();
    }
}



