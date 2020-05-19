package Ataques_strategy;

// TODO: 19/5/20 Compiar al resto de ataques cuando este terminado
/* --contrarios -> ++afines */
public class Acusacion implements Strategy {

    protected final String NAME = "Acusacion";

    // Son porcentuales
    public final double CONTRARIOS = 3;    // Restar: 3
    public final double INDECISOS = 0;
    public final double AFINES = 0;

    @Override
    public String nombre() {
        return NAME;
    }

    @Override
    public double contrarios() {
        return CONTRARIOS;
    }

    @Override
    public double indecisos() {
        return INDECISOS;
    }

    @Override
    public double afines() {
        return AFINES;
    }
}
