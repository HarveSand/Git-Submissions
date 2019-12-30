
package HollowSquare;

import java.util.Scanner;


public class HollowSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of the Hollow Square shape: ");
        int a = in.nextInt();
        
        for( int y=1; y<=a; y++){
        for (int x=1; x<=a; x++){
            if(x==1 || x==a){
            System.out.print("*"+"  ");}
            else if(y==1||y==a){
                System.out.print("*"+"  ");
            }else{
                System.out.print("   ");
            }
        }System.out.println();
    
    }
    }
    
}
