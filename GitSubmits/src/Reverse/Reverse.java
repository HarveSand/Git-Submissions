
package Reverse;

import java.util.Scanner;


public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word that you want to reverse:");
        String word = sc .next();
        System.out.println("\nThe reverse version of the word you entered is: \n");
        word = new StringBuffer(word).reverse().toString();
        System.out.println(word);
    }
    
}
