package Ataques_strategy;

/* --indecisos -> ++afines & -contrarios -> +afines */
public class Captacion implements Strategy
{
	protected final String NAME = "Captacion";
    protected final double CONTRARIOS = 0.5; // Restar: 0.5
    protected final double INDECISOS = 2;    // Restar: 2
    protected final double AFINES = 0;

    // Total: 0.5(contrarios) + 2(indecisos) + 0(afines) = 2.5
    protected double gain = CONTRARIOS + INDECISOS - AFINES;


    @Override
    public String nombre() {
        return NAME;
    }

    @Override
    public double[] attackStats() {
        double stats[] = {CONTRARIOS, INDECISOS, AFINES};
        return stats;
    }
}
