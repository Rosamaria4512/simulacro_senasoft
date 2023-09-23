package conm.co.andrescepeda.tasks;

import conm.co.andrescepeda.userinterfaces.PhotoPage;
import conm.co.andrescepeda.userinterfaces.ReleasesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ReleasesTask implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Click.on(ReleasesPage.BTN_RELEASES));

        }

       public static ReleasesTask releases(){
            return Tasks.instrumented(ReleasesTask.class);
       }

    }

