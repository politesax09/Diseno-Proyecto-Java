package Ataques_strategy;

/* --indecisos -> ++afines & -contrarios -> +afines */
public class Captacion implements Strategy
{
	protected final String NAME = "Captacion";
    protected final double CONTRARIOS = 0.005; // 0.5%
    protected final double INDECISOS = 0.02;    // 2%
    protected final double AFINES = 1;      // No %

    // Total: 0.5(contrarios) + 2(indecisos) + 0(afines) = 2.5
    protected double gain = CONTRARIOS + INDECISOS - AFINES;


    @Override
    public String name() {
        return NAME;
    }

    @Override
    public double[] attackStats() {
        return new double[] {CONTRARIOS, INDECISOS, AFINES};
    }
}
