package cervantes.uli.test;
/**
 *
 * @author Ulli
 */
public class Profesor extends Persona {
    private int clave;

    public Profesor(int numEmpleado) {
        super(); 
        this.clave = numEmpleado;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + edad + ", con clave " + clave;
    }
}