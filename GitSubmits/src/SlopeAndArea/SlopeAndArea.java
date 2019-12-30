
package SlopeAndArea;

import java.util.Scanner;

public class SlopeAndArea {
  
    
public static void main(String[] args) {    
    Scanner in = new Scanner (System.in);
    
//Slope
double x1=5;
double x2=10;     
double y1=5;   
 double y2=10;
double m=(x2-x1)/(y2-y1);     
       System.out.println("Slope is "+m+" cm");     
       System.out.println("\n\n");
//Area of a Circle
       System.out.println("Area of a Circle (in cm)");
   double R,Pi, Area;
   
        System.out.println("Enter Radius");  
   R=in.nextDouble ();
   Pi=3.14159;
   
     Area = (Pi*(R)*(R));
        System.out.println("The area of the circle is "+Area+" cm");
        System.out.println("\n\n");
       
        
//Area of a Square        
        System.out.println("Area of a square");
     System.out.println("Enter Side");
        double a = in.nextDouble ();
             double A2= a*a;
        System.out.println("The area of the square is "+A2+" cm");
        System.out.println(" \n\n");
       
        
//Area of a Rectangle        
        System.out.println("Area of a Rectangle");
    double L,W,Rectangle;
        System.out.println("Enter Length");
        L=in.nextDouble ();
        System.out.println("Enter Width");
        W=in.nextDouble ();
        Rectangle = L*W;
        System.out.println("The area of the rectangle is "+Rectangle+" cm");    
        System.out.println("\n\n");
    
        
//Area of a Triangle       
        System.out.println("Aree of a triangle");
    double B,H, Triangle;
        System.out.println("Enter Base");
    B=in.nextDouble ();
        System.out.println("Enter Height");
    H=in.nextDouble ();
    Triangle= 0.5*B*H;
        System.out.println("The area of the triangle is "+Triangle+" cm");
}
}
