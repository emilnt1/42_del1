import gui_main.GUI;

public class Test {
    public static void main(String[] args) {

        GUI gui = new GUI();
        // Loop for player-1
        for(int a = 0; a < 1000; a++){

            Player P1 = new Player(0,0,0,0);
            Player P2 = new Player(0,0,0,0);
            Player current;
            Rules player = new Rules(1);
            Dice D1 = new Dice(0);
            Dice D2 = new Dice(0);
            gui.setDice(D1.rollDice(), D2.rollDice());
            System.out.println("Player-1 " +D1);
        }
        //Loop for player-2
        for(int b = 0; b < 1000; b++){
            Player P1 = new Player(0,0,0,0);
            Player P2 = new Player(0,0,0,0);
            Player current;
            Rules player = new Rules(1);
            Dice D1 = new Dice(0);
            Dice D2 = new Dice(0);
            gui.setDice(D1.rollDice(), D2.rollDice());
            System.out.println("Player-2 " +D2);
        }

   }

}
