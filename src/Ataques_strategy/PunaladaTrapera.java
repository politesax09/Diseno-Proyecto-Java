package Ataques_strategy;

/* --contrarios -> ++afines & -indecisos -> +afines & -?afines */
public class PunaladaTrapera implements Strategy
{

	protected final String NAME= "Punalada Trapera";
    protected final double CONTRARIOS = 0.05;   // Restar: 5%
    protected final double INDECISOS = 0.005;  // Restar: 0.5%
    // TODO: 17/5/20 Aleatorizar cuando todo funcione
    protected final double AFINES = 0.01;       // Restar: 0.1%

    // Total: 5(contrarios) + 0.5(indecisos) - 1(afines) = 4.5
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
