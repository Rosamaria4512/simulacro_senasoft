package conm.co.andrescepeda.tasks;

import conm.co.andrescepeda.userinterfaces.NoticiesInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class NoticeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NoticiesInterfaces.A_NOTICIES));
        actor.attemptsTo(Click.on(NoticiesInterfaces.SEE_A_NOTICE));
        actor.attemptsTo(Click.on(NoticiesInterfaces.SCROLL_A_NOTICE_1), Scroll.to(NoticiesInterfaces.SCROLL_A_NOTICE_2));

    }
    public static NoticeTask noticeTasks(){
        return Tasks.instrumented(NoticeTask.class);
    }
}
