package Tests;


import Ataques2_decorator.*;
import Ataques_strategy.*;
import Calculos_singleton.*;
import CrearEnemigos_abstractfactory.*;


public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.instanciate();

        Strategy acusacion = new Acusacion();
        Atacar attack = new Atacar(acusacion);
        Strategy jusificacion = new Justificacion();
        Atacar attack2 = new Atacar(jusificacion);

        ConcreteComponent component = new ConcreteComponent();
        Decorator fc = new FC(component);

        // Inicializar
        System.out.println("INICIALIZAR");
        singleton.setPlayer(new Sanchez());
        singleton.setEnemy(new Sanchez());
        //singleton.setPlayerCaradura(fc);
        singleton.setEnemyCaradura(fc);
        singleton.inicialiceFollowers();
        singleton.printFollowers();

        System.out.println("DIA 1");
        singleton.setPlayerAttack(attack2);
        singleton.setEnemyAttack(attack);
        // Sin decorar
        singleton.calculateFollowers();
        singleton.printAttackName();
        singleton.printFollowers();

//        // Decorado
//        singleton.activateCaradura(singleton.PLAYER);
//        singleton.calculateFollowers();
//        singleton.printAttackName();
//        singleton.printFollowers();


    }
}
