package CrearEnemigos_abstractfactory;

import Ataques2_decorator.*;

public class FactoryIglesias implements FactoryEnemy {

    @Override
    public Politico decorateFC() {
        Politico iglesias = new Iglesias();
        Component component = new ConcreteComponent();
        Decorator fc = new FC(component);
        iglesias.setCaradura(fc);
        return iglesias;
    }

    @Override
    public Politico decorateBT() {
        Politico iglesias = new Iglesias();
        Component component = new ConcreteComponent();
        Decorator bt = new BT(component);
        iglesias.setCaradura(bt);
        return iglesias;
    }

    @Override
    public Politico decorateRJ() {
        Politico iglesias = new Iglesias();
        Component component = new ConcreteComponent();
        Decorator rj = new RJ(component);
        iglesias.setCaradura(rj);
        return iglesias;
    }

    @Override
    public Politico decorateZP() {
        Politico iglesias = new Iglesias();
        Component component = new ConcreteComponent();
        Decorator zp = new FC(component);
        iglesias.setCaradura(zp);
        return iglesias;
    }

    @Override
    public Politico decorateCB() {
        Politico iglesias = new Iglesias();
        Component component = new ConcreteComponent();
        Decorator cb = new CB(component);
        iglesias.setCaradura(cb);
        return iglesias;
    }
}
