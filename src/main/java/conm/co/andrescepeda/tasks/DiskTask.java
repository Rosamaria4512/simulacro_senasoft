package conm.co.andrescepeda.tasks;

import conm.co.andrescepeda.userinterfaces.DiscoInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class DiskTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DiscoInterfaces.A_DISCOGRAFY));
        actor.attemptsTo(Click.on(DiscoInterfaces.SCROLL_A_NOTICE_1), Scroll.to(DiscoInterfaces.SEE_DISC));
        actor.attemptsTo(Click.on(DiscoInterfaces.SEE_DISC));
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static DiskTask diskTask(){
        return Tasks.instrumented(DiskTask.class);
    }
}
