package games;

import java.util.Random;
import java.util.Scanner;

public class Dice {

    public int numOfSides;

//constructor,anropas me keyword new
    public Dice(int numOfSides){
        this.numOfSides = numOfSides;
    }
    public int roll(){
        //i want an integer between 1 and 6!
        Random diceRandom = new Random();
        Scanner diceScanner = new Scanner(System.in);
        int result = diceRandom.nextInt(6)+1;

        //här ska det hämta nåt!

        return result;

    }
}
