package Ataques_strategy;

/* --indecisos -> ++afines & -contrarios -> +afines */
public class Captacion implements Strategy {

    protected final double CONTRARIOS = 0.5; // Restar: 0.5
    protected final double INDECISOS = 2;    // Restar: 2
    protected final double AFINES = 0;

    // Total: 0.5(contrarios) + 2(indecisos) + 0(afines) = 2.5
    protected double increment = CONTRARIOS + INDECISOS - AFINES;

    @Override
    public void ataque() {
        System.out.println("Captacion: " + increment);
    }
}
