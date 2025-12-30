package JAVA_Basic.Day6;

public class NumberPyramid {
    public static void main(String[] args) {
        int row =5;
        for(int i=1;i<=row;i++){
            //spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //numbers
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
}
