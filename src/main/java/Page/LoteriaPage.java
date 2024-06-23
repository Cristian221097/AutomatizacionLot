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

    public List<String> numerosDeHoy = new ArrayList<String>();

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

    public HashMap<String, String> nombreLoteria = new HashMap<String, String>();

    public LoteriaPage() {

        Loteria.add("Gana Más");
        Loteria.add("Lotería Nacional");
        Loteria.add("Quiniela Leidsa");
        Loteria.add("Quiniela Real");
        Loteria.add("Quiniela Loteka");
        Loteria.add("New York 3:30");
        Loteria.add("New York 11:30");
        Loteria.add("La Primera");
        Loteria.add("Florida Día");
        Loteria.add("Florida Noche");

        Loteria.add("La Suerte MD");
        Loteria.add("Quiniela");

        nombreLoteria.put("Gana Más", "nacional dia");
        nombreLoteria.put("Lotería Nacional", "nacional noche");
        nombreLoteria.put("Quiniela Leidsa", "quiniela pale");
        nombreLoteria.put("Quiniela Real", "real");
        nombreLoteria.put("Quiniela Loteka", "loteka");
        nombreLoteria.put("New York 3:30", "new york dia");
        nombreLoteria.put("New York 11:30", "new york noche");
        nombreLoteria.put("Florida Día", "florida dia");
        nombreLoteria.put("Florida Noche", "florida noche");
        nombreLoteria.put("La Primera", "la primera");
        nombreLoteria.put("La Suerte MD", "la suerte");
        nombreLoteria.put("Quiniela", "loteria dominicana");


     /*   fechas.add("22-01-2022");
        fechas.add("27-12-2022");
        fechas.add("12-12-2022");
        fechas.add("11-12-2022");
        fechas.add("09-12-2022");

        fechas.add("18-09-2022");
        fechas.add("28-03-2021");
        fechas.add("16-07-2021");*/

       /* fechas.add("24-07-2018");
        fechas.add("23-07-2018");
        fechas.add("22-07-2018");
        fechas.add("21-07-2018");
        fechas.add("20-07-2018");
        fechas.add("19-07-2018");
        fechas.add("18-07-2018");
        fechas.add("17-07-2018");
        fechas.add("16-07-2018");
        fechas.add("15-07-2018");
        fechas.add("14-07-2018");
        fechas.add("13-07-2018");*/



        /*
        fechas.add("15-10-2020");
        fechas.add("16-10-2020");
        fechas.add("17-10-2020");
        fechas.add("18-10-2020");
        fechas.add("19-10-2020");
        fechas.add("20-10-2020");
        fechas.add("21-10-2020");
        fechas.add("22-10-2020");
        fechas.add("23-10-2020");
        fechas.add("24-10-2020");

        fechas.add("25-10-2020");
        fechas.add("26-10-2020");
        fechas.add("27-10-2020");
        fechas.add("28-10-2020");
        fechas.add("29-10-2020");
        fechas.add("30-10-2020");
        fechas.add("31-10-2020");
        fechas.add("01-11-2020");
        fechas.add("02-11-2020");
        fechas.add("03-11-2020");
        fechas.add("04-11-2020");
        fechas.add("05-11-2020");

        fechas.add("06-11-2020");
        fechas.add("07-11-2020");
        fechas.add("08-11-2020");
        fechas.add("09-11-2020");
        fechas.add("10-11-2020");
        fechas.add("11-11-2020");
        fechas.add("12-11-2020");

        fechas.add("13-11-2020");
        fechas.add("14-11-2020");
        fechas.add("15-11-2020");
        fechas.add("16-11-2020");
        fechas.add("17-11-2020");
        fechas.add("18-11-2020");
        fechas.add("19-11-2020");
        fechas.add("20-11-2020");
        fechas.add("21-11-2020");
        fechas.add("22-11-2020");
        fechas.add("23-11-2020");
        fechas.add("24-11-2020");

        fechas.add("25-11-2020");
        fechas.add("26-11-2020");
        fechas.add("27-11-2020");
        fechas.add("28-11-2020");
        fechas.add("29-11-2020");
        fechas.add("30-11-2020");
        //fechas.add("31-07-2020");
        fechas.add("01-12-2020");
        fechas.add("02-12-2020");
        fechas.add("03-12-2020");
        fechas.add("04-12-2020");
        fechas.add("05-12-2020");
        fechas.add("06-12-2020");

        fechas.add("07-12-2020");
        fechas.add("08-12-2020");
        fechas.add("09-12-2020");
        fechas.add("10-12-2020");
        fechas.add("11-12-2020");
        fechas.add("12-12-2020");*/

        fechas.add("11-03-2023");


    }


    public void BuscarNumerosGanadores(WebDriver driver) {

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

                Actions actions = new Actions(driver);
                driver.navigate().to(manejador.getInstancia().url + fechaBusqueda);
                //   driver.get(manejador.getInstancia().url + fechaBusqueda);
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.presenceOfElementLocated(primerPremioLocator));

                System.out.println("fechaLocator" + driver.findElement(fechaLocator).getText());
                System.out.println("fechaBusqueda" + fechaBusqueda);

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

                        diaAntes = "28";
                        mes = String.valueOf(Integer.parseInt(mes) - 1);

                    } else if (dia.equals("01") && mes.equals("03") && year.equals("2020")) {

                        diaAntes = "29";
                        mes = String.valueOf(Integer.parseInt(mes) - 1);

                    } else if (dia.equals("01")) {
                        diaAntes = "30";
                        mes = String.valueOf(Integer.parseInt(mes) - 1);
                    }

                    fechaAntes = diaAntes + "-" + mes + "-" + year;
                    driver.navigate().to(manejador.getInstancia().url + fechaAntes);
                    //   driver.get(manejador.getInstancia().url + fechaAntes);

                    wait.until(ExpectedConditions.presenceOfElementLocated(primerPremioLocator));

                    if (driver.findElement(primerPremioLocator).isDisplayed()) {
                        actions.moveToElement(driver.findElement(primerPremioLocator));
                        actions.perform();
                        despuesDel = driver.findElement(primerPremioLocator).getText();

                        if (despuesDel.equals("00")) {
                            despuesDel = "100";
                        }

                    }

                    numerosDeHoy.add("CALL Insertar_Numeros('" + nombreLoteria.get(Loteria.get(i)) + "'," + primerPremio + "," + segundoPremio + "," + tercerPremio + "," + despuesDel + ",'" + diaSemana + "','" + fechaLoteria + "');");

                    System.out.println("Loteria " + Loteria.get(i));
                    System.out.println("Loteria " + nombreLoteria.get(Loteria.get(i)));
                    System.out.println("primerPremio " + primerPremio);
                    System.out.println("segundoPremio " + segundoPremio);
                    System.out.println("tercerPremio " + tercerPremio);
                    System.out.println("despuesDel " + despuesDel);
                    System.out.println("diaSemana " + diaSemana);
                    System.out.println("fechaLoteria " + fechaLoteria);
                    System.out.println("numeros de hoy " + numerosDeHoy.toString());

                } else {

                    System.out.println("no");
                }

            }

        }

    }

}
