public class Player {

    // Initialisere en private integer "score" som vi bruger til at holde på scoren
    private int score;

    // Laver en constructor for player classen, som holder på scoren.
    public Player(int value){
        score = value;
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
