package JAVA_Basic.Day6;

public class SolidRombus {
    public static void main(String[] args){
        int rows = 5;

        for(int i =1;i<=rows;i++){
            //spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=rows;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
