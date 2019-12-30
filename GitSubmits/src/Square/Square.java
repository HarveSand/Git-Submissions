
package Square;

import java.util.Scanner;


public class Square {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of the Square shape: ");
        int a = in.nextInt();
        
         for( int y=1; y<=a; y++){
        for (int x=1; x<=a; x++){
            System.out.print("* ");
        }System.out.println();
    
    }
    }
}
