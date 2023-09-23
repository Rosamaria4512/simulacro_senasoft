package conm.co.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DiscoInterfaces {
    public static final Target A_DISCOGRAFY =Target.the("ir al modulo de discografia").locatedBy("(//a[@href='/discografa-1'])[3]");
    public static final Target SCROLL_A_NOTICE_1=Target.the("bajar").locatedBy("//img[@alt='ANDRÉS CEPEDA']");
    public static final Target SEE_DISC =Target.the("ir al disco").locatedBy("(//img[@data-stretch='false'])[3]");
    public static final Target VALIDATE_DISC =Target.the("ir al disco").locatedBy("(//*[text()='Andrés Cepeda, Gusi - Duele (Video Oficial)'])[2]");

}
