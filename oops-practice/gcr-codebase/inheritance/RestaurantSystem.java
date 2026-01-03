// Superclass Person
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface Worker
interface Worker {
    void performDuties();
}

// Subclass Chef (inherits Person + implements Worker)
class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is cooking food in the kitchen.");
    }
}

// Subclass Waiter (inherits Person + implements Worker)
class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is serving customers at the tables.");
    }
}

// Main class
public class RestaurantSystem {
    public static void main(String[] args) {

        Chef chef = new Chef("Rahul", 101);
        Waiter waiter = new Waiter("Amit", 202);

        chef.displayDetails();
        chef.performDuties();

        System.out.println();

        waiter.displayDetails();
        waiter.performDuties();
    }
}
