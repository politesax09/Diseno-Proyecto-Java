package Calculos_singleton;

import Ataques2_decorator.*;
import Ataques_strategy.*;
import Estado_state.*;
import CrearEnemigos_abstractfactory.*;

import javax.swing.plaf.synth.SynthTextAreaUI;

// TODO: 20/5/20 Aleatorizar cuando todo funcione
public class Singleton {
    private static Singleton instance;

    private final int ATTACKSTAT_CONTRARIOS = 0;
    private final int ATTACKSTAT_INDECISOS = 1;
    private final int ATTACKSTAT_AFINES = 2;

    // Param. in methods: activateCaradura() and deactivateCaradura()
    public final boolean PLAYER = true;
    public final boolean ENEMY = false;

    public final int DEC_FC = 0;
    public final int DEC_RJ = 1;
    public final int DEC_ZP = 2;
    public final int DEC_CB = 3;
    public final int DEC_BT = 4;

    public final int SANCHEZ = 0;
    public final int IGLESIAS = 1;
    public final int ABASCAL = 2;
    public final int CASADO = 3;
    public final int RIVERA = 4;


    private State player;
    private State enemy;

    private double undecidedFollowers;
    private final double TOTAL_FOLLOWERS = 47000000;    // 47M de personas
    private final int FINAL_DAY = 10;
    private int day = 1;



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
        player.politico.setFollowers(0.1 * TOTAL_FOLLOWERS);
        enemy.politico.setFollowers(0.1 * TOTAL_FOLLOWERS);
        player.nextState();
        enemy.nextState();
        updateUndecidedFollowers();
    }

    protected void updateUndecidedFollowers() {
        undecidedFollowers = TOTAL_FOLLOWERS - player.politico.getFollowers() - enemy.politico.getFollowers();
    }

    public void updateState() {
        player.nextState();
        enemy.nextState();
    }

    // Suma 1 dia
    public void updateDay() {
        if (this.day < FINAL_DAY)
            this.day++;
    }

    // Resta 1 a los dias de activacion de Caradura
    public void updateCaraduraDays() {
        if (player.politico.getCaradura() != null)
            player.politico.getCaradura().updateDays();
        if (enemy.politico.getCaradura() != null)
            enemy.politico.getCaradura().updateDays();
    }



    // Activa el caradura del politico que toque
    public void activateCaradura(boolean flag) {
        if (flag)
            player.politico.getCaradura().decorate(player.politico);
        else
            enemy.politico.getCaradura().decorate(enemy.politico);
    }

    // Desactiva el caradura/s que sea necesario
    public void deactivateCaradura() {
        if (player.politico.isActCaradura())
            player.politico.getCaradura().unDecorate(player.politico);

        if (enemy.politico.isActCaradura())
            enemy.politico.getCaradura().unDecorate(enemy.politico);
    }

    // Actualiza la bandera de activacion del caradura en el Politico
    public void checkActCaradura() {
        if (player.politico.getCaradura().getDays() <= 0)
            player.politico.setActCaradura(false);

        if (enemy.politico.getCaradura().getDays() <= 0)
            enemy.politico.setActCaradura(false);
    }

// ===============================================================================================================

    // Total gain (%)
    // Param. ENEMY or PLAYER
    public double[] result(boolean flag) {
        double contrariosGain, contrarioDefence, indecisosGain;

        if (flag)
        {
            // Porcentaje del contrario ganado
            contrariosGain = player.politico.getAttackStat() * player.politico.getAttack().attack(ATTACKSTAT_CONTRARIOS);
            // Porcentaje de defensa del contrario
            contrarioDefence = enemy.politico.getDefenceStat() * enemy.politico.getAttack().attack(ATTACKSTAT_AFINES);
            // Porcentaje de indecisos ganado
            indecisosGain = player.politico.getRecruitStat() * player.politico.getAttack().attack(ATTACKSTAT_INDECISOS);
        }
        else
        {
            // Porcentaje del contrario ganado
            contrariosGain = enemy.politico.getAttackStat() * enemy.politico.getAttack().attack(ATTACKSTAT_CONTRARIOS);
            // Porcentaje de defensa del contrario
            contrarioDefence = player.politico.getDefenceStat() * player.politico.getAttack().attack(ATTACKSTAT_AFINES);
            // Porcentaje de indecisos ganado
            indecisosGain = enemy.politico.getRecruitStat() * enemy.politico.getAttack().attack(ATTACKSTAT_INDECISOS);
        }
        System.out.println(contrariosGain);
        System.out.println(contrarioDefence);
        System.out.println(indecisosGain);

        return new double[]{contrariosGain, contrarioDefence, indecisosGain};
    }

    public double gainStat(double gain, double defence) {
        if (gain > defence)
            return (gain - defence);
        else
            // Si es negativo se transforma en 0.[playerGainStat] positivo
            return ((gain - defence) * (-0.1));
    }

    public void calculateFollowers() {
        double statsPlayer[] = result(PLAYER);
        double statsEnemy[] = result(ENEMY);
        double playerFollowers = player.politico.getFollowers();
        double enemyFollowers = enemy.politico.getFollowers();
        double playerGainStat, enemyGainStat;

        System.out.println(player.politico.getFollowers());
        System.out.println(enemy.politico.getFollowers());

        // Ganancia player
        player.politico.setFollowers(playerFollowers +
                enemyFollowers * gainStat(statsPlayer[0], statsPlayer[1]) +
                undecidedFollowers * statsPlayer[2]);

        System.out.println(player.politico.getFollowers());
        System.out.println(enemy.politico.getFollowers());

        // Ganancia enemy
        enemy.politico.setFollowers(enemyFollowers +
                playerFollowers * gainStat(statsEnemy[0], statsEnemy[1]) +
                undecidedFollowers * statsEnemy[2]);

        System.out.println(player.politico.getFollowers());
        System.out.println(enemy.politico.getFollowers());

        // Perdida player
        if (statsEnemy[0] - statsEnemy[1] > 0)
            player.politico.setFollowers(player.politico.getFollowers() - playerFollowers * (statsEnemy[0] - statsEnemy[1]));
        System.out.println(player.politico.getFollowers());
        System.out.println(enemy.politico.getFollowers());

        // Perdida enemy
        if (statsPlayer[0] - statsPlayer[1] > 0)
            enemy.politico.setFollowers(enemy.politico.getFollowers() - enemyFollowers * (statsPlayer[0] - statsPlayer[1]));
        System.out.println(player.politico.getFollowers());
        System.out.println(enemy.politico.getFollowers());

        updateUndecidedFollowers();
        updateCaraduraDays();
        updateState();
        updateDay();
    }

// ===============================================================================================================

    public void setPlayer(Politico player) {
        this.player = new Unborn(player);
//        this.player.politico = player;
    }

    public void setEnemy(Politico enemy) {
//        this.enemy.politico = enemy;
        this.enemy = new Unborn(enemy);
    }

    public void setPlayerAttack(Atacar attack) {
        player.politico.setAttack(attack);
        if (player.politico.getAttack().name() == "Justificacion")
        {
            player.politico.setDefenceStat(player.politico.getDefenceStat() + 1);
            System.out.println("+1 defenceStat");
        }
    }

    public void setEnemyAttack(Atacar attack) {
        enemy.politico.setAttack(attack);
        if (enemy.politico.getAttack().name() == "Justificacion")
        {
            enemy.politico.setDefenceStat(enemy.politico.getDefenceStat() + 1);
            System.out.println("+1 defenceStat");
        }
    }

    public void setPlayerCaradura(Decorator caradura) {
        player.politico.setCaradura(caradura);
    }

    public void setEnemyCaradura(Decorator caradura) {
        player.politico.setCaradura(caradura);
    }

// ===============================================================================================================

    public void printFollowers() {
        if (player != null)
            System.out.println("Player: " + player.politico.getFollowers());
        else
            System.out.println("Player: null. No hay seguidores.");

        if (enemy != null)
            System.out.println("Enemy: " + enemy.politico.getFollowers());
        else
            System.out.println("Enemy: null. No hay seguidores.");

        System.out.println("Undecided: " + undecidedFollowers);

    }

    public void printAttackName() {
        System.out.println("Player attack: " + player.politico.getAttack().name());
        System.out.println("Enemy attack: " + enemy.politico.getAttack().name());
    }

    public void printCaraduras() {
        if (player.politico.getCaradura() != null)
            System.out.println("Player caradura: " + player.politico.getCaradura().getName());
        else
            System.out.println("Player caradura: no existe");

        if (enemy.politico.getCaradura() != null)
            System.out.println("Enemy caradura: " + enemy.politico.getCaradura().getName());
        else
            System.out.println("Enemy caradura: no existe");
    }

}
