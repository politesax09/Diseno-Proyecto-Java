package CrearEnemigos_abstractfactory;

import Ataques2_decorator.*;

public class FactorySanchez implements FactoryEnemy {

    @Override
    public Politico withFC() {
        Politico sanchez = new Sanchez();
        Component component = new ConcreteComponent();
        Decorator fc = new FC(component);
        sanchez.setCaradura(fc);
        return sanchez;
    }

    @Override
    public Politico withBT() {
        Politico sanchez = new Sanchez();
        Component component = new ConcreteComponent();
        Decorator bt = new BT(component);
        sanchez.setCaradura(bt);
        return sanchez;
    }

    @Override
    public Politico withRJ() {
        Politico sanchez = new Sanchez();
        Component component = new ConcreteComponent();
        Decorator rj = new RJ(component);
        sanchez.setCaradura(rj);
        return sanchez;
    }

    @Override
    public Politico withZP() {
        Politico sanchez = new Sanchez();
        Component component = new ConcreteComponent();
        Decorator zp = new FC(component);
        sanchez.setCaradura(zp);
        return sanchez;
    }

    @Override
    public Politico withCB() {
        Politico sanchez = new Sanchez();
        Component component = new ConcreteComponent();
        Decorator cb = new CB(component);
        sanchez.setCaradura(cb);
        return sanchez;
    }
}
