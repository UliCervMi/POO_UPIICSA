package cervantes.uli.fabulasgraficasdeesopo;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {

    @FXML
    private Button btnIniciar;

    @FXML
    private Label lblLiebre;

    @FXML
    private ProgressBar progressLiebre;

    @FXML
    private Label Tortuga;

    @FXML
    private ProgressBar progressTortuga;

    @FXML
    private void initialize() {
        progressLiebre.setProgress(0.0);
        progressTortuga.setProgress(0.0);
    }

    @FXML
    private void IniciarCarrera() {
        btnIniciar.setDisable(true);
        progressLiebre.setProgress(0.0);
        progressTortuga.setProgress(0.0);
        lblLiebre.setText("La Liebre: ¡Está corriendo!");
        Tortuga.setText("La Tortuga: ¡Está corriendo!");

        Thread hiloTortuga = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                final double progreso = i / 100.0;
                Platform.runLater(() -> progressTortuga.setProgress(progreso));
            }
            Platform.runLater(() -> Tortuga.setText("La Tortuga: ¡Llegó a la meta y ganó!"));
        });

        Thread hiloLiebre = new Thread(() -> {
            for (int i = 1; i <= 40; i++) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                final double progreso = i / 100.0;
                Platform.runLater(() -> progressLiebre.setProgress(progreso));
            }

            Platform.runLater(() -> lblLiebre.setText("La Liebre: ¡Se durmió!"));
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            Platform.runLater(() -> lblLiebre.setText("La Liebre: ¡Despertó muy tarde!"));
            for (int i = 41; i <= 100; i++) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                final double progreso = i / 100.0;
                Platform.runLater(() -> progressLiebre.setProgress(progreso));
            }

            Platform.runLater(() -> {
                lblLiebre.setText("La Liebre: ¡Llegó a la meta pero perdió!");
                btnIniciar.setDisable(false);
            });
        });

        hiloTortuga.start();
        hiloLiebre.start();
    }
}