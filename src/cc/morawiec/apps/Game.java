package cc.morawiec.apps;

public class Game {
    final private Integer randomNumb;
    private int counter;

    /**
     * constructor for random number between 1-100 and counter (number of chances) to 10
     */
    public Game() {
        this.randomNumb = (int) Math.floor(Math.random() * 100)+1;
        this.counter = 10;
    }

    /**
     * method for check number from user and get feedback, decrement int counter or set to 0 if player wins
     * @param i integer from user
     * @return result after checking
     */
    public String play(Integer i){
        setCounterDown();
        System.out.println("pozostała ilość ruchów: "+getCounter());
        if (i.equals(randomNumb)){
            this.counter = 0;
            return "Trafiony!";
        }
        else {
            if (isGrater(i)){
                return "szukana liczba jest wieksza od twojej";
            }
            else return "szukana liczba jest mniejsza od twojej";
        }

    }

    private boolean isGrater(Integer i){
        if (i<randomNumb){
            return true;
        }
        else return false;
    }

    public int getCounter() {
        return counter;
    }

    private void setCounterDown() {
        this.counter--;
    }
}
