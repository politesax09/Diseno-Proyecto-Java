package Ataques_strategy;

/* -indecisos -> +afines & incrementa capacidad de defensa */
public class Justificacion implements Strategy {

    /**** El incremento de la defensa se hace desde Singleton ****/

	protected final String NAME = "Justificacion";
    protected final double CONTRARIOS = 0;
    protected final double INDECISOS = 0.015;  // 1.5%
    protected final double AFINES = 1;

    // Total: 0(contrarios) + 1.5(indecisos) + 0(afines) = 1.5
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
