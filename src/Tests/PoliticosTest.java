package Tests;

import Politicos.*;

public class PoliticosTest {
    public static void main(String[] args) {
        Politico player = new Abascal();

        System.out.println(player.getName());
        System.out.println(player.getAttack());
        System.out.println(player.getDefence());
        System.out.println(player.getRecruitment());

    }
}
