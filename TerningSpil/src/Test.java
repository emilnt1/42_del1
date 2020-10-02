
import java.math.*;

public class Test {
    public static void main(String[] args) {

        for(int a = 0; a < 1000; a++) {
        Dice p1 = new Dice(0);
        p1.rollDice();
        Dice p2= new Dice(0);
        p2.rollDice();
        System.out.println(p2+" "+p2);

        }
   }

}
