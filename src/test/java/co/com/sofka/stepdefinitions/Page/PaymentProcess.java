package co.com.sofka.stepdefinitions.Page;

import co.com.sofka.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.AutomationPage.PaymentProcessTasks.paymentProcessTasks;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PaymentProcess extends Setup {

    @When("el usuario procede al pago")
    public void elUsuarioProcedeAlPago() {
        theActorInTheSpotlight().wasAbleTo(
                paymentProcessTasks()
        );
    }

    @And("completa la información de envío y pago")
    public void completaLaInformacionDeEnvioYPago() {
quitarDriver();
    }

    @Then("la orden de compra se debería realizar con éxito")
    public void laOrdenDeCompraSeDeberiaRealizarConExito() {
    }


}
