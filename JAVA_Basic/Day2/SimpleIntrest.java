package JAVA_Basic.Day2;

import java.util.*;

class SimpleIntrest{
    public static void main(String args[]){
        // int principal = 1000; // Principal amount
        // int rate = 5; // Rate of interest
        // int time = 3; // Time in years

        Scanner sc = new Scanner(System.in);
        int Principal = sc.nextInt();
        int Rate = sc.nextInt();
        int Time = sc.nextInt();


        // Calculate simple interest
        int simpleInterest = (Principal * Rate * Time) / 100;

        // Print the result
        System.out.println("Simple Interest: " + simpleInterest);
    }
}