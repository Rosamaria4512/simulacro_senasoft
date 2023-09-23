package conm.co.andrescepeda.questions;

import conm.co.andrescepeda.userinterfaces.BIOInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyBIO implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(BIOInterfaces.VALIDATION_TEXT).viewedBy(actor).asString();
    }
    public static VerifyBIO verifyBIO(){
        return new VerifyBIO();
    }
}
