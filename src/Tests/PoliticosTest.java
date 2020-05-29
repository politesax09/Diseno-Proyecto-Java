package Tests;

import Politicos.*;

public class PoliticosTest {
    public static void main(String[] args) {
        Politico player = new Sanchez();

        System.out.println(player.getName());
        System.out.println(player.getAttackStat());
        System.out.println(player.getDefenceStat());
        System.out.println(player.getRecruitStat());

    }
}
