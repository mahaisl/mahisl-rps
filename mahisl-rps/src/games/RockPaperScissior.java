package games;

import java.util.Scanner;

public class RockPaperScissior {

    Player player;

    Fist aIFist;

    RockPaperScissior(String playerName, int playerScore) {
        player = new Player(playerName, playerScore);
        aIFist = new Fist();
        
    }


    public static void main(String[] args) {
        RockPaperScissior game=new RockPaperScissior("Marcus",0);
        game.playGame();
    }

    void playGame() {

        for (int i = 1; i < 4; i++) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Sten(1), Sax(2) eller Påse(3)?");
            int playerChoice = scanner.nextInt();

            int min = 1;
            int max = 3;

            //int aiChoice = aIFist.pay();
            int aiChoice = (int) (Math.random() * (max - min)) + 1;

            if (playerChoice == aiChoice) {
                System.out.println("Ni valde samma. Oavgjort!!");
            }


            if (playerChoice == 2 & aiChoice == 1) {
                System.out.println("Du tog sax. Datorn tog sten. Du förlorade!");
            }
            if (playerChoice == 3 & aiChoice == 1) {
                System.out.println("Du tog påse. Datorn tog sten. Du vann!");
            }


            if (playerChoice == 1 & aiChoice == 2) {
                System.out.println("Du tog sten. Datorn tog sax. Du vann!");
                player.setScore(player.getScore()+1);
            }
            if (playerChoice == 3 & aiChoice == 2) {
                System.out.println("Du tog påse. Datorn tog sten. Du förlorade!");
                player.setScore(player.getScore()-1);
            }


            if (playerChoice == 1 & aiChoice == 3) {
                System.out.println("Du tog sten. Datorn tog påse. Du Förlorade!");
                player.setScore(player.getScore()-1);
            }
            if (playerChoice == 2 & aiChoice == 3) {
                System.out.println("Du tog sax. Datorn tog påse. Victory!");
                player.setScore(player.getScore()+1);
            }
            System.out.println("Player score is " + player.getScore());

        }

    }


}



