package Ataques_strategy;

// TODO: 19/5/20 Compiar al resto de ataques cuando este terminado
/* --contrarios -> ++afines */
public class Acusacion implements Strategy {

    protected final String NAME = "Acusacion";

    // Son porcentuales
    public final double CONTRARIOS = 0.03;    // 3%
    public final double INDECISOS = 0;
    public final double AFINES = 0;

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
