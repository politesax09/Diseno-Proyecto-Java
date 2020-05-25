package Politicos;

public abstract class Politico {
    protected String name;
    protected int attack;
    protected int defence;
    protected int recruitment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStats(double attack, double defence, double recruit) {
        this.attack = (int)attack;
        this.defence = (int)defence;
        this.recruitment = (int)recruit;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(int recruitment) {
        this.recruitment = recruitment;
    }
}
