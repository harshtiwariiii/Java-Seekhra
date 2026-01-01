package DSA.Strings;

import java.util.*;

public class Strings {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");

        String str = scanner.nextLine();
        System.out.println("Original String: " + str);
        
        // String length
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Character at a specific index
        char ch = str.charAt(3);
        System.out.println("Character at index 3: " + ch);
        
        // Substring
        String substr = str.substring(2, 5);
        System.out.println("Substring from index 2 to 5: " + substr);
        
        // String concatenation
        String newStr = str.concat(" Welcome to Java.");
        System.out.println("Concatenated String: " + newStr);
        
        // String comparison
        String str2 = "Hello, World!";
        boolean isEqual = str.equals(str2);
        System.out.println("Are the two strings equal? " + isEqual);
        
        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperStr);
        
        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerStr);
        
        // Replace characters
        String replacedStr = str.replace('a', '7');
        System.out.println("String after replacement: " + replacedStr);

        //compareTo method
        String str3 = "Hello, Java!";  
        int comparisonResult = str.compareTo(str3);
        System.out.println("Comparison result with 'Hello, Java!': " + comparisonResult);
    }
    
}
