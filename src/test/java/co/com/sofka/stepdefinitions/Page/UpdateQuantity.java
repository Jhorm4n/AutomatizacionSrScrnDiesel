package co.com.sofka.stepdefinitions.Page;

import co.com.sofka.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.AutomationPage.ShowQuantityUpdate.showQuantityUpdate;
import static co.com.sofka.tasks.AutomationPage.UpdateQuantityProduct.updateQuantityProduct;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class UpdateQuantity extends Setup {
    @When("el usuario actualiza la cantidad del producto")
    public void elUsuarioActualizaLaCantidadDelProducto() {
        
    }

    @Then("la cantidad del producto en el carrito se actualiza correctamente")
    public void laCantidadDelProductoEnElCarritoSeActualizaCorrectamente() {
        
        quitarDriver();
    }
}
