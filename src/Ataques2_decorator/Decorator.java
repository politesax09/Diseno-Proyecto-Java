package Ataques2_decorator;

import CrearEnemigos_abstractfactory.*;

public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void decorate(Politico politico) {
        if (! politico.isActCaradura())
            component.decorate(politico);
    }

    @Override
    public void unDecorate(Politico politico) {
        if (politico.isActCaradura())
            component.unDecorate(politico);
    }

    public abstract String getName();

    public abstract int getDays();

    public abstract void updateDays();
}
