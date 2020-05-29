package Estado_state;

import Politicos.*;

// TODO: 29/5/20 Comprobar si este estado es necesario

public class Caradura extends State {

    public Caradura(Politico politico) {
        super(politico);
    }

    @Override
    public State nextState() {
        if (! this.politico.isActCaradura())
            if (this.politico.isInjured())
                return new Injured(this.politico);

            else if (this.politico.isDeath())
                return new Death(this.politico);

            else
                return new Alive(this.politico);

        return this;
    }
}
