package Ataques2_decorator;

public class FC extends Decorator {
    protected final double INC_ATQ = 3;
    protected final double INC_DEF = 0;
    protected final double INC_CAP = 0;

    protected int dias = 2;

    public FC(Component component) {
        super(component);
    }

    protected void changeStats() {
        System.out.println("FC: Change stats");
    }

    @Override
    public void decorate() {
        super.decorate();
        changeStats();
    }
}
