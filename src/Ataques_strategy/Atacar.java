package Ataques_strategy;

// TODO: 18/5/20 Usar metodo de estrategia para devolver los valores a Singleton
// TODO: 17/5/20 Aleatorizar un poco todas las estadisticas

public class Atacar {

    protected Strategy strategy;

    // Total: 3(contrarios) + 0(indecisos) + 0(afines) = 3
    public double gain;

    public Atacar(Strategy str) {
        this.strategy = str;
    }

    public String name() {
        return strategy.nombre();
    }

    public double attack() {
        gain = strategy.contrarios() + strategy.indecisos() - strategy.afines();
        return this.gain;
    }
}
