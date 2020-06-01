package Ataques2_decorator;

// TODO: 17/5/20 Aleatorizar cuando todo funcione
public class ZP extends Decorator {
    protected final String NAME = "Zapatero";
    protected final double INC_ATQ = 1;
    protected final double INC_DEF = 1;
    protected final double INC_CAP = 1;

    protected int days = 1;

    public ZP(Component component) {
        super(component);
    }

    protected void changeStats() {
        System.out.println("ZP: Change stats");
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getDays() {
        return days;
    }

    @Override
    public void updateDays() {
        if (this.days > 0)
            this.days--;
    }

//    @Override
//    public void decorate() {
//        super.decorate();
//        changeStats();
//    }
}
