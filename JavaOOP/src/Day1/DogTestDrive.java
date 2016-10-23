package Day1;

/**
 * @author Philip Seger
 * NINJA solutions.
 * Created on 10/20/16.
 */
public class DogTestDrive {
    public static void main(String[] args) {
        Dog d1 = new Dog(4, "Golden Puddle", "Dag");
        d1.bark();

        Cat c1 = new Cat(4, "Maine Coon", "Mr. Whiskers");
        c1.bark();

        Animal a1 = new Cat("Mr. Snufflescratch");
        Animal a2 = new Dog("Ms. Cat");
        a1.bark();
        a2.bark();


        // ignore this unless you want nicely formatted string values
        String s1 = String.format("this stuff %1$S is a value", 592);
        System.out.println(s1);

        // dog array stuff from exercise 2
        Dog[] ds = new Dog[3];
        ds[0] = new Dog(1, "Gold pupper", "Dag");
        ds[1] = new Dog(2, "Border Collar", "Frwarf");
        ds[2] = new Dog(10, "Heavy pupper", "Big");

        // ruff for each dog
        for (int i = 0; i < ds.length; i++) {
            ds[i].bark();
        }

        // set first as largest because why not
        Dog largest = ds[0];
        // big dog finder
        for (int i = 0; i < ds.length; i++) {
            if (ds[i].getSize() > largest.getSize()) {
                largest = ds[i];
            }
        }
        System.out.println("largest is " + largest.getName());
    }
}
