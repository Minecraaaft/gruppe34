package Model;

public class Dice {
    private int diceVal;

    public Dice() {}

    public int rollDice() {
        int MAX = 6;
        diceVal = (int) (Math.random() * MAX) + 1;
        return diceVal;
    }

    public int setDiceVal(int dice1) {
        diceVal = dice1;
        return diceVal;
    }

    public int getDiceVal() {
        return diceVal;
    }
}
