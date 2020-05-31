package Tests;


import Ataques2_decorator.*;
import Ataques_strategy.*;
import Calculos_singleton.*;
import Politicos.*;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.instanciate();

        Politico playerSanchez = new Sanchez();
        Politico enemySanchez = new Sanchez();

        Strategy acusacion = new Acusacion();
        Atacar attack = new Atacar(acusacion);

        ConcreteComponent component = new ConcreteComponent();
        Decorator fc = new FC(component);

        // Inicializar
        singleton.setPlayer(playerSanchez);
        singleton.setEnemy(enemySanchez);
        singleton.inicialiceFollowers();
        singleton.setPlayerAttack(attack);
        singleton.setEnemyAttack(attack);
        singleton.setPlayerCaradura(fc);
//        singleton.setEnemyCaradura(fc);
        // Sin decorar
        singleton.calculateFollowers();
        singleton.printAttackName();
        singleton.printFollowers();
        // Decorado
        singleton.activateCaradura(singleton.PLAYER);
        singleton.calculateFollowers();
        singleton.printAttackName();
        singleton.printFollowers();


    }
}
