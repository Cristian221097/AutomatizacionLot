package Helper;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;



public class Manejador {

    public Manejador instancia;
    public String url = "https://www.conectate.com.do/loterias/?date=";



    public String diaFecha;
    public String mesFecha;
    public String anoFecha;

    public Manejador(){

    }

    public Manejador getInstancia(){

        if(instancia == null){

            instancia = new Manejador();
        }

        return instancia;

    }

    public String obtenerDiaDeSemana(String date){

        String valorDia ="";

        try{
            Locale espanol = new Locale("es","DO");
            Date fecha = new SimpleDateFormat("dd-MM-yyyy", espanol).parse(date);

            GregorianCalendar fechaCalendario = new GregorianCalendar();
            fechaCalendario.setTime(fecha);

            int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);

            if(diaSemana == 1){

                valorDia = "domingo";

            }else if(diaSemana == 2){
                valorDia = "lunes";
            }else if(diaSemana == 3){
                valorDia = "martes";
            }else if(diaSemana == 4){
                valorDia = "miercoles";
            }else if(diaSemana == 5){
                valorDia = "jueves";
            }else if(diaSemana == 6){
                valorDia = "viernes";
            }else if(diaSemana ==7 ){
                valorDia = "sabado";
            }



        }catch (ParseException except){
            except.printStackTrace();
        }

        return valorDia;

    }

    public void obtenerFecha(String fecha){

         diaFecha = fecha.substring(0,2);
         mesFecha = fecha.substring(3,5);
         anoFecha = fecha.substring(6,10);

         System.out.println("diaFecha "+diaFecha);
        System.out.println("mesFecha" +mesFecha);
        System.out.println("anoFecha "+ anoFecha);

    }

}
