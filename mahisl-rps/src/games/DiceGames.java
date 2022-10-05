package games;

import games.Dice;

import java.util.Scanner;

public class DiceGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice(6);

        Player nadja = new Player("nadja", 0);


        //1. anropa roll() och spara i en variabel
        int result = dice.roll();

        for (int i = 0; i < 3; i++) {


            //2. spelaren skall gissa! MEN MÅSTE GISSA INOM RÄTT INTERVALL:1-6
            boolean guessIsOutOfBounds = true;
            int guess = 0;

            while (guessIsOutOfBounds) {
                System.out.println("guess what the dice rolled");
                guess = scanner.nextInt();
                if (guess >= 1 && guess <= 6) {
                    guessIsOutOfBounds = false;
                }

            }

            //3. skriv ut resultat
            System.out.println("you guessed" + guess);

            //4,skriv ut om spelaren gissade rätt eller fel
            if (result == guess) {
                System.out.println("the dice rolled" + result + ".\n" + "you win");
                break;


            } else {
                System.out.println("wrong guess! you have " + (2 - i) + " guesses left");
            }
        }
    }
}


        // if och else satser, booleans, mattematiska/logiska operatorer





