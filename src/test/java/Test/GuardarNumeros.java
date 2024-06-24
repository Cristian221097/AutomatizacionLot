package Test;


import Page.LoteriaPage;
import basetest.BaseTest;
import helpers.HelperFile;
import org.testng.annotations.Test;

public class GuardarNumeros extends BaseTest {

    LoteriaPage loteriaPage;

    @Test(description = "obtener resultado sorteo")
    public void guardarNumeros() throws InterruptedException {
        loteriaPage  = new LoteriaPage();
        loteriaPage.BuscarNumerosGanadores(getDriver());
        HelperFile.getInstance().createFile(System.getProperty("user.dir") + "\\src\\main\\resources\\numeros\\ResultadosLoterias", loteriaPage.numerosDeHoy.toString(), "txt");

    }



}
