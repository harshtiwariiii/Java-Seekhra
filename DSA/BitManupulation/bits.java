package DSA.BitManupulation;

import java.util.*;

public class bits {
    public static void main(String[] args){
        int n =5;
        int pos =3;
        int bitMask = 1<<pos;  

        if((bitMask & n) == 0){
            System.out.println("Bit is 0");
        }
        else{
            System.out.println("Bit is 1");
        }

    }

}