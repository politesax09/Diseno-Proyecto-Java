package Estado_state;

import CrearEnemigos_abstractfactory.*;


public class Injured extends State {

    public Injured(Politico politico) {
        super(politico);
        System.out.println("Estado Injured");

    }

    @Override
    public State nextState() {
        if (this.politico.isDeath())
            return new Death(this.politico);

        else if (this.politico.isActCaradura())
            return new Caradura(this.politico);

        else if (! this.politico.isInjured())
            return new Alive(this.politico);

        return this;

    }
}
