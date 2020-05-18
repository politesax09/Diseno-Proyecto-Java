package Tests;

import Ataques_strategy.*;

public class StrategyTest {
    public static void main(String[] args) {
        Ataques_strategy.Strategy captacion = new Captacion();
        Ataques_strategy.Strategy acusacion = new Acusacion();
        Ataques_strategy.Strategy justificacion = new Justificacion();
        Ataques_strategy.Strategy punalada = new PunaladaTrapera();
        Ataques_strategy.Strategy caradura = new CaraduraLegendario();

        Atacar ataque1 = new Atacar(captacion);
        Atacar ataque2 = new Atacar(acusacion);
        Atacar ataque3 = new Atacar(justificacion);
        Atacar ataque4 = new Atacar(punalada);
        Atacar ataque5 = new Atacar(caradura);

        ataque1.ataque();
        ataque2.ataque();
        ataque3.ataque();
        ataque4.ataque();
        ataque5.ataque();
    }
}
