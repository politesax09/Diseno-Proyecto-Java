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
