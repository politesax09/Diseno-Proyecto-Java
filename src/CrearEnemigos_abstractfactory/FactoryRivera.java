package CrearEnemigos_abstractfactory;

import Ataques2_decorator.*;

public class FactoryRivera implements FactoryEnemy {

    @Override
    public Politico decorateFC() {
        Politico rivera = new Rivera();
        Component component = new ConcreteComponent();
        Decorator fc = new FC(component);
        rivera.setCaradura(fc);
        return rivera;
    }

    @Override
    public Politico decorateBT() {
        Politico rivera = new Rivera();
        Component component = new ConcreteComponent();
        Decorator bt = new BT(component);
        rivera.setCaradura(bt);
        return rivera;
    }

    @Override
    public Politico decorateRJ() {
        Politico rivera = new Rivera();
        Component component = new ConcreteComponent();
        Decorator rj = new RJ(component);
        rivera.setCaradura(rj);
        return rivera;
    }

    @Override
    public Politico decorateZP() {
        Politico rivera = new Rivera();
        Component component = new ConcreteComponent();
        Decorator zp = new FC(component);
        rivera.setCaradura(zp);
        return rivera;
    }

    @Override
    public Politico decorateCB() {
        Politico rivera = new Rivera();
        Component component = new ConcreteComponent();
        Decorator cb = new CB(component);
        rivera.setCaradura(cb);
        return rivera;
    }
}
