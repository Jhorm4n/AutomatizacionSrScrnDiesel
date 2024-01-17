package co.com.sofka.tasks.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.sofka.ui.SearchProduct.SEARCH;
import static co.com.sofka.ui.SearchProduct.SEARCHINPUT;

public class Search implements Task {

    private final String searchTerm;

    public Search(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SEARCH),
                Click.on(SEARCHINPUT),
                Enter.theValue(searchTerm).into(SEARCHINPUT),
                Hit.the(Keys.ENTER).into(SEARCHINPUT)
        );
    }

    public static Search forTheTerm(String searchTerm) {
        return new Search(searchTerm);
    }
}
