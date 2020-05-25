package Tests;

import Ataques2_decorator.*;
import Politicos.*;

public class DecoratorTest {
    public static void main(String[] args) {
        Politico sanchez = new Sanchez();

        ConcreteComponent concreteComponent = new ConcreteComponent();
        FC fc = new FC(concreteComponent);
//        RJ rj = new RJ(fc);
//        ZP zp = new ZP(rj);

        fc.decorate(sanchez);
        fc.unDecorate(sanchez);
    }
}
