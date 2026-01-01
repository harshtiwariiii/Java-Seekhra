package DSA.Strings;

public class Stringsbuilder {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Appending text
        sb.append(", World!");
        System.out.println("After append: " + sb.toString());

        // Inserting text at a specific index
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb.toString());

        // Replacing text
        sb.replace(6, 15, "Amazing");
        System.out.println("After replace: " + sb.toString());

        // Deleting text
        sb.delete(5, 12);
        System.out.println("After delete: " + sb.toString());

        // Reversing the StringBuilder content
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        // Converting StringBuilder to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
    
}
