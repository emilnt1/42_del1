import gui_main.GUI;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GUI gui = new GUI();




                //From here the main version.
        Player P1 = new Player (0,0,0,0);
        Player P2 = new Player (0,0,0,0);
        Player current;
        Rules player = new Rules(1);
        Dice D1 = new Dice(0);
        Dice D2 = new Dice(0);


        Scanner input = new Scanner(System.in);

        System.out.println("To start game press anything and press enter, to exit write exit and press enter.");
        while(input.hasNextLine()) {
            D1.setFacevalue(0);
            D2.setFacevalue(0);
            P1.reset();
            P2.reset();
            player.setPlayerID(1);
            System.out.println("Press any button and then press enter to roll:");
            while (input.hasNextLine()) {
                input.next();
                gui.setDice(D1.rollDice(), D2.rollDice());
                current = Rules.shiftPlayer(P1, P2, player);

                if (current.getSuddenD() == 1) {
                    Display.display(D1, D2, P1, P2);
                    if (D1.getFacevalue() == D2.getFacevalue()) {
                        break;
                    } else {
                        System.out.println("Player " + player.getPlayerID() + "'s turn");
                    }
                }

                if (current.getSuddenD() == 0) {
                    Rules.addToScore(D1, D2, current);
                    Rules.loseAll(D1, D2, current);
                    Rules.extraTurn(D1, D2, player);
                    Rules.win(current, D1, D2);
                    Display.display(D1, D2, P1, P2);
                    System.out.println("Player " + player.getPlayerID() + "'s turn");
                    Rules.suddenD(current);
                }

            }
            System.out.println("Player " + player.getPlayerID() + " wins");
            System.out.println("To restart game press anything and press enter, to exit write exit and press enter.");
        }
    }


}
