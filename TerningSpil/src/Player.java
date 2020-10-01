public class Player {

    // Initialisere en private integer "score" som vi bruger til at holde på scoren
    private int score;
    private int lastD1;
    private int lastD2;
    private int suddenD;

    // Laver en constructor for player classen, som holder på scoren.
    public Player(int value, int d1, int d2, int sudden){
        score = value;
        lastD1 = d1;
        lastD2 = d2;
        suddenD = sudden;
    }

    public void setLastD1(int d1) {
        lastD1 = d1;
    }

    public void setLastD2(int d2) {
        lastD2 = d2;
    }

    public int getLastD1(){
        return lastD1;
    }

    public int getLastD2(){
        return lastD2;
    }

    public void setSuddenD(int sudden) {
        suddenD = sudden;
    }

    public int getSuddenD() {
        return suddenD;
    }

    // Sætter scoren til at være lig med værdien.
    public void setScore(int value){
        score = value;
    }

    // Lægger den den nye score sammen med den gamle samlede score.
    public void addScore (int value){
        score += value;
    }

    // Returnere den samlede score for spilleren
    public int getScore() {
        return score;
    }

    // Scoren fra vores getScore() bliver lagt ind i en string og stringen bliver dernest returneret
    public String toString(){
        String ln = "Score: " + getScore();
        return ln;
    }
}
