package Page;

import Helper.Manejador;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LoteriaPage {

    Manejador manejador = new Manejador();

    public List<String> Loteria = new ArrayList<String>();

    public StringBuilder numerosDeHoy = new StringBuilder();

    public List<String> fechas = new ArrayList<String>();
    public String primerPremio;
    public String segundoPremio;
    public String tercerPremio;

    public String dia;
    ;

    public String mes;

    public String year;

    public String despuesDel;

    public String diaSemana;

    public String fechaBusqueda;

    public String diaAntes;

    public String fechaLoteria;

    public String fechaAntes;

    private String diaMesBusqueda;

    private static final int TIME_WAIT = 30;

    public HashMap<String, String> nombreLoteria = new HashMap<String, String>();

    public LoteriaPage() {

        Loteria.add("Gana Más");
        Loteria.add("Lotería Nacional");
        Loteria.add("Quiniela Leidsa");
        Loteria.add("Quiniela Real");
        Loteria.add("Quiniela Loteka");
        Loteria.add("New York 3:30");
        Loteria.add("New York 11:30");
   /*     Loteria.add("La Primera");
        Loteria.add("Florida Día");
        Loteria.add("Florida Noche");

        Loteria.add("La Suerte MD");
        Loteria.add("Quiniela");*/

        nombreLoteria.put("Gana Más", "nacional dia");
        nombreLoteria.put("Lotería Nacional", "nacional noche");
        nombreLoteria.put("Quiniela Leidsa", "quiniela pale");
        nombreLoteria.put("Quiniela Real", "real");
        nombreLoteria.put("Quiniela Loteka", "loteka");
        nombreLoteria.put("New York 3:30", "new york dia");
        nombreLoteria.put("New York 11:30", "new york noche");
/*        nombreLoteria.put("Florida Día", "florida dia");
        nombreLoteria.put("Florida Noche", "florida noche");
        nombreLoteria.put("La Primera", "la primera");
        nombreLoteria.put("La Suerte MD", "la suerte");
        nombreLoteria.put("Quiniela", "loteria dominicana");*/

        fechas.add("01-01-2024");
        fechas.add("02-01-2024");
        fechas.add("03-01-2024");
        fechas.add("04-01-2024");
        fechas.add("05-01-2024");
        fechas.add("06-01-2024");
        fechas.add("07-01-2024");
        fechas.add("08-01-2024");
        fechas.add("09-01-2024");
        fechas.add("10-01-2024");
        fechas.add("11-01-2024");
        fechas.add("12-01-2024");
        fechas.add("13-01-2024");
        fechas.add("14-01-2024");
        fechas.add("15-01-2024");
        fechas.add("16-01-2024");
        fechas.add("17-01-2024");
        fechas.add("18-01-2024");
        fechas.add("19-01-2024");
        fechas.add("20-01-2024");

        fechas.add("21-01-2024");
        fechas.add("22-01-2024");
        fechas.add("23-01-2024");
        fechas.add("24-01-2024");
        fechas.add("25-01-2024");
        fechas.add("26-01-2024");
        fechas.add("27-01-2024");
        fechas.add("28-01-2024");
        fechas.add("29-01-2024");
        fechas.add("30-01-2024");
        fechas.add("31-01-2024");

        fechas.add("01-02-2024");
        fechas.add("02-02-2024");
        fechas.add("03-02-2024");
        fechas.add("04-02-2024");
        fechas.add("05-02-2024");
        fechas.add("06-02-2024");
        fechas.add("07-02-2024");
        fechas.add("08-02-2024");
        fechas.add("09-02-2024");
        fechas.add("10-02-2024");
        fechas.add("11-02-2024");
        fechas.add("12-02-2024");
        fechas.add("13-02-2024");
        fechas.add("14-02-2024");
        fechas.add("15-02-2024");
        fechas.add("16-02-2024");
        fechas.add("17-02-2024");
        fechas.add("18-02-2024");
        fechas.add("19-02-2024");
        fechas.add("20-02-2024");

        fechas.add("21-02-2024");
        fechas.add("22-02-2024");
        fechas.add("23-02-2024");
        fechas.add("24-02-2024");
        fechas.add("25-02-2024");
        fechas.add("26-02-2024");
        fechas.add("27-02-2024");
        fechas.add("28-02-2024");
        fechas.add("29-02-2024");

        fechas.add("01-03-2024");
        fechas.add("02-03-2024");
        fechas.add("03-03-2024");
        fechas.add("04-03-2024");
        fechas.add("05-03-2024");
        fechas.add("06-03-2024");
        fechas.add("07-03-2024");
        fechas.add("08-03-2024");
        fechas.add("09-03-2024");
        fechas.add("10-03-2024");
        fechas.add("11-03-2024");
        fechas.add("12-03-2024");
        fechas.add("13-03-2024");
        fechas.add("14-03-2024");
        fechas.add("15-03-2024");
        fechas.add("16-03-2024");
        fechas.add("17-03-2024");
        fechas.add("18-03-2024");
        fechas.add("19-03-2024");
        fechas.add("20-03-2024");
        fechas.add("21-03-2024");
        fechas.add("22-03-2024");
        fechas.add("23-03-2024");
        fechas.add("24-03-2024");
        fechas.add("25-03-2024");
        fechas.add("26-03-2024");
        fechas.add("27-03-2024");
        fechas.add("28-03-2024");
        fechas.add("29-03-2024");
        fechas.add("30-03-2024");
        fechas.add("31-03-2024");
        
    }


    public void BuscarNumerosGanadores(WebDriver driver) {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TIME_WAIT));

        for (int d = 0; d < fechas.size(); d++) {

            for (int i = 0; i < Loteria.size(); i++) {

                manejador.getInstancia().obtenerFecha(fechas.get(d));

                dia = manejador.getInstancia().diaFecha;

                mes = manejador.getInstancia().mesFecha;

                year = manejador.getInstancia().anoFecha;

                fechaBusqueda = dia + "-" + mes + "-" + year;

                diaMesBusqueda = dia + "-" + mes;

                diaSemana = manejador.getInstancia().obtenerDiaDeSemana(fechaBusqueda);

                diaAntes = String.valueOf(Integer.parseInt(dia) - 1);

                fechaLoteria = year + "/" + mes + "/" + dia;

                By primerPremioLocator = By.xpath("//*/span[text()='" + Loteria.get(i) + "']//parent::node()//parent::node()//parent::node()//parent::node()//span[@class='score '][1]");
                By segundoPremioLocator = By.xpath("//*/span[text()='" + Loteria.get(i) + "']//parent::node()//parent::node()//parent::node()//parent::node()//span[@class='score '][2]");
                By tercerPremioLocator = By.xpath("//*/span[text()='" + Loteria.get(i) + "']//parent::node()//parent::node()//parent::node()//parent::node()//span[@class='score '][3]");
                By fechaLocator = By.xpath("//*/span[text()='" + Loteria.get(i) + "']//parent::node()//parent::node()//parent::node()//parent::node()//*/span[@class='session-date session-badge']");
                By msjRetrasoBillete = By.xpath("//*/span[text()='" + Loteria.get(i) + "']//parent::node()//parent::node()//parent::node()//parent::node()/..//b[normalize-space()='Retraso: billetes']");
                By locatorLoteria = By.xpath("//*/span[text()='" + Loteria.get(i) + "']");


                Actions actions = new Actions(driver);

                try {
                    driver.get(manejador.getInstancia().url + fechaBusqueda);
                } catch (Exception e) {
                    driver.get(manejador.getInstancia().url + fechaBusqueda);

                }

                //   driver.get(manejador.getInstancia().url + fechaBusqueda);
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_WAIT));
                wait.until(ExpectedConditions.presenceOfElementLocated(locatorLoteria));


                if (driver.findElement(fechaLocator).getText().equals(diaMesBusqueda)) {
                    if (driver.findElement(primerPremioLocator).isDisplayed()) {
                        actions.moveToElement(driver.findElement(primerPremioLocator));
                        actions.perform();

                        primerPremio = driver.findElement(primerPremioLocator).getText();

                        if (primerPremio.equals("00")) {
                            primerPremio = "100";
                        }


                    }

                    if (driver.findElement(segundoPremioLocator).isDisplayed()) {
                        segundoPremio = driver.findElement(segundoPremioLocator).getText();

                        if (segundoPremio.equals("00")) {
                            segundoPremio = "100";
                        }

                    }

                    if (driver.findElement(tercerPremioLocator).isDisplayed()) {

                        tercerPremio = driver.findElement(tercerPremioLocator).getText();

                        if (tercerPremio.equals("00")) {
                            tercerPremio = "100";
                        }

                    }

                    if (dia.equals("01") && (mes.equals("02") || mes.equals("04") || mes.equals("06") || mes.equals("08") || mes.equals("09") || mes.equals("11"))) {

                        diaAntes = "31";
                        mes = String.valueOf(Integer.parseInt(mes) - 1);

                    } else if (dia.equals("01") && mes.equals("01")) {

                        diaAntes = "31";
                        mes = "12";
                        year = String.valueOf(Integer.parseInt(year) - 1);

                    } else if (dia.equals("01") && mes.equals("03")) {

                        diaAntes = "29";
                        mes = String.valueOf(Integer.parseInt(mes) - 1);

                    } else if (dia.equals("01")) {
                        diaAntes = "30";
                        mes = String.valueOf(Integer.parseInt(mes) - 1);
                    }

                    fechaAntes = diaAntes + "-" + mes + "-" + year;
                    try {
                        driver.get(manejador.getInstancia().url + fechaAntes);

                    } catch (Exception e) {
                        driver.get(manejador.getInstancia().url + fechaAntes);

                    }

                    //   driver.get(manejador.getInstancia().url + fechaAntes);

                    wait.until(ExpectedConditions.presenceOfElementLocated(locatorLoteria));

                    if (driver.findElement(primerPremioLocator).isDisplayed()) {
                        actions.moveToElement(driver.findElement(primerPremioLocator));
                        actions.perform();
                        despuesDel = driver.findElement(primerPremioLocator).getText();

                        if (despuesDel.equals("00")) {
                            despuesDel = "100";
                        }

                    }

                    numerosDeHoy.append("CALL Insertar_Numeros('").append(nombreLoteria.get(Loteria.get(i))).append("',").append(primerPremio).append(",").append(segundoPremio).append(",").append(tercerPremio).append(",").append(despuesDel).append(",'").append(diaSemana).append("','").append(fechaLoteria).append("');\n");


                } else {

                    System.out.println("no");
                }

            }

        }

    }

}
