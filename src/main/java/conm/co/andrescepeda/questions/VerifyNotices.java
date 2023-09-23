package conm.co.andrescepeda.questions;

import conm.co.andrescepeda.userinterfaces.NoticiesInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import org.apache.commons.lang3.Validate;

public class VerifyNotices implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(NoticiesInterfaces.VALIDATION_ELEMENT).viewedBy(actor).asBoolean();
    }
   public static VerifyNotices verifyNotices(){
        return new VerifyNotices();
   }
}
