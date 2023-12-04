package gitChallenge31.GitChallenge31;

public class FindDuplicates {
    public static void main(String[] args) {
        String sentence = "Let's check, how many duplicates are here";
        System.out.println(sentence);

        String characters = "";
        String duplicates = "";
        for (int i = 0; i < sentence.length(); i++) {
            String current = Character.toString(sentence.charAt(i));
            if (characters.contains(current)) {
                if (!duplicates.contains(current)) {
                    duplicates += current + ", ";
                }
            }
            characters += current;
        }

        System.out.println(duplicates);

    }
}
