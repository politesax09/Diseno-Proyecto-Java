package Ataques2_decorator;

/* Un metodo a decorar por cada ataque
*  Segun el partido se decora de diferente forma */

import Politicos.*;

public interface Component {
    void decorate(Politico politico);
    void unDecorate(Politico politico);

}
