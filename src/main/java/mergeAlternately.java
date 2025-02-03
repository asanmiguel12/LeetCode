public class mergeAlternately {
/**
    You are given two strings word1 and word2.
    Merge the strings by adding letters in alternating order, starting with word1.
    If a string is longer than the other, append the additional letters onto the end of the merged string.
    Return the merged string.
 */

  public static String mergeAlternately (String word1, String word2) {

        String[] ch = new String[]{word1.toString()};

        // Traverse the character array
        for (int i = 0; i < ch.length; i++) {

            // Print current character
            System.out.print(word1.charAt(0));
            System.out.print(word2.charAt(0));
            System.out.print(word1.charAt(1));
            System.out.print(word2.charAt(1));
            System.out.print(word1.charAt(2));
            System.out.print(word2.charAt(2));

        }
        return null;
    }
}
