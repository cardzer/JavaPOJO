package basic.helloWorld;

import java.util.Random;

// this enum is going to store the values of ORANGE and YELLOW
enum Colours {ORANGE, YELLOW}

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        // logging out hello world to the console
        System.out.println("hello world");
        // this is going to generate a random float
        float value = random.nextFloat();
        System.out.println(Colours.ORANGE + " " + Colours.YELLOW + " " + value);
    }
}
