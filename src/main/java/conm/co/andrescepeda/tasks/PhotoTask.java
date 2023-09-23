package conm.co.andrescepeda.tasks;

import conm.co.andrescepeda.userinterfaces.EventsPage;
import conm.co.andrescepeda.userinterfaces.PhotoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class PhotoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PhotoPage.BTN_PHOTOS));

    }

    public static PhotoTask photo()
    {
        return Tasks.instrumented(PhotoTask.class);
    }

}
