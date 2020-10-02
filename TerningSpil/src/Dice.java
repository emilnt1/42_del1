import java.lang.Math;

public class Dice {  // class "dice" is defined
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
        return "Value: " + getFacevalue();
    }

    public void setFacevalue(int value) {
        facevalue = value;
    }
}

