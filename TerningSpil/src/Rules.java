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

    public static Player shiftPlayer( Player one, Player two, Rules a){
        if (a.getPlayerID() == 1){
            a.setPlayerID(2);
            return one;

        } else {
            a.setPlayerID(1);
            return two;
        }
    }

// add value of current score to each player

    public static void addToScore (Dice a, Dice b, Player Rules){
        Rules.addScore( a.getFacevalue() + b.getFacevalue());
    }


}


