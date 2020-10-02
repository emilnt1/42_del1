// Imports GUI and Scanner
import gui_main.GUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Instansiates objects
        GUI gui = new GUI();
        Player P1 = new Player (0,0,0,0);
        Player P2 = new Player (0,0,0,0);
        Player current;
        Rules player = new Rules(1);
        Dice D1 = new Dice(0);
        Dice D2 = new Dice(0);
        String word;

        // Instansiates scanner
        Scanner input = new Scanner(System.in);

        // Prints instructions
        System.out.println("To start game press anything and press enter, to exit write \"exit\" and press enter.");
        System.out.println("To roll press the roll button on the interface.");

        // As long as there's an input the while loop will run.
        while(input.hasNext())
        {
            // Converts the input to lowercase.
            word = input.nextLine().toLowerCase();
            // If the input is "exit" then the program will be terminated.
            if(word.equals("exit")) { System.exit(0); }

            // Sets facevalue to 0 and resets the players scores.
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
                    System.out.println("\nPlayer " + player.getPlayerID() + "'s turn\n");
                    Rules.suddenD(current);
                }

            }

            // Prints out the winner and then further instructions.
            System.out.println("Player " + player.getPlayerID() + " wins");
            System.out.println("To restart game press anything and press enter, to exit write \"exit\" and press enter.");
        }
    }
}
