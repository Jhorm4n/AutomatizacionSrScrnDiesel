package co.com.sofka.tasks.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.AddMultipleProduct.*;

public class AddMultipleProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddProduct1),
                Click.on(Regresar),
                Click.on(AddProduct2)
        );
    }

    public static AddMultipleProduct addMultipleProduct() {
        return new AddMultipleProduct();
    }
}
