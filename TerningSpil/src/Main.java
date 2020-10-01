import java.awt.*;
import java.util.Scanner;

import gui_fields.GUI_Field;
import gui_main.GUI;
public class Main {

    public static void main(String[] args) {
        Player P1 = new Player(0);
        Player P2 = new Player(0);
        Player current;
        Current player = new Current(1);
        Dice D1 = new Dice(0);
        Dice D2 = new Dice(0);
        Dice D3 = new Dice(0);
        Dice D4 = new Dice(0);

        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            input.next();
            D1.rollDice();
            D2.rollDice();
            current = Current.shiftPlayer(P1,P2,player);
            Current.addToScore(D1,D2,current);
            Current.loseAll(D1,D2,current);
            Current.extraTurn(D1,D2,player);
            Current.win(D1,D2,D3,D4,current);
            Display.Display(D1,D2,P1,P2);
            System.out.println("Player " + player.getPlayer()+"'s turn");
            if(current.getScore() >= 40){
                if(player.getPlayer()==1){
                    System.out.println("Player 2 wins");
                } else {
                    System.out.println("Player 1 wins");
                }
                break;
            }
        }
    }

}
