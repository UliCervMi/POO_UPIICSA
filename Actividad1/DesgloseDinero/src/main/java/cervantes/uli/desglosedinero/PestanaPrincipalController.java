
package cervantes.uli.desglosedinero;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ulli
 */
public class PestanaPrincipalController implements Initializable {

    @FXML
    private TextField dinero;
    @FXML
    private Label quinientos;
    @FXML
    private Label doscientos;
    @FXML
    private Label cien;
    @FXML
    private Label cincuenta;
    @FXML
    private Label veinte;
    @FXML
    private Label diez;
    @FXML
    private Label cinco;
    @FXML
    private Label dos;
    @FXML
    private Label uno;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void borrar(ActionEvent event) {
        dinero.setText("");
        quinientos.setText("...");
        doscientos.setText("...");
        cien.setText("...");
        cincuenta.setText("...");
        veinte.setText("...");
        diez.setText("...");
        cinco.setText("...");
        dos.setText("...");
        uno.setText("...");
    }

    @FXML
    private void informacionDinero(ActionEvent event) {
        double filtro = Double.parseDouble(dinero.getText());
        int cantidad = (int)filtro;
        desglose des = new desglose(cantidad);
        quinientos.setText(des.billetesDeQuinientos()+"");
        doscientos.setText(des.billetesDeDoscientos()+"");
        cien.setText(des.billetesDeCien()+"");
        cincuenta.setText(des.billetesDeCincuenta()+"");
        veinte.setText(des.billetesDeVeinte()+"");
        diez.setText(des.monedasDeDiez()+"");
        cinco.setText(des.monedasDeCinco()+"");
        dos.setText(des.monedasDeDos()+"");
        uno.setText(des.monedasDeUno()+"");
    }
    
}
