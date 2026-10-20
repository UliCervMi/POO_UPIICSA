module cervantes.uli.conteo {
    requires javafx.controls;
    requires javafx.fxml;

    opens cervantes.uli.conteo to javafx.fxml;
    exports cervantes.uli.conteo;
}
