
package cervantes.uli.gatossemanales;

/**
 *
 * @author Ulli
 */
public class gastos {
    private double[] datos;

    public gastos(double[] datos) {
        this.datos = datos;
    }

    public double suma(){
        double total=0.0;
        for (int i = 0; i < datos.length; i++) {
            total+=datos[i];
        }
        
        return total;
    }
    
    
    public String mayor(){
        String max="";
        double m=0;
        for (int i = 0; i <datos.length; i++) {
            if (datos[i]>m) {
                m=datos[i];
            }
        }
        if (datos[0]==m) 
            max="Alimentacion";
        if (datos[1]==m) 
            max="Refrigerios";
        if (datos[2]==m) 
            max="Transporte";
        if (datos[3]==m) 
            max="Telefonia";
        if (datos[4]==m) 
            max="Otros";

        return max;
    }

    
}
