package Day1;

/**
 * @author Philip Seger
 * NINJA solutions.
 * Created on 10/20/16.
 */
public class MyFirstApp {
    public static void main(String[] args) {
        // example of printing
        System.out.println("I Rule!");
        System.out.println("The World");

        // example of while loop
        int x = 0;
        while (x < 12) {
            System.out.println("The value of x is " + x);
            x++; // x+=1;
        }

        // example of for loop
        for (int i = 0; i < 12; i++) {
            System.out.println("The value of i is " + i);
            i++;
        }

        // example of if in a for loop
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("The number " + i + " is even");
            }
        }
    }
}
