package Ataques_strategy;

public class Test {
    public static void main(String[] args) {
        Strategy captacion = new Captacion();
        Strategy acusacion = new Acusacion();
        Strategy justificacion = new Justificacion();
        Strategy punalada = new PunaladaTrapera();
        Strategy caradura = new CaraduraLegendario();

        Atacar ataque1 = new Atacar(captacion);
        Atacar ataque2 = new Atacar(acusacion);
        Atacar ataque3 = new Atacar(justificacion);
        Atacar ataque4 = new Atacar(punalada);
        Atacar ataque5 = new Atacar(caradura);

        ataque1.ataque();
        ataque2.ataque();
        ataque3.ataque();
        ataque4.ataque();
        ataque5.ataque();
    }
}
