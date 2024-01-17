package co.com.sofka.tasks.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.RemoverPoductCar.ButtonRemover;

public class RemoverProductCar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ButtonRemover)
        );
    }

    public static RemoverProductCar removerProductCar() {
        return new RemoverProductCar();
    }
}
