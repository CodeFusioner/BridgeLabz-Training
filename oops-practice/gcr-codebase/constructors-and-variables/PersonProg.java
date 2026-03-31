public class PersonProg {
    String name;
    int age;

    PersonProg(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    PersonProg(PersonProg p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        PersonProg p1 = new PersonProg("Rohan", 22);
        PersonProg p2 = new PersonProg(p1);

        p1.display();
        p2.display();
    }
}
