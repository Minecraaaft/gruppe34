package Fields;

public class PropertyField extends Field {
    private int cost;
    private String owner;

    public PropertyField(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public boolean checkOwner() {  //Skal fixes
        return owner != null;
    }

    @Override
    void landOn() {
        super.landOn();

    }
}