package gitChallenge31.GitChallenge31;

import java.awt.*;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] answers = {"c", "b", "b"};
        String[] responses = {"", "", ""};

        System.out.println("What is 2 + 2?");
        System.out.println("a) 2");
        System.out.println("b) 3");
        System.out.println("c) 4");


        System.out.println("What is the capital of Illinois?");
        System.out.println("a) Chicago");
        System.out.println("b) Springfield");
        System.out.println("c) Schaumburg");

        System.out.println("What is the fastest animal?");
        System.out.println("a) Tiger");
        System.out.println("b) Cheetah");
        System.out.println("c) Wolf");

        responses [0] = sc.next();
        responses [1] = sc.next();
        responses [2] = sc.next();

        int score = 0;

        for (int i = 0; i < 2; i++) {
            if (responses[i].equalsIgnoreCase(answers[i])){
                score++;
            }
        }

        System.out.println("Score :" + score + "/3");



    }

}
