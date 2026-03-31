package inheritance;

class Animal {
    String animalNameVar;
    int animalAgeVal;

    Animal(String givenName, int givenAge) {
        animalNameVar = givenName;
        animalAgeVal = givenAge;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog(String dogName, int dogAge) {
        super(dogName, dogAge);
    }

    @Override
    void makeSound() {
        System.out.println(animalNameVar + " says: Woof! 🐶");
    }
}

class Cat extends Animal {
    Cat(String catName, int catAge) {
        super(catName, catAge);
    }

    @Override
    void makeSound() {
        System.out.println(animalNameVar + " says: Meow! 🐱");
    }
}

class Bird extends Animal {
    Bird(String birdName, int birdAge) {
        super(birdName, birdAge);
    }

    @Override
    void makeSound() {
        System.out.println(animalNameVar + " says: Tweet! 🐦");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal objDog = new Dog("Tommy", 3);
        Animal objCat = new Cat("Kitty", 2);
        Animal objBird = new Bird("Tweety", 1);

        objDog.makeSound();
        objCat.makeSound();
        objBird.makeSound();
    }
}
