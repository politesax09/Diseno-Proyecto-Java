package Ataques2_decorator;

public class RJ extends Decorator {
    protected final double INC_ATQ = 0;
    protected final double INC_DEF = 2;
    protected final double INC_CAP = 0;

    protected int dias = 3;

    public RJ(Component component) {
        super(component);
    }

    protected void changeStats() {
        System.out.println("RJ: Change stats");
    }

//    @Override
//    public void decorate() {
//        super.decorate();
//        changeStats();
//    }
}
