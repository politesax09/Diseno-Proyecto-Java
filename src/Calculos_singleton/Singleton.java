package Calculos_singleton;

import Ataques2_decorator.*;
import Ataques_strategy.*;
import Estado_state.Caradura;
import Politicos.*;

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
        player.setFollowers(0.1 * TOTAL_FOLLOWERS);
        enemy.setFollowers(0.1 * TOTAL_FOLLOWERS);
        updateUndecidedFollowers();
    }

    protected void updateUndecidedFollowers() {
        undecidedFollowers = TOTAL_FOLLOWERS - player.getFollowers() - enemy.getFollowers();
    }

    public void activateCaradura(boolean flag) {
        if (flag)
            player.getCaradura().decorate(player);
        else
            enemy.getCaradura().decorate(enemy);

//        if (flag)
//            playerCaradura.decorate(player);
//        else
//            enemyCaradura.decorate(enemy);
    }

    public void deactivateCaradura(boolean flag) {
        if (flag)
            player.getCaradura().unDecorate(player);
        else
            enemy.getCaradura().unDecorate(enemy);

//        if (flag)
//            playerCaradura.unDecorate(player);
//        else
//            enemyCaradura.unDecorate(enemy);
    }

    // Total gain for player (%)
    public double[] resultPlayer() {
        // Porcentaje del contrario ganado
        double contrariosGain = player.getAttackStat() * player.getAttack().attack(ATTACKSTAT_CONTRARIOS);
        // Porcentaje de defensa del contrario
        double contrarioDefence = enemy.getDefenceStat() * enemy.getAttack().attack(ATTACKSTAT_AFINES);
        // Porcentaje de indecisos ganado
        double indecisosGain = player.getRecruitStat() * player.getAttack().attack(ATTACKSTAT_INDECISOS);

        return new double[]{contrariosGain, contrarioDefence, indecisosGain};
    }

    // Total gain for enemy (%)
    public double[] resultEnemy() {
        // TODO: 22/5/20 Aplicar defensa de player en la formula
        // Porcentaje del contrario ganado
        double contrariosGain = enemy.getAttackStat() * enemy.getAttack().attack(ATTACKSTAT_CONTRARIOS);
        // Porcentaje de defensa del contrario
        double contrarioDefence = player.getDefenceStat() * player.getAttack().attack(ATTACKSTAT_AFINES);
        // Porcentaje de indecisos ganado
        double indecisosGain = enemy.getRecruitStat() * enemy.getAttack().attack(ATTACKSTAT_INDECISOS);

        return new double[]{contrariosGain, contrarioDefence, indecisosGain};
    }

    public void calculateFollowers() {
        double statsPlayer[] = resultPlayer();
        double statsEnemy[] = resultEnemy();

        // Ganancia player
        player.setFollowers(player.getFollowers() +
                enemy.getFollowers() * (statsPlayer[0] - statsPlayer[1]) +
                undecidedFollowers * statsPlayer[2]);
        // Ganancia enemy
        enemy.setFollowers(enemy.getFollowers() +
                player.getFollowers() * (statsEnemy[0] - statsEnemy[1]) +
                undecidedFollowers * statsEnemy[2]);
        // Perdida player
        if (statsEnemy[0] - statsEnemy[1] > 0)
            player.setFollowers(player.getFollowers() * (statsEnemy[0] - statsEnemy[1]));
        // Perdida enemy
        if (statsPlayer[0] - statsPlayer[1] > 0)
            enemy.setFollowers(enemy.getFollowers() * (statsPlayer[0] - statsPlayer[1]));

        updateUndecidedFollowers();
    }

    public void setPlayer(Politico player) {
        this.player = player;
    }

    public void setEnemy(Politico enemy) {
        this.enemy = enemy;
    }

    public void setPlayerAttack(Atacar attack) {
        player.setAttack(attack);
    }

    public void setEnemyAttack(Atacar attack) {
        enemy.setAttack(attack);
    }

    public void setPlayerCaradura(Decorator caradura) {
        player.setCaradura(caradura);
    }

    public void setEnemyCaradura(Decorator caradura) {
        player.setCaradura(caradura);
    }

    public void printFollowers() {
        System.out.println("Player: " + player.getFollowers());
        System.out.println("Enemy: " + enemy.getFollowers());
        System.out.println("Undecided: " + undecidedFollowers);

    }

    public void printAttackName() {
        System.out.println("Player attack: " + player.getAttack().name());
        System.out.println("Enemy attack: " + enemy.getAttack().name());
    }

}
