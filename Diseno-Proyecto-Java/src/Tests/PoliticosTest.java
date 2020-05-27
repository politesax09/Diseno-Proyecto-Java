package Tests;

import Politicos.*;

public class PoliticosTest {
    public static void main(String[] args) {
        Politico sanchez = new Sanchez();

        System.out.println(sanchez.getName());
        System.out.println(sanchez.getAttack());
        System.out.println(sanchez.getDefence());
        System.out.println(sanchez.getRecruitment());

    }
}
