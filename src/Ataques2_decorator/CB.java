package Ataques2_decorator;

public class CB extends Decorator {
    protected final String NAME = "Carrero Blanco";


    public CB(Component component) {
        super(component);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getDays() {
        return -1;
    }

    @Override
    public void updateDays() {

    }
}
