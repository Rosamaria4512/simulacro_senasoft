package conm.co.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BIOInterfaces {
    public static final Target A_BIO=Target.the("Aceder al modulo de noticias").locatedBy("(//a[@href='/#band-section'])[3]");
    public static final Target VALIDATION_TEXT=Target.the("verificar").locatedBy("//strong[text()='Sobre Andrés Cepeda']");


}
