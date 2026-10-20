package cervantes.uli.conteo;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController{

    @FXML
    private TextField contador;

    @FXML
    private Button cuenta;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Button esperar;

    private int contadorClics = 0;

    @FXML
    private void initialize() {
        contador.setText(String.valueOf(contadorClics));
        progressBar.setProgress(0.0);
    }

    @FXML
    private void cuenta() {
        contadorClics++;
        contador.setText(String.valueOf(contadorClics));
    }

    @FXML
    private void espera() {
        esperar.setDisable(true);
        progressBar.setProgress(0.0);

        Thread hiloEspera = new Thread(() -> {
            try {
                int totalPasos = 100;
                for (int i = 1; i <= totalPasos; i++) {
                    Thread.sleep(100); 
                    
                    final double progresoActual = (double) i / totalPasos;

                    Platform.runLater(() -> {
                        progressBar.setProgress(progresoActual);
                    });
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                Platform.runLater(() -> {
                    esperar.setDisable(false);
                });
            }
        });

        hiloEspera.start();
    }
}