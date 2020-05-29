package Ataques2_decorator;

import Politicos.Politico;

public class RJ extends Decorator {
    protected final double INC_ATQ = 0;
    protected final double INC_DEF = 2;
    protected final double INC_CAP = 0;

    protected int dias = 3;

    public RJ(Component component) {
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
