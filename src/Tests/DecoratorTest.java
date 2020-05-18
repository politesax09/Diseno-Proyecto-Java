package Tests;

import Ataques2_decorator.*;

public class DecoratorTest {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        FC fc = new FC(concreteComponent);
        RJ rj = new RJ(fc);
        ZP zp = new ZP(rj);

        zp.decorate();
    }
}
