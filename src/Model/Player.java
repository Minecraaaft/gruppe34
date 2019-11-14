package Model;

public class Player {
    private String name;
    private int balance=20;

    public Player() {
    }

    public void setName(String name) {
        this.name=name;

    }
    public void setBalance(int points) {
        this.balance=points;

    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }


}