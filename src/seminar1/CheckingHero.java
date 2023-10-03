//package seminar1;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//public class CheckingHero {
//
//    public static void main(String[] args) {
//
//
//
//
//    private static void main(String[] args){
//        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
//        Hero emmett = new Hero("emmett", 50,"sword", heroBag, true);
//        checkingHero(emmett);
//    }
//    public static void checkingHero(Hero hero) {
//        assertThat(hero.getName()).isEqualTo("emmett");
//        assertThat(hero.getArmorStrength()).isEqualTo(50);
//        assertThat(hero.getWeapon()).isEqualTo("sword");
//        assertThat(hero.getBag()).isNotEmpty().hasSize(3).contains("Bow", "Axe", "Gold");
//        assertThat(hero.isHuman()).isEqualTo(true);
//
//
//    }
//
//}
//}

package seminar1;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CheckingHero {

    public static void main(String[] args) {
        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        Hero emmett = new Hero("emmett", 50,"sword", heroBag, true);
        checkingHero(emmett);
    }

    public static void checkingHero(Hero hero) {
        assertThat(hero.getName()).isEqualTo("emmett");
        assertThat(hero.getArmorStrength()).isEqualTo(50);
        assertThat(hero.getWeapon()).isEqualTo("sword");
//        assertThat(hero.getBag()).isNotEmpty().hasSize(3).contains("Bow", "Axe", "Gold");
        assertThat(hero.isHuman()).isEqualTo(true);
    }

}
