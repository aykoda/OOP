package  OOP.Exercises;



public class main {

    public static void main(String[] args) {

        /*Bird obj = new Bird("Tweety", "Yellow");
        obj.speak();
        obj.fly();*/

       Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.birdFly();
        pippa.eatPizza();
        pippa.sleep();
        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();

        System.out.println("-------------------------");

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();

        System.out.println("-------------------------");

        Parrot parrot = new Parrot("Parrot", "Green & Blue");
        parrot.speak();
        parrot.fly();
    }
}
