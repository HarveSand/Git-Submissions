package riddled;

import java.util.Scanner;

public class Riddled {

    public static void main(String[] args) {
        
        int e;
        int tries1 = 4;
        int tries2 = 4;
        int tries3 = 4;
        int tries4 = 4;
        int tries5 = 4;
        String ans1 = "72";
        String ans2 = "Duterte";
        String ans3 = "1";
        String ans4 = "Mother";
        String ans5 = "None";
        String n1;
        String n2;
        String n3;
        String n4;
        String n5;
        
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("RRRRRR   IIIIII  DDDDD   DDDDD   LL     EEEEEEE  DDDDD       ");
        System.out.println("RR   RR    II    DD  DD  DD  DD  LL     EE       DD  DD  ");
        System.out.println("RR   RR    II    DD  DD  DD  DD  LL     EE       DD  DD ");
        System.out.println("RRRRRR     II    DD  DD  DD  DD  LL     EEEEEE   DD  DD      ");
        System.out.println("RR   RRR   II    DD  DD  DD  DD  LL     EE       DD  DD  ");
        System.out.println("RR    RR IIIIII  DDDDD   DDDDD   LLLLLL EEEEEEE  DDDDD  \n ");
        System.out.println("A game of logic and wits.");
        int x;
        do {
            System.out.println("Enter 1 to continue: \n");
            x = input.nextInt();
        } while (x != 1);

        System.out.println("~~~~~~~~~~~~~Instructions~~~~~~~~~~~~~~");
        System.out.println("Give your best answer in every Riddle.");
        System.out.println("You have 3 tries in every question.\n");
        System.out.println("Answer all 5 Riddles to Complete the Game.");
        System.out.println("Good luck!");
        do{
        System.out.println("Enter 1 to Continue, 2 to Exit.");
        n = input.nextInt();
            
            if(n==1)
                break;
         if(n==2)
                System.out.println("Thank you for Trying to Play!");
            System.exit(0);}
        while(n!=1);
            
        System.out.println("~~~~~~~~~~~~~~~Question #1~~~~~~~~~~~~~~~");
        System.out.println("Divide 30 by half and add 12. What is the result?");
       
        do {
            System.out.println(tries1+" Tries Left");
            System.out.println("Answer:");
            n1 = input.nextLine();
              
            tries1--;
            if(tries1==0){
                System.out.println("You used up all your tries.");
                System.out.println("Please restart the game.");
                do{
                    System.out.println("Enter 1 to Exit the Game.");
                    e=input.nextInt();
                }while(e!=1);
                System.exit(0);
                
            }
        } while (!ans1.equals(n1));
        System.out.println("\nAwesome You answered the 1st Riddle.\nNow Try this.");
        
        
        System.out.println("~~~~~~~~~~~~~~~Question #2~~~~~~~~~~~~~~~");
        System.out.println("What is the Philippine President’s last name on 2003?");
        do {
            System.out.println(tries2+" Tries Left");
            System.out.println("Answer:");

            n2 = input.nextLine();
            tries2--;
            if(tries2==0){
                System.out.println("You used up all your tries.");
                System.out.println("Please restart the game.");
                do{
                    System.out.println("Enter 1 to Exit the Game.");
                    e=input.nextInt();
                }while(e!=1);
                System.exit(0);
            }
        } while (!ans2.equals(n2));
        System.out.println("\nGood job! 3 more to go.\nNow this.");
        
        System.out.println("~~~~~~~~~~~~~~~Question #3~~~~~~~~~~~~~~~");
        System.out.println("How many times can you subtract 10 from 100? e.g. 1,2,3, etc.");
        do {
            System.out.println(tries3+" Tries Left");
            System.out.println("Answer:");

            n3 = input.nextLine();
            tries3--;
            if(tries3==0){
                System.out.println("You used up all your tries.");
                System.out.println("Please restart the game.");
                do{
                    System.out.println("Enter 1 to Exit the Game.");
                    e=input.nextInt();
                }while(e!=1);
                System.exit(0);
            }
        } while (!ans3.equals(n3));
        System.out.println("\nWay to go! Your almost there.");
        
        System.out.println("~~~~~~~~~~~~~~~Question #4~~~~~~~~~~~~~~~");
        System.out.println("A boy and a doctor are fishing. \nThe boy is the doctor’s son; however, the doctor \nis not the boy’s father. Who is the doctor?");
        do {
            System.out.println(tries4+" Tries Left");
            System.out.println("Answer:");

            n4 = input.nextLine();
            tries4--;
            if(tries4==0){
                System.out.println("You used up all your tries.");
                System.out.println("Please restart the game.");
                do{
                    System.out.println("Enter 1 to Exit the Game.");
                    e=input.nextInt();
                }while(e!=1);
                System.exit(0);
            }
        } while (!ans4.equals(n4));
        System.out.println("\nFantastic! Now for the last one...");
        
        System.out.println("~~~~~~~~~~~~~~~Question #5~~~~~~~~~~~~~~~");
        System.out.println("Ms. Jones lives in California \nwith her 2 children, Emma and Stephen. \nWhat is the last name of her husband?");
        do {
            System.out.println(tries5+" Tries Left");
            System.out.println("Answer:");

            n5 = input.nextLine();
            tries5--;
            if(tries5==0){
                System.out.println("You used up all your tries.");
                System.out.println("Please restart the game.");
                do{
                    System.out.println("Enter 1 to Exit the Game.");
                    e=input.nextInt();
                }while(e!=1);
                System.exit(0);
            }
        } while (!ans5.equals(n5));
        
        
         System.out.println("CONGRATULATIONS!!! \nYou answered all 5 riddles and won the game!!!");
         
         System.out.println("Thank you so much for playing!");
            System.out.println("I hope you enjoyed it.");
            System.out.println("Peace out!");
            System.out.println("~Bumnsxd232");
            System.exit(0);
            
    }

}
