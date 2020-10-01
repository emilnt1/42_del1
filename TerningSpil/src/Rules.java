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

    // Score is set to 0 if player gets a sum of 2
    public static void loseAll(Dice d1, Dice d2, Player current){

        //Hvis det er P1's tur, og deres sum af kast er 2, bliver deres point sat til 0
        if (d1.getFacevalue() + d2.getFacevalue() == 2){
            current.setScore(0);
        }


    }

    public static void extraTurn (Dice d1, Dice d2, Rules ID){

        if (d1.getFacevalue() == d2.getFacevalue()){
            if (ID.getPlayerID() == 1){
                ID.setPlayerID(2);


            } else {
                ID.setPlayerID(1);

            }

        }

    }

    public static void win (Player current, Dice d1, Dice d2){
        if((current.getLastD1() == 6) && (current.getLastD2() == 6) && (d1.getFacevalue() == 6) && (d2.getFacevalue() == 6)) {
            current.setScore(40);
        }
        current.setLastD1(d1.getFacevalue());
        current.setLastD2(d2.getFacevalue());
    }

    public static void suddenD(Player current){
        if(current.getScore() >= 40){
            current.setSuddenD(1);
        }
    }


}


