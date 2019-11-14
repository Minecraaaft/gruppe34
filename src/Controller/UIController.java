package Controller;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;

public class UIController {

   public void createFields(String [] Fields){
       GUI_Field[] fields = new GUI_Field[24];
       GUI_Field f = new GUI_Street();
      // for (int i = 0; i < ; i++) {
       //    fields[i]=
      // }
       f.setTitle("Start");
       fields[0].setTitle("Start");
       GUI_Street s = new GUI_Street();

       s.setBackGroundColor(Color.yellow);
       GUI_Player p = new GUI_Player("");



       GUI gui = new GUI(fields);
       String navn = gui.getUserString("Spillernavn:");

        gui.addPlayer(new GUI_Player(navn, 20));
   }


}
