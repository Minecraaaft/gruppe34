package Model;

public class PlayerList {
    private Player[] players;

    public PlayerList(int antal) {
        players = new Player[antal];
        for (int i = 0;i < antal;i++)
            players[i] = new Player();
    }


    public void addspiller(int antal){
        String[] navne = {"Peter ","Lene  ","Jan   ","Tobias","Jytte ","Lone"};
        int balance=20;
        for (int i=0; i<antal;i++){
            players[i].setName(navne[i]);
            players[i].setBalance(balance-2);
        }
    }

    public Player[] getSpillere(){
        return players;
    }

    public Player getSpiller(int index){
        return players[index];
    }

    /**
     * @return index p� den spiller der vandt
     */
   /* public boolean isVinder(){
        for (int i = 0;i < spillere.length;i++){
            if (spillere[i].isVinder())
                return true;
        }
        return false;
    }
*/
    /**
     * Finder n�ste spiller i spillerlisten, blandt spillere der ikke er d�de
     * @param index nuv�rende spiller
     * @return index p� n�ste spiller
     */
 /*   public int naesteSpiller(int index){
        do {
            index = ++index % spillere.length;
        } while (spillere[index].isDeath());
        return index;
    }*/
}

