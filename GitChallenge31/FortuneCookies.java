package gitChallenge31.GitChallenge31;

import java.util.Random;

public class FortuneCookies {
    static String [] fortuneCookies = {"1. A day without a friend is like a pot without a single drop of honey left inside." ,
            "2. Friendship is the hardest thing in the world to explain. It's not something you learn in school." +
                    " But if you haven't learned the meaning of friendship, you really haven't learned anything." ,
            "3. Good friends are like stars. You don't always see them, but you know they're always there.",
            "4. Things are never quite as scary when you've got a best friend.",
            "5 Hard work beats talent when talent doesn’t work hard.",
            "6. If your teacher, coach, or mentor believes you can do something, you’re more likely to do it.",
            "7. I do not know anyone who has got to the top without hard work. That is the recipe. " +
                    "It will not always get you to the top, but should get you pretty near.",
            "8. Whatever we believe about ourselves and our ability comes true for us.",
            "9. Talent is cheaper than table salt. What separates the talented individual from the successful one" +
                    " is a lot of hard work.", "10. Impossible is just an opinion.",
            "11. Doing the best at this moment puts you in the best place for the next moment.",
            "12. The only difference between success and failure is the ability to take action.",
            "13. If you love your work, you’ll be out there every day trying to do it the best you possibly can, " +
                    "and pretty soon everybody around will catch the passion from you – like a fever. ",
           "14. Try not to become a man of success. Rather become a man of value.",
            "15. Do one thing every day that scares you."



    };

    public static void main(String[] args) {
        Random rand = new Random();
        int r = rand.nextInt(fortuneCookies.length);
        System.out.println(fortuneCookies[r]);


    }
}
