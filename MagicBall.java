package gitChallenge31;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {

        System.out.println("Enter your question :");

        Scanner sc = new Scanner(System.in);
        sc.next();
        sc.close();

        Random rand = new Random();
        int ran = rand.nextInt(5);

        if (ran == 0){
            System.out.println("As I see it, yes");
        } else if (ran == 1){
            System.out.println("Signs point to yes");

        }else if (ran == 2){
            System.out.println("Reply hazy, try again");

        }else if (ran == 3){
            System.out.println("Don't count on it");

        }else if (ran == 4){
            System.out.println("Outlook not so good");

        }



    }
}
