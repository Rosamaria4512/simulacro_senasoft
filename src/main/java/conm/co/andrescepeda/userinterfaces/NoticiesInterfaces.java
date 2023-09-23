package conm.co.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NoticiesInterfaces {
    public static final Target A_NOTICIES=Target.the("Aceder al modulo de noticias").locatedBy("(//a[@href='/media'])[3]");
    public static final Target SEE_A_NOTICE=Target.the("Aceder a una noticias").locatedBy("(//a[@class='summary-read-more-link'])[1]");
    public static final Target SCROLL_A_NOTICE_1=Target.the("bajar").locatedBy("//img[@alt='ANDRÉS CEPEDA']");
    public static final Target SCROLL_A_NOTICE_2=Target.the("hasta").locatedBy("//div[@class='sqs-html-content']");
    public static final Target VALIDATION_ELEMENT=Target.the("verificar").locatedBy("//div[@class='sqs-html-content']");


}
