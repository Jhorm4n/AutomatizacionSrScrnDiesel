package co.com.sofka.stepdefinitions.Page;

import co.com.sofka.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.AutomationPage.AddMultipleProduct.addMultipleProduct;
import static co.com.sofka.tasks.AutomationPage.OpenPageInit.openPageInit;
import static co.com.sofka.tasks.AutomationPage.Search.forTheTerm;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddMultipleProductsToCart extends Setup {

    @Given("que el usuario ha buscado y seleccionado varios productos")
    public void queElUsuarioHaBuscadoYSeleccionadoVariosProductos() {
        actorSetupTheBrowser("Diesel");
        theActorInTheSpotlight().wasAbleTo(
                openPageInit(),
                forTheTerm("Zapatos"));

    }

    @When("el usuario agrega múltiples productos al carrito")
    public void elUsuarioAgregaMultiplesProductosAlCarrito() {
        theActorInTheSpotlight().wasAbleTo(
                addMultipleProduct()
        );
    }

    @Then("todos los productos seleccionados se agregarían al carrito correctamente")
    public void todosLosProductosSeleccionadosSeAgregarianAlCarritoCorrectamente() {

        quitarDriver();
    }


}
