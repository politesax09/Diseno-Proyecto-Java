package Estado_state;

import CrearEnemigos_abstractfactory.*;


public class Unborn extends State {

    public Unborn(Politico politico) {
        super(politico);
        System.out.println("Estado Unborn");
    }

    @Override
    public State nextState() {
        return new Alive(this.politico);
    }
}
