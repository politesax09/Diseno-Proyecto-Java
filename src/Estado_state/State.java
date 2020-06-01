package Estado_state;

import CrearEnemigos_abstractfactory.*;

public abstract class State {
    public Politico politico;

    public State(Politico politico) {
        this.politico = politico;
    }

    // TODO: 1/6/20  No se si hace falta, depende de si politico es un puntero o una copia
    public void updatePolitico(Politico politico) {
        this.politico = politico;
    }

    // Comprueba y actualiza el estado del politico
    public abstract State nextState();

}
