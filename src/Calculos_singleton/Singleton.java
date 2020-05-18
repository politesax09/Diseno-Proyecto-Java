package Calculos_singleton;

import Ataques_strategy.*;
import Politicos.*;

public class Singleton {
    private static Singleton instance;

    private Politico player;
    private Politico enemy;
    private Atacar playerAttack;
    private Atacar enemyAttack;
    private double playerResult;
    private double enemyResult;

    private double playerFollowers;
    private double enemyFollowers;
    private double undecidedFollowers;
    private double remainingFollowers;



    private Singleton() {}

    // Actua de constructor
    private static Singleton instanciate() {
        if (instance == null)
            instance = new Singleton();
        else
            System.out.println("Error al crear objeto Singleton, ya existe");

        return instance;
    }

    public void resultPlayer() {
        playerResult = player.getAttack() * playerAttack.gain - enemy.getDefence() * 0.5;
    }

    public void resultEnemy() {
        enemyResult = enemy.getAttack() * enemyAttack.gain - player.getDefence() * 0.5;
    }

    public double getPlayerResult() {
        return playerResult;
    }

    public double getEnemyResult() {
        return enemyResult;
    }

    public void setPlayer(Politico player) {
        this.player = player;
    }

    public void setEnemy(Politico enemy) {
        this.enemy = enemy;
    }

    public void setPlayerAttack(Atacar playerAttack) {
        this.playerAttack = playerAttack;
    }

    public void setEnemyAttack(Atacar enemyAttack) {
        this.enemyAttack = enemyAttack;
    }


}
