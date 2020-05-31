package Estado_state;

import Politicos.*;

public class Alive extends State {

    public Alive(Politico politico) {
        super(politico);
        System.out.println("Estado Alive");

    }

    @Override
    public State nextState() {
        if (this.politico.isActCaradura())
            return new Caradura(this.politico);

        else if (this.politico.isInjured())
            return new Injured(this.politico);

        else if (this.politico.isDeath())
            return new Death(this.politico);

        return this;
    }
}
