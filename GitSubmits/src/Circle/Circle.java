
package Circle;


public class Circle {

    public static void main(String[] args) {
        
       int x,y, rad;
     x=5;
     y=15;
     rad=5;
        for(int i = 0; i<=x+rad; i++){
            for(int g=1; g<=y+rad;g++){
                int x1 = (i-x)*(i-x);
                int y1= (g-y)*(g-y);
                if(Math.abs(x1+y1-rad*rad)<rad){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
    
}
}
