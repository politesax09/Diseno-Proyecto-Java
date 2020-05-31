package Estado_state;

import Politicos.*;

public class Death extends State {

    public Death(Politico politico) {
        super(politico);
        System.out.println("Estado Death");

    }

    @Override
    public State nextState() {
        return this;
    }
}
