import CDIO_3.Model.GameBoard;

public class Main {
    public static void main(String[] args) {

        GameBoard monop = new GameBoard();

        System.out.println(monop.check(0));

        monop.setOwn(0, "Magnus");

        System.out.println(monop.check(0));


    }
}
