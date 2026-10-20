package cervantes.uli.gatossemanales;

import java.io.IOException;
import java.util.function.UnaryOperator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

public class PrimaryController {

    @FXML
    private TextField alimentacion;
    @FXML
    private TextField refrigerios;
    @FXML
    private TextField transporte;
    @FXML
    private TextField telefonia;
    @FXML
    private TextField otros;
    @FXML
    private TextField totalSemana;
    @FXML
    private TextField gastoMayor;
    
    public void initialize() {
 
        UnaryOperator<TextFormatter.Change> filtroDecimales = change -> {
            String nuevoTexto = change.getControlNewText();
            if (nuevoTexto.matches("\\d*(\\.\\d*)?")) { 
                return change;
            }
            return null;
        };

       /*
        UnaryOperator<TextFormatter.Change> filtroNumeros = change -> {
            String nuevoTexto = change.getControlNewText();
            if (nuevoTexto.matches("\\d*")) { // Solo dígitos
                return change;
            }
            return null; // Si intenta escribir letras, lo ignora
            
        };
         */  //Para numeros enteros

        alimentacion.setTextFormatter(new TextFormatter<>(filtroDecimales));
        refrigerios.setTextFormatter(new TextFormatter<>(filtroDecimales));
        transporte.setTextFormatter(new TextFormatter<>(filtroDecimales));
        telefonia.setTextFormatter(new TextFormatter<>(filtroDecimales));
        otros.setTextFormatter(new TextFormatter<>(filtroDecimales));

    }
    
    
    @FXML
    private void calcula(ActionEvent event) {
        try {
            double datos[] = new double[5];
            datos[0]= alimentacion.getText().isEmpty()?0.0: Double.parseDouble(alimentacion.getText());
            datos[1]= refrigerios.getText().isEmpty()?0.0: Double.parseDouble(refrigerios.getText());
            datos[2]= transporte.getText().isEmpty()?0.0: Double.parseDouble(transporte.getText());
            datos[3]= telefonia.getText().isEmpty()?0.0: Double.parseDouble(telefonia.getText());
            datos[4]= otros.getText().isEmpty()?0.0: Double.parseDouble(otros.getText());
            gastos g= new gastos(datos);
            totalSemana.setText(g.suma()+"");
            gastoMayor.setText(g.mayor());
            
        } catch (Exception e) {
            totalSemana.setText("Eror en puntuacion decimal");
        }
    }

    @FXML
    private void limpia(ActionEvent event) {
        alimentacion.setText("");
        refrigerios.setText("");
        transporte.setText("");
        telefonia.setText("");
        otros.setText("");
        totalSemana.setText("");
        gastoMayor.setText("");
    }
}
