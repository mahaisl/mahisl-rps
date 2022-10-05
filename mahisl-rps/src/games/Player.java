package games;

public class Player {
    private int score;
    private String name;

    //constructor
    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void rangeQuit(){
        System.exit( 0);

    }

}
