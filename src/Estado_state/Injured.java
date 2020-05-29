package Estado_state;

import Politicos.*;

public class Injured extends State {

    public Injured(Politico politico) {
        super(politico);
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
