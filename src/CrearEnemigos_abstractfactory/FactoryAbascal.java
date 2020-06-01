//package CrearEnemigos_abstractfactory;
//
//import Ataques2_decorator.*;
//
//public class FactoryAbascal implements FactoryEnemy {
//
//
//    @Override
//    public Politico withFC() {
//        Politico abascal = new Abascal();
//        Component component = new ConcreteComponent();
//        Decorator fc = new FC(component);
//        abascal.setCaradura(fc);
//        return abascal;
//    }
//
//    @Override
//    public Politico withBT() {
//        Politico abascal = new Abascal();
//        Component component = new ConcreteComponent();
//        Decorator bt = new BT(component);
//        abascal.setCaradura(bt);
//        return abascal;
//    }
//
//    @Override
//    public Politico withRJ() {
//        Politico abascal = new Abascal();
//        Component component = new ConcreteComponent();
//        Decorator rj = new RJ(component);
//        abascal.setCaradura(rj);
//        return abascal;
//    }
//
//    @Override
//    public Politico withZP() {
//        Politico abascal = new Abascal();
//        Component component = new ConcreteComponent();
//        Decorator zp = new FC(component);
//        abascal.setCaradura(zp);
//        return abascal;
//    }
//
//    @Override
//    public Politico withCB() {
//        Politico abascal = new Abascal();
//        Component component = new ConcreteComponent();
//        Decorator cb = new CB(component);
//        abascal.setCaradura(cb);
//        return abascal;
//    }
//}
