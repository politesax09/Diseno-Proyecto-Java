package Ataques2_decorator;

import Politicos.*;

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
