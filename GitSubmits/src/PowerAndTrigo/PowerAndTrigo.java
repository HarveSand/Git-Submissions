
package PowerAndTrigo;

import java.util.Scanner;


public class PowerAndTrigo {

 
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
    //Power
        System.out.println("Enter a number:");
        int x = in.nextInt();
        System.out.println("Enter its exponent value:");
        int y=in.nextInt();
        double z=Math.pow(x,y);
        System.out.println(x+" raised to "+y+" is equal to "+z);
        System.out.println("\n\n");
        
   //Trigo     
        System.out.println("Enter first angle:");
        int a = in.nextInt();
        System.out.println("Enter second angle:");
        int b=in.nextInt();
        double c=Math.sin(a);
        double d=Math.cos(b);
        double e= c/d;     
        System.out.println("Since tan x is equal to sin x/cos x. Therefore the value of tan x is "+e+" .");
      
    }
    
}
