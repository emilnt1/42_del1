import java.lang.Math;

public class Dice {  // class "dice" is defined
    private final int MAX =6; //the max value of the dice is 6
    private int facevalue;

    public Dice(int value){ //Assigns "Dice" an int value
        facevalue = value;
    }


    public int getFacevalue() { //Gets the facevalue int
        return facevalue;
    }


    public int rollDice(){ // The int value you get after rolling the dice
        facevalue = (int)(Math.random()*6)+1;
        return facevalue;
    }

    public String toString(){  //A string that says what you rolled
        String ln = "Value: " + getFacevalue();
        return ln;
    }

    public void setFacevalue(int value) {
        facevalue = value;
    }
}

