package Tests;

import Ataques_strategy.*;

public class StrategyTest {
    public static void main(String[] args) {
        Ataques_strategy.Strategy acusacion = new Acusacion();

        Atacar ataque = new Atacar(acusacion);

        ataque.attack();

        System.out.println(ataque.attack(0));
        System.out.println(ataque.attack(1));
        System.out.println(ataque.attack(2));

    }
}
