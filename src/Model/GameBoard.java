package Model;

import CDIO_3.Model.Fields.PropertyField;

public class GameBoard {

    PropertyField P1 = new PropertyField("Pizzahuset", 3);
    PropertyField P2 = new PropertyField("Slikhytten", 3);
    PropertyField P3 = new PropertyField("Toilet", 3);
    PropertyField P4 = new PropertyField("Rådhus", 3);

    PropertyField[] PL = {P1,P2,P3,P4};


//getFieldString, getFieldPoints, checkBookField, setBookField(player)

    public GameBoard() {
    }

    public boolean check(int i){
        return PL[i].checkOwner();

    }

    public void setOwn(int i, String name){
        PL[i].setOwner(name);
    }


}


