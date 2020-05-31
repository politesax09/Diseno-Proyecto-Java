package CrearEnemigos_abstractfactory;

import Politicos.*;

public interface FactoryEnemy {
    Politico withFC();
    Politico withBT();
    Politico withRJ();
    Politico withZP();
    Politico withCB();
}
