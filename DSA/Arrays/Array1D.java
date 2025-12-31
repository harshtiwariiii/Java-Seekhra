package DSA.Arrays;

public class Array1D {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("Original array:");
        printArray(arr);

        // Reverse the array
        reverseArray(arr);

        // Print reversed array
        System.out.println("Reversed array:");
        printArray(arr);
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
