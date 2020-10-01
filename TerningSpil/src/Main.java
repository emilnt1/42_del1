import gui_main.GUI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GUI gui = new GUI();




                //From here the main version.
        Player P1 = new Player(0,0,0,0);
        Player P2 = new Player(0,0,0,0);
        Player current;
        Rules player = new Rules(1);
        Dice D1 = new Dice(0);
        Dice D2 = new Dice(0);
        int suddenD = 0;


        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            input.next();
            gui.setDice(D1.rollDice(), D2.rollDice());
            current = Rules.shiftPlayer(P1,P2,player);
            if(suddenD == 0) {
                Rules.addToScore(D1, D2, current);
                Rules.loseAll(D1, D2, current);
                Rules.extraTurn(D1, D2, player);
                Rules.win(current, D1, D2);
                Display.display(D1, D2, P1, P2);
                System.out.println("Player " + player.getPlayerID() + "'s turn");
                if (current.getScore() >= 40) {
                    if (player.getPlayerID() == 1) {
                        System.out.println("Player 2 wins");
                    } else {
                        System.out.println("Player 1 wins");
                    }
                    break;
                }
            }
        }
    }

}
