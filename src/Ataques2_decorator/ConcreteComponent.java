package Ataques2_decorator;

import CrearEnemigos_abstractfactory.*;


public class ConcreteComponent implements Component {

    @Override
    public void decorate(Politico politico) {
        System.out.println("Decorando...");
    }

    @Override
    public void unDecorate(Politico politico) {
        System.out.println("Restableciendo...");
    }
}
