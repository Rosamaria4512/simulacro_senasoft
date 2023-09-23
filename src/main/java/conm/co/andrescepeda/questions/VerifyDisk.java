package conm.co.andrescepeda.questions;

import conm.co.andrescepeda.userinterfaces.DiscoInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyDisk implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DiscoInterfaces.VALIDATE_DISC).viewedBy(actor).asString();
    }
    public static VerifyDisk verifyDisk(){
        return new VerifyDisk();
    }
}
