package Ataques_strategy;

// TODO: 18/5/20 Usar metodo de estrategia para devolver los valores a Singleton
// TODO: 17/5/20 Aleatorizar un poco todas las estadisticas cuando todo funcione

public class Atacar {

    protected Strategy strategy;

    // Total: 3(contrarios) + 0(indecisos) + 0(afines) = 3
//    public double gain;

    public Atacar(Strategy str) {
        this.strategy = str;
    }

    public String name() {
        return strategy.nombre();
    }

    // Calcula la ganancia de audiencia del politico que usa este ataque
    // Devuelve un array con las tres estadisticas del ataque
    public double[] attack() {
//        gain = strategy.contrarios() + strategy.indecisos() - strategy.afines();

        return strategy.attackStats();
    }

    // Devuelve una de las estadisticas del ataque
    public double attack(int indexStat) {
        if (indexStat == 0 || indexStat == 1 || indexStat == 2)
            return strategy.attackStats()[indexStat];
        else
        {
            System.out.println("ERROR: Atacar -> indexStat fuera de rango");
            return 0;
        }
    }
}
