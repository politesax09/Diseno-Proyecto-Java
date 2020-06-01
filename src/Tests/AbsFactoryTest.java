package Tests;

import CrearEnemigos_abstractfactory.*;

public class AbsFactoryTest {
    public static void main(String[] args) {
        FactoryEnemy sanchezFac = new FactorySanchez();
        Politico sanchez = sanchezFac.decorateFC();

        System.out.println(sanchez.getCaradura());
    }
}
