package co.com.sofka.stepdefinitions.Page;

import co.com.sofka.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static co.com.sofka.questions.AutomationPage.ShowResulSearch.showResulSearch;
import static co.com.sofka.tasks.AutomationPage.OpenPageInit.openPageInit;
import static co.com.sofka.tasks.AutomationPage.Search.forTheTerm;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
public class Searchproduct extends Setup {

    @Given("que el usuario está en la página de inicio")
    public void queElUsuarioEstáEnLaPáginaDeInicio() {
        actorSetupTheBrowser("Diesel");
        theActorInTheSpotlight().wasAbleTo(
                openPageInit()
                );

    }

    @When("el usuario busca {string}")
    public void elUsuarioBusca(String string) {
        theActorInTheSpotlight().wasAbleTo(
                forTheTerm(string));
    }

    @Then("se muestran resultados relacionados con {string}")
    public void seMuestranResultadosRelacionadosCon(String searchTerm) {

        theActorInTheSpotlight().should(seeThat("El término buscado coincide",
                 showResulSearch(),equalTo(searchTerm))
        );
        quitarDriver();

    }


}
