package Tests;


import Ataques_strategy.*;
import Calculos_singleton.Singleton;
import Politicos.*;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.instanciate();

        Politico playerSanchez = new Sanchez();
        Politico enemySanchez = new Sanchez();

        Strategy acusacion = new Acusacion();
        Atacar attack = new Atacar(acusacion);

        singleton.setPlayer(playerSanchez);
        singleton.setEnemy(enemySanchez);
        singleton.inicialiceFollowers();
        singleton.setPlayerAttack(attack);
        singleton.setEnemyAttack(attack);

        singleton.calculateFollowers();
        singleton.printAttackName();
        singleton.printFollowers();



    }
}
