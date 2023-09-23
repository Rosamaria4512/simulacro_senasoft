package conm.co.andrescepeda.tasks;

import conm.co.andrescepeda.userinterfaces.EventsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class EventsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(EventsPage.BTN_EVENTS),
                Scroll.to(EventsPage.SCROLL));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        actor.attemptsTo(Click.on(EventsPage.BTN_UPCOMING_EVENTS));

    }
    public static EventsTask events()
    {
        return Tasks.instrumented(EventsTask.class);
    }
}
