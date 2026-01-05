package DSA.BitManupulation;

public class Updatebit {
    public static void main(String[] args){
        int n =5;
        int pos =1;
        int value =0;

        int bitMask = 1<<pos;

        if(value ==1){
            //set bit
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            //clear bit
            int notBitMask = ~bitMask;
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }
    }
    
}
