package cervantes.uli.edadpersona;
import java.time.LocalDate;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private DatePicker fechaNac;
    @FXML
    private Label edad;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void accionCalc(ActionEvent event) {
        LocalDate fecha = fechaNac.getValue();
        int año = fecha.getYear();
        int mes = fecha.getMonthValue();
        int dia = fecha.getDayOfMonth();
        LocalDate fechaHoy = LocalDate.now();
        int añoHoy = fechaHoy.getYear();
        int mesHoy = fechaHoy.getMonthValue();
        int diaHoy = fechaHoy.getDayOfMonth();
        calcEdad A = new calcEdad(año, mes, dia, añoHoy, mesHoy, diaHoy);
        edad.setText(A.mostarEdad());
    }

    @FXML
    private void accionLimp(ActionEvent event) {
        edad.setText("...");
    }
}
