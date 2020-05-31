package Politicos;

import Ataques2_decorator.*;
import Ataques_strategy.*;
import Calculos_singleton.Singleton;

public abstract class Politico {
    protected String name;
    protected int attackStat;
    protected int defenceStat;
    protected int recruitStat;

    protected Atacar attack;
    protected Decorator caradura;
    protected double followers;

    protected boolean actCaradura = false;

    protected double INJURED_FOLLOWERS = 1000000;
    protected double DEATH_FOLLOWERS = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStats(double attack, double defence, double recruit) {
        this.attackStat = (int)attack;
        this.defenceStat = (int)defence;
        this.recruitStat = (int)recruit;
    }

    public int getAttackStat() {
        return attackStat;
    }

    public void setAttackStat(int attackStat) {
        this.attackStat = attackStat;
    }

    public int getDefenceStat() {
        return defenceStat;
    }

    public void setDefenceStat(int defenceStat) {
        this.defenceStat = defenceStat;
    }

    public int getRecruitStat() {
        return recruitStat;
    }

    public void setRecruitStat(int recruitStat) {
        this.recruitStat = recruitStat;
    }

    public Atacar getAttack() {
        return attack;
    }

    public void setAttack(Atacar attack) {
        this.attack = attack;
    }

    public Decorator getCaradura() {
        return caradura;
    }

    public void setCaradura(Decorator caradura) {
        this.caradura = caradura;
    }

    public double getFollowers() {
        return followers;
    }

    public void setFollowers(double followers) {
        this.followers = followers;
    }

    public void setActCaradura(boolean actCaradura) {
        this.actCaradura = actCaradura;
    }

    public boolean isActCaradura() {
        return this.actCaradura;
    }

    public boolean isInjured() {
        if (this.followers < INJURED_FOLLOWERS && this.followers != DEATH_FOLLOWERS)
            return true;
        return false;
    }

    public boolean isDeath() {
        if (this.followers <= DEATH_FOLLOWERS)
            return true;
        return false;
    }
}
