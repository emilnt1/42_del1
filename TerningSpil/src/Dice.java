import java.lang.Math;

public class Dice {  //her defineres klassen "Dice"
    private final int MAX =6; //værdi af terning kan max være 6
    private int facevalue; //facevalue er den int, som beskriver hvad terningen slår

    public Dice(int value){ //giver dicen en int value
        facevalue = value; //
    }


    public int getFacevalue() { //her henter systemet facevaluen
        return facevalue;
    }


    public int rollDice(){ // den int value man får efter man har slået med terningen
        facevalue = (int)(Math.random()*6)+1;
        return facevalue;
    }

    public String toString(){  //en string der siger hvad man har slået
        String ln = "value" + getFacevalue();
        return ln;
    }

    public void setFacevalue(int value) {
        facevalue = value;
    }
}

