package JAVA_Basic.Day6;

public class ButterflyPattern {
    public static void main(String[] args) {
        int rows = 5;

        // Upper half of the butterfly
        for (int i = 1; i <= rows; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces between wings
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = rows; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces between wings
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
