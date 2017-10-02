
/**
 * Write a description of class BlackJack here.
 * Cards that add up to 21
 * 
 * @author Danny Heu 
 * @version 9.25.2017
 */

import java.util.Scanner;
import java.lang.Math;
public class Hand
{
    // instance variables
    private int card;
    private int card2;
    private int cardTotal; 
    
    //Constructor (Zero)
    public Hand() { 
        card = hit();
        card2 = hit();
    }
    
    public int hit() {
        int randCard = (int)(Math.random() * 10 + 1);
        cardTotal += randCard;
        return randCard;
    }
    
    //Accessor Methods
    public int getCard(){
        return card;
    }
    
    public int getCard2(){
        return card2;
    }
    
    public int getTotal(){
        return cardTotal;
    }
     
    public int getHit(){
        return hit();
    }
    
    
}

