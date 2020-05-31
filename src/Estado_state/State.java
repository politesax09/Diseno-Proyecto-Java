package Estado_state;

import Politicos.*;

// TODO: 29/5/20 A lo mejor hace falta un estado para cuando el enemigo no ha sido creado todavia

public abstract class State {
    public Politico politico;

    public State(Politico politico) {
        this.politico = politico;
    }

    public void updatePolitico(Politico politico) {
        this.politico = politico;
    }

    public abstract State nextState();

}
