package Day1;

/**
 * @author Philip Seger
 * NINJA solutions.
 * Created on 10/20/16.
 */
public class Animal {
    private int size;
    private String breed;
    private String name;

    // simple one-arg constructor, setting default values except for name
    public Animal(String name) {
        size = 5;
        breed = "somethingidon'tknow";
        this.name = name;

    }

    public Animal(int size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }

    // default constructor
    public Animal() {
    }

    // action for animal to take
    public void bark() {
        System.out.println("Noise! Noise!");
    }

    public int getSize() {
        return size;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }
}
