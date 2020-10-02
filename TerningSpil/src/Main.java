import gui_main.GUI;

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
        String word = "";

        Scanner input = new Scanner(System.in);

        System.out.println("To start game press anything and press enter, to exit write \"exit\" and press enter.");
        System.out.println("To roll press the roll button on the interface.");

        while(input.hasNext()) {
            word = input.nextLine().toLowerCase();
            if(word.equals("exit")) {
                System.exit(0);
            }
            D1.setFacevalue(0);
            D2.setFacevalue(0);
            P1.reset();
            P2.reset();
            player.setPlayerID(1);
                while(gui.getUserLeftButtonPressed("Press left button to roll","roll","-")){
                    gui.setDice(D1.rollDice(), D2.rollDice());
                    current = Rules.shiftPlayer(P1, P2, player);

                    if (current.getSuddenD() == 1) {
                        Display.display(D1, D2, P1, P2);
                        if (D1.getFacevalue() == D2.getFacevalue()) {
                            break;
                        } else {
                            System.out.println();
                            System.out.println("Player " + player.getPlayerID() + "'s turn");
                            System.out.println();
                        }
                    }

                    if (current.getSuddenD() == 0) {
                        Rules.addToScore(D1, D2, current);
                        Rules.loseAll(D1, D2, current);
                        Rules.extraTurn(D1, D2, player);
                    if(Rules.win(current, D1, D2)){
                        break;
                    }
                    Display.display(D1, D2, P1, P2);
                    System.out.println();
                    System.out.println("Player " + player.getPlayerID() + "'s turn");
                    System.out.println();
                    Rules.suddenD(current);
                }

            }


            System.out.println("Player " + player.getPlayerID() + " wins");
            System.out.println("To restart game press anything and press enter, to exit write \"exit\" and press enter.");
        }
    }
}
