package conm.co.andrescepeda.tasks;

import conm.co.andrescepeda.userinterfaces.BIOInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BIOTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BIOInterfaces.A_BIO));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static BIOTask bioTask(){
        return Tasks.instrumented(BIOTask.class);
    }
}
