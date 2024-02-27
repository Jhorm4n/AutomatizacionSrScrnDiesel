package co.com.sofka.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//runner de la pagina de diesel 
@CucumberOptions(
        features ="src/test/resources/features/Page",
        glue = "co.com.sofka.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty"


)
public class PageRunnerTest {
}
//2do comentario desde el runner pero ya esto va a cambiar ssssssssssssss