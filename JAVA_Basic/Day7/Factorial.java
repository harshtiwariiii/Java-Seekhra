package JAVA_Basic.Day7;

import java.util.*;

public class Factorial {
    public static int factorialCalc(int n){
        
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorialCalc(n-1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial:");
        int number = sc.nextInt();
        int result = factorialCalc(number);
        System.out.println("Factorial of "+number+" is: "+result);
    }
    
}
