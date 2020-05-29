//package Estado_state;
//
//import Politicos.*;
//
//public abstract class State {
//    protected Politico politico;
//
//    public State(Politico politico) {
//        this.politico = politico;
//    }
//
//    public State changeState(int state) {
//        switch (state)
//        {
//            case 0:
//                return new Alive(politico);
//            case 1:
//                return new Injured(politico);
//            case 2:
//                return new Death(politico);
//            case 3:
//                return new Caradura(politico);
//            default:
//                System.out.println("ERROR: State -> Estado no existente, fuera de rango");
//        }
//    }
//}
