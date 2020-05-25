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
        politico.setStats(politico.getAttack() + INC_ATQ,
                politico.getDefence() + INC_DEF,
                politico.getRecruitment() + INC_CAP);

        System.out.println("+FC: " + politico.getAttack() + politico.getDefence() + politico.getRecruitment());
    }

    protected void restoreStats(Politico politico) {
        politico.setStats(politico.getAttack() - INC_ATQ,
                politico.getDefence() - INC_DEF,
                politico.getRecruitment() - INC_CAP);

        System.out.println("-FC: " + politico.getAttack() + politico.getDefence() + politico.getRecruitment());
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
