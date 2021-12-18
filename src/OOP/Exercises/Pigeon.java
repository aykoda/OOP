package OOP.Exercises;

//The Pigeon extends the base class Bird
public class Pigeon extends Bird {

    //The Pigeon constructor calls the base class Bird constructor
    //The name and color parameters are passed to the Bird constructor
    public Pigeon(String name, String color) {
        super(name, color);
    }

    public void eatPizza() {
        System.out.println("Delicious pizza!");
    }

    public void sleep() {
        System.out.println("I'm a sleeping pigeon!");
    }

    @Override
    public void fly() {
        System.out.println("Yo! I can fly.");
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " pigeon.");
    }
}