package Tests;

import Estado_state.*;
import Politicos.*;

public class StateTest {
    public static void main(String[] args) {
        Politico sanchez = new Sanchez();
        State stateSanchez = new Unborn(sanchez);
        stateSanchez.politico.setFollowers(15000000);
        stateSanchez = stateSanchez.nextState();
        stateSanchez = stateSanchez.nextState();
        stateSanchez = stateSanchez.nextState();

//        stateSanchez.politico.setFollowers(4);
//        System.out.println(stateSanchez.politico.getFollowers());
//        System.out.println(stateSanchez.politico.isInjured());
//        stateSanchez = stateSanchez.nextState();
//        stateSanchez = stateSanchez.nextState();

        stateSanchez.politico.setFollowers(15000000);
        stateSanchez.politico.setActCaradura(true);
        System.out.println(stateSanchez.politico.getFollowers());
        stateSanchez = stateSanchez.nextState();
        stateSanchez = stateSanchez.nextState();

        stateSanchez.politico.setFollowers(0);
        System.out.println(stateSanchez.politico.getFollowers());
        stateSanchez = stateSanchez.nextState();
        stateSanchez = stateSanchez.nextState();

    }
}
