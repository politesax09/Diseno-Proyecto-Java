package Ataques2_decorator;

import CrearEnemigos_abstractfactory.*;

public class FC extends Decorator {
    protected final String NAME = "Franco";
    protected final double INC_ATQ = 3;
    protected final double INC_DEF = 0;
    protected final double INC_CAP = 0;

    protected int days = 2;

    public FC(Component component) {
        super(component);
    }

    protected void changeStats(Politico politico) {
        politico.setStats(politico.getAttackStat() + INC_ATQ,
                politico.getDefenceStat() + INC_DEF,
                politico.getRecruitStat() + INC_CAP);

        System.out.println("+FC: " + politico.getAttackStat() + politico.getDefenceStat() + politico.getRecruitStat());
    }

    protected void restoreStats(Politico politico) {
        politico.setStats(politico.getAttackStat() - INC_ATQ,
                politico.getDefenceStat() - INC_DEF,
                politico.getRecruitStat() - INC_CAP);

        System.out.println("-FC: " + politico.getAttackStat() + politico.getDefenceStat() + politico.getRecruitStat());
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getDays() {
        return days;
    }

    @Override
    public void updateDays() {
        if (this.days > 0)
            this.days--;
    }

    @Override
    public void decorate(Politico politico) {
        super.decorate(politico);
        changeStats(politico);
    }

    @Override
    public void unDecorate(Politico politico) {
        super.unDecorate(politico);
        restoreStats(politico);
    }
}
