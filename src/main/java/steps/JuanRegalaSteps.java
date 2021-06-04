package steps;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import pages.JuanRegalaPage;
import utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class JuanRegalaSteps {

    private static ArrayList<Map<String, String>> lecturaExcel = new ArrayList<Map<String, String>>();

    public void escribirEnTexto(By elemento, String texto) {
        boolean validarElemento = false;
        while (validarElemento == false) {
            try {
                SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
                validarElemento = true;
            } catch (Exception e) {

            }
        }
    }

    public void clicEnElemento(By elemento) {
        boolean validarElemento = false;
        while (validarElemento == false) {
            try {
                SeleniumWebDriver.driver.findElement(elemento).click();
                validarElemento = true;
            } catch (Exception e) {

            }
        }
    }

    public String obtenerTextoDeElemento(By elemento) {
        boolean validarElemento = false;
        String textElemento = "";
        while (validarElemento == false) {
            try {
                textElemento = SeleniumWebDriver.driver.findElement(elemento).getText();
                validarElemento = true;
            } catch (Exception e) {

            }
        }
        return textElemento;
    }

    public void validarTextoEnPantalla(By elemento, String texto) {
        boolean validarTexto = false;
        if(obtenerTextoDeElemento(elemento).contains(texto)) {
            validarTexto = true;
        }
        assertEquals(true, validarTexto);
    }

    public void buscarProductoEnJuanRegala() {
        try {
            lecturaExcel = Excel.readExcel("C:\\Users\\LuisAmaris\\Desktop\\Documento pruebas automatizadas\\productos.xlsx", "Hoja1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        clicEnElemento(JuanRegalaPage.getImgCedeJuanRegala());

        for (int i = 0; i < lecturaExcel.size(); i++) {

            escribirEnTexto(JuanRegalaPage.getTxtBuscadorJuanRegala(), lecturaExcel.get(i).get("Productos"));
            clicEnElemento(JuanRegalaPage.getBtnBuscadorJuanRegala());
            JuanRegalaPage.setImgJuanRegalaProducto(lecturaExcel.get(i).get("Productos"));
            clicEnElemento(JuanRegalaPage.getImgJuanRegalaProducto());
            JuanRegalaPage.setLblResultadoProducto(lecturaExcel.get(i).get("Productos"));
            validarTextoEnPantalla(JuanRegalaPage.getLblResultadoProducto(),lecturaExcel.get(i).get("Productos"));
        }
    }
    /* public void clicEnElemento(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    public void escribirEnTexto(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }

    public String obtenerTextoDeElement(By elemento) {
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }

    public void validarTextoEnPantalla(By elemento, String texto) {
        assertEquals(obtenerTextoDeElement(elemento), texto);
    }

    public void buscarPalabraEnJuanRegala(String palabra) {
        clicEnElemento(JuanRegalaPage.getImgCedeJuanRegala());
        escribirEnTexto(JuanRegalaPage.getTxtBuscadorJuanRegala(), palabra);
        clicEnElemento(JuanRegalaPage.getBtnBuscadorJuanRegala());
        clicEnElemento(JuanRegalaPage.getImgJuanRegalaProducto());
        validarTextoEnPantalla(JuanRegalaPage.getLblResultadoEquipo(), "Docena de Rosas en Base de Vidrio");
    } */
}
