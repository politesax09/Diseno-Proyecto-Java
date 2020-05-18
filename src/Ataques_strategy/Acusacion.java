package Ataques_strategy;

/* --contrarios -> ++afines */
public class Acusacion implements Strategy {

    protected final double CONTRARIOS = 3;    // Restar: 3
    protected final double INDECISOS = 0;
    protected final double AFINES = 0;

    // Total: 3(contrarios) + 0(indecisos) + 0(afines) = 3
    protected double increment = CONTRARIOS + INDECISOS - AFINES;

    @Override
    public void ataque() {
        System.out.println("Acusacion: " + increment);
    }
}
