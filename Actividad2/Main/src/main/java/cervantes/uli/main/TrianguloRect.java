package cervantes.uli.main;
import java.util.Locale;
/**
 *
 * @author Ulli
 */


public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt((ancho * ancho) + (alto * alto));
        return ancho + alto + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        String salidaBase = super.imprimeFigura();
        String detalle = String.format(Locale.US, 
            "Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f", 
            ancho, alto, calcularArea(), calcularPerimetro());
        
        return salidaBase + "\n\n" + detalle;
    }
}