
package cervantes.uli.edadpersona;
import java.time.LocalDate;

/**
 *
 * @author Ulli
 */
public class calcEdad {
    private int año;
    private int mes;
    private int dia;
    private int añoHoy;
    private int mesHoy;
    private int diaHoy;

    public calcEdad(int año, int mes, int dia, int añoHoy, int mesHoy, int diaHoy) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.añoHoy = añoHoy;
        this.mesHoy = mesHoy;
        this.diaHoy = diaHoy;

        
    }
    public String mostarEdad(){
        int añoMostrar = añoHoy - año;
        int mesMostrar = mesHoy - mes;
        if (mesMostrar < 0){
            añoMostrar-=1;
            mesMostrar+=12;
        }
        String texto="";
        if(mesMostrar>0)
            texto="Tiene "+añoMostrar+" años y "+mesMostrar+" meses";
        else
            texto="Tiene "+añoMostrar+" años";

        return texto;
    }


    
    
}
