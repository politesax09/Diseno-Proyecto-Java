//package CrearEnemigos_abstractfactory;
//
//import Ataques2_decorator.*;
//
//public class FactoryIglesias implements FactoryEnemy {
//
//    @Override
//    public Politico withFC() {
//        Politico iglesias = new Iglesias();
//        Component component = new ConcreteComponent();
//        Decorator fc = new FC(component);
//        iglesias.setCaradura(fc);
//        return iglesias;
//    }
//
//    @Override
//    public Politico withBT() {
//        Politico iglesias = new Iglesias();
//        Component component = new ConcreteComponent();
//        Decorator bt = new BT(component);
//        iglesias.setCaradura(bt);
//        return iglesias;
//    }
//
//    @Override
//    public Politico withRJ() {
//        Politico iglesias = new Iglesias();
//        Component component = new ConcreteComponent();
//        Decorator rj = new RJ(component);
//        iglesias.setCaradura(rj);
//        return iglesias;
//    }
//
//    @Override
//    public Politico withZP() {
//        Politico iglesias = new Iglesias();
//        Component component = new ConcreteComponent();
//        Decorator zp = new FC(component);
//        iglesias.setCaradura(zp);
//        return iglesias;
//    }
//
//    @Override
//    public Politico withCB() {
//        Politico iglesias = new Iglesias();
//        Component component = new ConcreteComponent();
//        Decorator cb = new CB(component);
//        iglesias.setCaradura(cb);
//        return iglesias;
//    }
//}
