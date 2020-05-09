package Ataques_strategy;

public class Atacar {

    protected Strategy strategy;

    Atacar(Strategy str) {
        this.strategy = str;
    }

    public void ataque() {
        strategy.ataque();
    }
}
