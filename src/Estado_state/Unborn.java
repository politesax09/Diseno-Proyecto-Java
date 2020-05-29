package Estado_state;

import Politicos.*;

public class Unborn extends State {

    public Unborn(Politico politico) {
        super(politico);
    }

    @Override
    public State nextState() {
        return new Alive(this.politico);
    }
}
