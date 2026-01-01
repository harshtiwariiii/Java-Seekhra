
// 344. Reverse String
// Solved
// Easy
// Topics
// Companies
// Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory.

package DSA.Strings.Questions;

/**
 * This class provides a solution to reverse a string represented as a character array in-place.
 */
public class ReverseStrings {

    /**
     * Reverses the given character array in-place using a two-pointer approach.
     *
     * @param s the character array to be reversed
     */
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        // Swap characters from start and end until they meet in the middle
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Main method to demonstrate the reverseString function.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Example 1
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original: " + new String(s1));
        reverseString(s1);
        System.out.println("Reversed: " + new String(s1));

        // Example 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println("Original: " + new String(s2));
        reverseString(s2);
        System.out.println("Reversed: " + new String(s2));
    }
}
