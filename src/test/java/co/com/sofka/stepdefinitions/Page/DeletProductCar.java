package co.com.sofka.stepdefinitions.Page;

import co.com.sofka.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.AutomationPage.AddMultipleProduct.addMultipleProduct;
import static co.com.sofka.tasks.AutomationPage.OpenPageInit.openPageInit;
import static co.com.sofka.tasks.AutomationPage.RemoverProductCar.removerProductCar;
import static co.com.sofka.tasks.AutomationPage.Search.forTheTerm;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class DeletProductCar extends Setup {
    @Given("que el usuario tiene artículos en el carrito")
    public void queElUsuarioTieneArticulosEnElCarrito() {
        
    }

    @When("el usuario elimina un producto del carrito")
    public void elUsuarioEliminaUnProductoDelCarrito() {
     

    }

    @Then("el producto se eliminaran correctamente del carrito")
    public void elProductoSeEliminaranCorrectamenteDelCarrito() {
        quitarDriver();
    }


}
