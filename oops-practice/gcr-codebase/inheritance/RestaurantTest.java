package inheritance;

interface Worker {
    void performDuties();
}

class Persons {
    String personNameVar;
    int personIdVar;

    Persons(String givenName, int givenId) {
        personNameVar = givenName;
        personIdVar = givenId;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + personNameVar);
        System.out.println("ID: " + personIdVar);
    }
}

class Chef extends Persons implements Worker {
    String chefSpecialDishVar;

    Chef(String name, int id, String specialDish) {
        super(name, id);
        chefSpecialDishVar = specialDish;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Duty: Cooking " + chefSpecialDishVar);
    }
}

class Waiter extends Persons implements Worker {
    int waiterTableCountVar;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        waiterTableCountVar = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter Duty: Serving " + waiterTableCountVar + " tables");
    }
}

public class RestaurantTest {
    public static void main(String[] args) {
        Chef objChef = new Chef("Rohit", 201, "Pasta");
        Waiter objWaiter = new Waiter("Aman", 301, 5);

        objChef.displayPersonInfo();
        objChef.performDuties();

        System.out.println();

        objWaiter.displayPersonInfo();
        objWaiter.performDuties();
    }
}

