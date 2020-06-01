package Ataques2_decorator;

/* Un metodo a decorar por cada ataque
*  Segun el partido se decora de diferente forma */

import CrearEnemigos_abstractfactory.*;


public interface Component {
    void decorate(Politico politico);
    void unDecorate(Politico politico);

}
