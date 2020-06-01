package CrearEnemigos_abstractfactory;

import Ataques2_decorator.*;

public class FactorySanchez implements FactoryEnemy {

    @Override
    public Politico decorateFC() {
        Politico sanchez = new Sanchez();
        Component component = new ConcreteComponent();
        Decorator fc = new FC(component);
        sanchez.setCaradura(fc);
        return sanchez;
    }

    @Override
    public Politico decorateBT() {
        Politico sanchez = new Sanchez();
        Component component = new ConcreteComponent();
        Decorator bt = new BT(component);
        sanchez.setCaradura(bt);
        return sanchez;
    }

    @Override
    public Politico decorateRJ() {
        Politico sanchez = new Sanchez();
        Component component = new ConcreteComponent();
        Decorator rj = new RJ(component);
        sanchez.setCaradura(rj);
        return sanchez;
    }

    @Override
    public Politico decorateZP() {
        Politico sanchez = new Sanchez();
        Component component = new ConcreteComponent();
        Decorator zp = new FC(component);
        sanchez.setCaradura(zp);
        return sanchez;
    }

    @Override
    public Politico decorateCB() {
        Politico sanchez = new Sanchez();
        Component component = new ConcreteComponent();
        Decorator cb = new CB(component);
        sanchez.setCaradura(cb);
        return sanchez;
    }
}
