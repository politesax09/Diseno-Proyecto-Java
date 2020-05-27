package Ataques2_decorator;

import Politicos.*;

public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void decorate(Politico politico) {
        component.decorate(politico);
    }

    @Override
    public void unDecorate(Politico politico) {
        component.unDecorate(politico);
    }
}
