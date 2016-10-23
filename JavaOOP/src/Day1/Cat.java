package Day1;

/**
 * @author Philip Seger
 * NINJA solutions.
 * Created on 10/20/16.
 */
public class Cat extends Animal {
    private int size;
    private String breed;
    private String name;

    public Cat(int size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }

    public Cat(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Meow! Meow!");
    }
}
