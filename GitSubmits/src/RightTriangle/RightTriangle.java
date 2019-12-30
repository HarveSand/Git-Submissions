
package RightTriangle;

import java.util.Scanner;

public class RightTriangle {

    
   public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of the Right Triangle shape: ");
        int a = in.nextInt();
        
         for( int y=1; y<=a; y++){
        for (int x=y; x>=1; x--){
            System.out.print("*"+" ");
        }System.out.println();
    
    }
    
}
}
