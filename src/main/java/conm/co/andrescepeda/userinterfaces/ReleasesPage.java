package conm.co.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReleasesPage {
    public static final Target BTN_RELEASES=Target.the("Aceder al modulo LANZAMIENTOS")
            .locatedBy("(//*[@id='mainNavigation']/div[5]/a");
    public static final Target SCROLL=Target.the("Aceder al modulo de Eventos")
            .locatedBy("  //*[@id='block-b4152acd44e31af266e7']/div/div/h2/strong");

    public static final Target BTN_UPCOMING_EVENTS=Target.the("click en el boton proximo eventos ")
            .locatedBy("//*[@id='yui_3_17_2_1_1695480799155_220']/a");
}
