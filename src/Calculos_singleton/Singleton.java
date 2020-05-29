package Calculos_singleton;

import Ataques2_decorator.*;
import Ataques_strategy.*;
import Politicos.*;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.List;

// TODO: 19/5/20 IDEA: Meter todas las variables en obj. Politico, metiendo clases en su clase
// TODO: 20/5/20 Aleatorizar cuando todo funcione
public class Singleton {
    private static Singleton instance;

    private final int ATTACKSTAT_CONTRARIOS = 0;
    private final int ATTACKSTAT_INDECISOS = 1;
    private final int ATTACKSTAT_AFINES = 2;

    // Param. in methods: activateCaradura() and deactivateCaradura()
    public final boolean PLAYER = true;
    public final boolean ENEMY = false;

    private Politico player;
    private Politico enemy;
    private Atacar playerAttack;
    private Atacar enemyAttack;
    private Decorator playerCaradura;
    private Decorator enemyCaradura;

    private double playerFollowers;
    private double enemyFollowers;
    private double undecidedFollowers;
    private final double TOTAL_FOLLOWERS = 47000000;    // 47M de personas



    private Singleton() {}

    // Actua de constructor
    public static Singleton instanciate() {
        if (instance == null)
            instance = new Singleton();

        else
            System.out.println("Error al crear objeto Singleton, ya existe");

        return instance;
    }

    public void inicialiceFollowers() {
        playerFollowers = 0.1 * TOTAL_FOLLOWERS;
        enemyFollowers = 0.1 * TOTAL_FOLLOWERS;
        updateUndecidedFollowers();
    }

    protected void updateUndecidedFollowers() {
        undecidedFollowers = TOTAL_FOLLOWERS - playerFollowers - enemyFollowers;
    }

    public void activateCaradura(boolean flag) {
        if (flag)
            playerCaradura.decorate(player);
        else
            enemyCaradura.decorate(enemy);
    }

    public void deactivateCaradura(boolean flag) {
        if (flag)
            playerCaradura.unDecorate(player);
        else
            enemyCaradura.unDecorate(enemy);
    }

    // Total gain for player (%)
    public double[] resultPlayer() {
        // Porcentaje del contrario ganado
        double contrariosGain = player.getAttack() * playerAttack.attack(ATTACKSTAT_CONTRARIOS);
        // Porcentaje de defensa del contrario
        double contrariosDefence = enemy.getDefence() * enemyAttack.attack(ATTACKSTAT_AFINES);
        // Porcentaje de indecisos ganado
        double indecisosGain = player.getRecruitment() * playerAttack.attack(ATTACKSTAT_INDECISOS);

        return new double[]{contrariosGain, contrariosDefence, indecisosGain};
    }

    // Total gain for enemy (%)
    public double[] resultEnemy() {
        // TODO: 22/5/20 Aplicar defensa de player en la formula
        // Porcentaje del contrario ganado
        double contrariosGain = enemy.getAttack() * enemyAttack.attack(ATTACKSTAT_CONTRARIOS);
        // Porcentaje de defensa del contrario
        double contrariosDefence = player.getDefence() * playerAttack.attack(ATTACKSTAT_AFINES);
        // Porcentaje de indecisos ganado
        double indecisosGain = enemy.getRecruitment() * enemyAttack.attack(ATTACKSTAT_INDECISOS);

        return new double[]{contrariosGain, contrariosDefence, indecisosGain};
    }

    public void calculateFollowers() {
        double statsPlayer[] = resultPlayer();
        double statsEnemy[] = resultEnemy();

        // Ganancia player
        playerFollowers = playerFollowers +
                enemyFollowers * (statsPlayer[0] - statsPlayer[1]) +
                undecidedFollowers * statsPlayer[2];
        // Ganancia enemy
        enemyFollowers = enemyFollowers +
                enemyFollowers * (statsEnemy[0] - statsEnemy[1]) +
                undecidedFollowers * statsEnemy[2];
        // Perdida player
        playerFollowers -= (statsEnemy[0] - statsEnemy[1]);
        // Perdida enemy
        enemyFollowers -= (statsPlayer[0] - statsPlayer[1]);

        updateUndecidedFollowers();
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

    public void setPlayerCaradura(Decorator playerCaradura) {
        this.playerCaradura = playerCaradura;
    }

    public void setEnemyCaradura(Decorator enemyCaradura) {
        this.enemyCaradura = enemyCaradura;
    }

    //
//    public String enemyAttackName() {
//        return enemyAttack.name();
//    }
//
//    public String playerAttackName() {
//        return playerAttack.name();
//    }

    public void printFollowers() {
        System.out.println("Player: " + playerFollowers);
        System.out.println("Enemy: " + enemyFollowers);
        System.out.println("Undecided: " + undecidedFollowers);

    }

    public void printAttackName() {
        System.out.println("Player attack: " + playerAttack.name());
        System.out.println("Enemy attack: " + enemyAttack.name());
    }

}
