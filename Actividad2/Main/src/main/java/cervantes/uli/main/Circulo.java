package cervantes.uli.main;

/**
 *
 * @author Ulli
 */
import java.util.Locale;

public class Circulo extends FiguraCircular {

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String imprimeFigura() {
        String salidaBase = super.imprimeFigura();
        String detalle = String.format(Locale.US, 
            "Se imprime un Circulo con radio: %d, area: %.2f, perimetro: %.2f", 
            radio, calcularArea(), calcularPerimetro());
        
        return salidaBase + "\n\n" + detalle;
    }
}