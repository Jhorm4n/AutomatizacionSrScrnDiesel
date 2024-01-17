package co.com.sofka.ui;

import net.serenitybdd.screenplay.actions.OpenPage;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddMultipleProduct extends OpenPage {

    public static final Target AddProduct1 = Target
            .the("AddProduct1")
            .located(By.xpath("//*[@id=\"28984\"]/section/a/article/div[5]/div/div[2]/button"));

    public static final Target AddProduct2 = Target
            .the("AddProduct2")
            .located(By.xpath("//*[@id=\"24650\"]/section/a/article/div[5]/div/div[2]/button"));

    public static final Target Regresar = Target
            .the("Regresar")
            .located(By.xpath("/html/body/div[8]/div/div[1]/button"));


}
