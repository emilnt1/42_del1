//This is loose all bracnh
//Test with developer Branch
//Spilleren mister alle sine point hvis spilleren slår to 1'ere
public class LoseAll {

    public static LoseAll(Player current, Dice d1, Dice d2){

        private boolean P1,P2;
        private int d1, d2;
        private int pointP1, pointP2;

        //Hvis det er P1's tur, og deres sum af kast er 2, bliver deres point sat til 0
        if ((P1 == true) && (d1 + d2 == 2)){
            pointP1 = 0;
        }


        //Hvis det er P2's tur, og deres sum af kast er 2, bliver deres point sat til 0
        if ((P2 == true) && (d1 + d2 == 2)){
            pointP2 = 0;
        }

    }

}