package Ataques_strategy;

// TODO: 18/5/20 Idear como implementarlo:
//  En singleton hay un metodo para activarlo, otro para desactivarlo y otro para contar los dias que le quedan
//  de vida.
//  Se me ocurre que se le pueden poner unas estadisticas del ataque neutras para cuando el Caradura modifica las estadisticas
//  del politico. Y en ese caso hacer como en el metodo 'singleton.setPlayerAttack()' y de esa forma modificar las
//  estadisticas del politico.
//  Cuando el caradura realiza una accion se puede tratar como si fuera un ataque y que llame a alguna otra clase
//  de Strategy o que introduzca sus estadisticas directamente en la cuenta (creo que lo segundo es mas dificil)
//  -
//  Son ideas, hazlo como quieras.
//  -
//  No se si me dejo algo mas pero creo que lo que falta es el Template, esto que te he dicho, coordinarlo ttodo y
//  revisar algun calculo (lo ultimo lo pongo por si acaso).

/* Invoca caradura legendario (ataque sin estadisticas) */
public class CaraduraLegendario implements Strategy {
    protected final String NAME = "Caradura";
    protected final double CONTRARIOS = 0; //
    protected final double INDECISOS = 0;    //
    protected final double AFINES = 1;      // No %

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public double[] attackStats() {
        return new double[]{CONTRARIOS, INDECISOS, AFINES};
    }
}
