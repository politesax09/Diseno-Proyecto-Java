package Ataques2_decorator;

import Politicos.*;

public class FC extends Decorator {
    protected final double INC_ATQ = 3;
    protected final double INC_DEF = 0;
    protected final double INC_CAP = 0;

    protected int dias = 2;

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
