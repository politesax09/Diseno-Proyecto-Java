package Ataques_strategy;

/* -indecisos -> +afines & incrementa capacidad de defensa */
public class Justificacion implements Strategy {

	protected final String NAME = "Justificacion";
    protected final double CONTRARIOS = 0;
    protected final double INDECISOS = 1.5;  // Restar: 1.5
    protected final double AFINES = 0;

    // Total: 0(contrarios) + 1.5(indecisos) + 0(afines) = 1.5
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
