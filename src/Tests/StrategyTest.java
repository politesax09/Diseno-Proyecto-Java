package Tests;

import Ataques_strategy.*;

public class StrategyTest {
    public static void main(String[] args) {
        Strategy acusacion = new Acusacion();
        Strategy justificacion = new Justificacion();

        Atacar ataque = new Atacar(acusacion);
        Atacar at2 = new Atacar(justificacion);

        ataque.attack();
        System.out.println(ataque.attack(0));
        System.out.println(ataque.attack(1));
        System.out.println(ataque.attack(2));

        at2.attack();
        System.out.println(at2.attack(0));
        System.out.println(at2.attack(1));
        System.out.println(at2.attack(2));
    }
}
