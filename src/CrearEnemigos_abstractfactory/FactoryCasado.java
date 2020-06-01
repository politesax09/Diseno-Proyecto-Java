package CrearEnemigos_abstractfactory;

import Ataques2_decorator.*;

public class FactoryCasado implements FactoryEnemy {

    @Override
    public Politico decorateFC() {
        Politico casado = new Casado();
        Component component = new ConcreteComponent();
        Decorator fc = new FC(component);
        casado.setCaradura(fc);
        return casado;
    }

    @Override
    public Politico decorateBT() {
        Politico casado = new Casado();
        Component component = new ConcreteComponent();
        Decorator bt = new BT(component);
        casado.setCaradura(bt);
        return casado;
    }

    @Override
    public Politico decorateRJ() {
        Politico casado = new Casado();
        Component component = new ConcreteComponent();
        Decorator rj = new RJ(component);
        casado.setCaradura(rj);
        return casado;
    }

    @Override
    public Politico decorateZP() {
        Politico casado = new Casado();
        Component component = new ConcreteComponent();
        Decorator zp = new FC(component);
        casado.setCaradura(zp);
        return casado;
    }

    @Override
    public Politico decorateCB() {
        Politico casado = new Casado();
        Component component = new ConcreteComponent();
        Decorator cb = new CB(component);
        casado.setCaradura(cb);
        return casado;
    }
}
