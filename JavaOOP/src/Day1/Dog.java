package Day1;

/**
 * @author Philip Seger
 * NINJA solutions.
 * Created on 10/20/16.
 */
public class Dog extends Animal {
    // create fields (probably should declare as public/private)
    private int size;
    private String breed;
    private String name;

    public Dog(int size, String breed, String name) {
        super(size, breed, name);
    }

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Ruff! Ruff!");
    }
}
