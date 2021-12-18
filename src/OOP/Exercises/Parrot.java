package OOP.Exercises;

//The Pigeon extends the base class Bird
public class Parrot extends Bird {

    //The Pigeon constructor calls the base class Bird constructor
    //The name and color parameters are passed to the Bird constructor
    public Parrot(String name, String color) {
        super(name, color);
    }

    public void sleep() {
        System.out.println("I'm a sleeping parrot!");
    }

    @Override
    public void fly() {
        System.out.println("Yo! I'm " + name + " and I can fly!.");
    }

    @Override
    public void speak() {
        System.out.println("Yooo! I'm " + name + " and I'm a " + color + " parrot.");
    }
}
