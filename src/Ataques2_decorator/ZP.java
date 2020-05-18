package Ataques2_decorator;

// TODO: 17/5/20 Aleatorizar cuando todo funcione
public class ZP extends Decorator {
    protected final double INC_ATQ = 1;
    protected final double INC_DEF = 1;
    protected final double INC_CAP = 1;

    protected int dias = 1;

    public ZP(Component component) {
        super(component);
    }

    protected void changeStats() {
        System.out.println("ZP: Change stats");
    }

    @Override
    public void decorate() {
        super.decorate();
        changeStats();
    }
}
