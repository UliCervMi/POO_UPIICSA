
package cervantes.uli.desglosedinero;

/**
 *
 * @author Ulli
 */
public class desglose {
    private int varo;

    public desglose(int varo) {
        this.varo = varo;
    }
    
    int billetesDeQuinientos(){
        int cant=0;
        if(varo>=500){
            cant= varo/500;
            varo%=500;
        }
        
        return cant;
    }
    
    int billetesDeDoscientos(){
        int cant=0;
        if(varo>=200){
            cant= varo/200;
            varo%=200;
        }
        return cant;
    }
    
    int billetesDeCien(){
        int cant=0;
        if(varo>=100){
            cant= varo/100;
            varo%=100;
        }
        return cant;
    }
    
    int billetesDeCincuenta(){
        int cant=0;
        if(varo>=50){
            cant= varo/50;
            varo%=50;
        }
        return cant;
    }
    
    int billetesDeVeinte(){
        int cant=0;
        if(varo>=20){
            cant= varo/20;
            varo%=20;
        }
        return cant;
    }
    
    int monedasDeDiez(){
        int cant=0;
        if(varo>=10){
            cant= varo/10;
            varo%=10;
        }
        return cant;
    }
    
    int monedasDeCinco(){
        int cant=0;
        if(varo>=5){
            cant= varo/5;
            varo%=5;
        }
        return cant;
    }
 
    int monedasDeDos(){
        int cant=0;
        if(varo>=2){
            cant= varo/2;
            varo%=2;
        }
        return cant;
    }
    
    int monedasDeUno(){
        int cant=0;
        if(varo>=1){
            cant= varo;
        }
        return cant;
    }
    
}
