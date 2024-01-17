package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UpdateQuantityProductUi extends PageObject {
    public static final Target AumentarCantidad = Target
            .the("AumentarCantidad")
            .located(By.id("item-quantity-change-increment-106545"));

    public static final Target Showcantidad = Target
            .the("Showcantidad")
            .located(By.id("item-quantity-106545"));

}
