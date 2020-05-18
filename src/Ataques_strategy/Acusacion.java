package Ataques_strategy;

/* --contrarios -> ++afines */
public class Acusacion implements Strategy {

    // Son porcentuales
    public final double CONTRARIOS = 3;    // Restar: 3
    public final double INDECISOS = 0;
    public final double AFINES = 0;

    @Override
    public void ataque() {
        System.out.println("Acusacion: ");
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
