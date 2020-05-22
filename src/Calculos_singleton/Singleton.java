package Calculos_singleton;

import Ataques_strategy.*;
import Politicos.*;

// TODO: 20/5/20 No se puede devolver el porcentage total de ganancia porq hay que aplicarlo por separado en varios sitios
// TODO: 19/5/20 IDEA: Meter todas las variables en obj. Politico, metiendo clases en su clase
// TODO: 20/5/20 Aleatorizar cuando todo funcione
public class Singleton {
    private static Singleton instance;

    private final int ATTACKSTAT_CONTRARIOS = 0;
    private final int ATTACKSTAT_INDECISOS = 1;
    private final int ATTACKSTAT_AFINES = 2;

    private Politico player;
    private Politico enemy;
    private Atacar playerAttack;
    private Atacar enemyAttack;
    private double playerResult;
    private double enemyResult;

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

    protected void inicialiceFollowers() {
        playerFollowers = 0.1 * TOTAL_FOLLOWERS;
        enemyFollowers = 0.1 * TOTAL_FOLLOWERS;
        updateUndecidedFollowers();
    }

    protected void updateUndecidedFollowers() {
        undecidedFollowers = TOTAL_FOLLOWERS - playerFollowers - enemyFollowers;
    }

    // Total gain for player (%)
    public void resultPlayer() {
        playerResult = (player.getAttack() * playerAttack.() - enemy.getDefence() * 0.5) / 100;
    }

    // Total gain for enemy (%)
    public void resultEnemy() {
//        enemyResult = (enemy.getAttack() * enemyAttack.attack(ATTAC) - player.getDefence() * 0.5) / 100;
        // TODO: 22/5/20 Aplicar defensa de player en la formula
        double contrariosGain = enemy.getAttack() * enemyAttack.attack(ATTACKSTAT_CONTRARIOS) - player.getDefence() * playerAttack.attack(ATTACKSTAT_AFINES);
        double indecisosGain = enemy.getRecruitment() * enemyAttack.attack(ATTACKSTAT_INDECISOS);
        enemyResult =

    }

    public double getPlayerResult() {
        return playerResult;
    }

    public double getEnemyResult() {
        return enemyResult;
    }

    public double calculateFollowers() {
        playerFollowers = playerFollowers + ()
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

    public String enemyAttackName() {
        return enemyAttack.name();
    }

    public String playerAttackName() {
        return playerAttack.name();
    }

}
