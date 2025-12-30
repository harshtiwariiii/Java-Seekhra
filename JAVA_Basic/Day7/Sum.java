package JAVA_Basic.Day7;

import java.util.*;

public class Sum {

    
    public static int sum (int a ,int b){       //function definition
        return a+b;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//scanner object
        System.out.println("Enter first number:");//input
        int num1 = sc.nextInt();//input
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        int result = sum(num1,num2);//function call
        System.out.println("The sum is: "+result);//output


    }
    
}
