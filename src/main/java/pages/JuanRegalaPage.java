package pages;

import org.openqa.selenium.By;

public class JuanRegalaPage {

    private static By imgCedeJuanRegala = By.xpath("//img[@src='https://juanregala.com.co/media/wysiwyg/banners/BANNER-CIUDADES-JR-2020-BOGOTA-A_1.jpg']");
    private static By txtBuscadorJuanRegala = By.name("q");
    private static By btnBuscadorJuanRegala = By.xpath("//button[@id='basic-search']");
    private static By imgJuanRegalaProducto;
    private static By lblResultadoProducto;

    public static By getImgJuanRegalaProducto() {
        return imgJuanRegalaProducto;
    }

    public static void setImgJuanRegalaProducto(String producto) {
        JuanRegalaPage.imgJuanRegalaProducto = By.xpath("//a[contains(text(),'"+producto+"')]");
    }

    public static By getLblResultadoProducto() {
        return lblResultadoProducto;
    }

    public static void setLblResultadoProducto(String producto) {
        JuanRegalaPage.lblResultadoProducto = By.xpath("//h1[contains(text(),'"+producto+"')]");
    }

    public static By getImgCedeJuanRegala() {
        return imgCedeJuanRegala;
    }

    public static By getTxtBuscadorJuanRegala() {
        return txtBuscadorJuanRegala;
    }

    public static By getBtnBuscadorJuanRegala() {
        return btnBuscadorJuanRegala;
    }
}
