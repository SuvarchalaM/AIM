package starter.Property;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Clickheadermenu implements Task {

    public static Performable properties() {
        return instrumented(Clickheadermenu.class);
    }

@Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(HeaderMenuForm.raul_header),
    Click.on(HeaderMenuForm.leftnav),
    Click.on(HeaderMenuForm.menuid),
    Click.on(HeaderMenuForm.propertyname),
    Click.on(HeaderMenuForm.propertyprofile)
        );
}
}

