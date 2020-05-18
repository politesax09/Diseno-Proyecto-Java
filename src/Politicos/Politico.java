package Politicos;

public abstract class Politico {
    protected String name;
    protected int attack;
    protected int defence;
    protected int recruitment;

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getRecruitment() {
        return recruitment;
    }
}
