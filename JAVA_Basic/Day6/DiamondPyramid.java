package JAVA_Basic.Day6;

public class DiamondPyramid {
    public static void main(String[] args) {
        int rows =5;
        //upper half
        for(int i=1;i<=rows;i++){
            //spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=rows;i>=1;i--){
            //spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
