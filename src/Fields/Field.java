package Fields;

abstract public class Field {
    private String name;

   public Field (String name){
       this.name=name;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void landOn(){}//over

}
