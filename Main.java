
/**
 * Write a description of class Main here.
 * 
 * @author Danny Heu
 * @version 9.26.2017
 */

import java.util.Scanner;
import java.lang.Math;
public class Main
{
    // instance variables - replace the example below with your own
    private boolean loop = false;

    public void begin() {
        Scanner start = new Scanner(System.in);
        System.out.println("Do you want to play BlackJack? Press Enter to play" );
        
        
        
        String play = start.nextLine();
        System.out.println("Lets Play");
        loop = true;

        while (loop) {
            Hand player = new Hand();
            Hand dealer = new Hand();
            System.out.println("Your hand, " + player.getCard() +" " + player.getCard2()); 
            System.out.println("Your total, " + player.getTotal());
            System.out.println("Dealer shows, " + dealer.getCard());
         
            
             while (player.getTotal() < 17) {
              System.out.println("Your total, " + player.getTotal() + " is less than 17, you have to keep hitting.");
              System.out.println("Your new card, " + player.getHit() + "\n" + "Your total, " + player.getTotal());
              if (player.getTotal() > 17) {
                  break;
                }
            }
           
            System.out.println("Do you want to hit? (Y/N) ");
            String hitVal = start.next();
            
            if (hitVal.equals("y")) {
                System.out.println("Your new card, " + player.getHit() + "\n" + "Your total, " + player.getTotal());
             } else if (hitVal.equals("n")) {
                System.out.println("Your total, " + player.getTotal());
              }
                
            int checkHand = 21;
            if (player.getTotal() > checkHand) {
                System.out.println("BUSTED, your Total was over 21");
                break;
            }
            
            int win = 21;
            if (player.getTotal() > win) {
                System.out.println("Your Total equals 21, YOU WIN!!");
                break;
            }
            
            while (dealer.getTotal() < 17) {
                System.out.println("The dealer's total is less than 17, she has to keep hitting. ");
                System.out.println("Your new card, " + dealer.getHit() + "\n" + "Your total, " + player.getTotal());
              if (player.getTotal() > 17) {
                  break;
                }
            }
        }
    }

        
}

