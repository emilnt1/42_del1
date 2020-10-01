public class Rules {

    private int PlayerID;

    public Rules(int value) {
        PlayerID = value;
    }

    public int getPlayerID() {
        return PlayerID;
    }

    public void setPlayerID(int value) {
        PlayerID = value;
    }

// player switch: switch who is currently playing

    public static Player shiftPlayer( Player one, Player two, Rules ID){
        if (ID.getPlayerID() == 1){
            ID.setPlayerID(2);
            return one;

        } else {
            ID.setPlayerID(1);
            return two;
        }
    }

// add score value to the currently playing player

    public static void addToScore (Dice a, Dice b, Player Rules){
        Rules.addScore( a.getFacevalue() + b.getFacevalue());
    }


}


