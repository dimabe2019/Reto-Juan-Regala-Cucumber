package stepsDefinitions;

import cucumber.api.java.en.*;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.JuanRegalaSteps;

public class BuscadorJuanRegalaStepDefinitions {

    @Steps
    JuanRegalaSteps juanRegalaSteps = new JuanRegalaSteps();

    @Given("^que me encuentro en la pagina de JuanRegala con la url (.*)$")
    public void queMeEncuentroEnLaPaginaDeJuanRegalaConLaUrlHttpsJuanregalaComCo(String url) {
        SeleniumWebDriver.ChromeWebDriver(url);
    }

    @When("^busco el producto en el buscador$")
    public void buscoElProductoEnElBuscador() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        juanRegalaSteps.buscarProductoEnJuanRegala();
        
    }

    @Then("^podre ver el producto en pantalla$")
    public void podreVerElProductoEnPantalla() {
       //SeleniumWebDriver.driver.quit();
    }
}
