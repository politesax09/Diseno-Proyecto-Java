package Ataques_strategy;

// TODO: 17/5/20 Aleatorizar un poco todas las estadisticas

public class Atacar {

    protected Strategy strategy;

    public Atacar(Strategy str) {
        this.strategy = str;
    }

    public void ataque() {
        strategy.ataque();
    }
}
