package gitChallenge31.GitChallenge31;

public class Palindromes {
    public static void main(String[] args) {

        String word = "level";
        String reverse = "";
        for (int i =word.length()-1; i>=0; i--) {
            reverse += word.charAt(i);
        }

        System.out.println(reverse);


        boolean palindrome = true;
        for (int i = 0; i < word.length()-1; i++) {
            if (word.charAt(i)!= reverse.charAt(i)){
                palindrome= false;
            }
        }

        if (palindrome) {
            System.out.println("Palindrome!");
        }
        else {
            System.out.println("Not a palindrome");
        }

    }
}
