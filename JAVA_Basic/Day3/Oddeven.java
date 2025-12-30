package JAVA_Basic.Day3;

import java.util.*;

public class Oddeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:-");

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } 
        else {
            System.out.println(number + " is an odd number.");
        }
    }
    
}
