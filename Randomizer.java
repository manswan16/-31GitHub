package gitChallenge31;

import java.util.Random;

public class Randomizer {
    public static void main(String[] args) {
        Random num = new Random();
        int n = num.nextInt(10)+1;
        System.out.println("The random number is :" + n );


    }
}
