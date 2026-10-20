module cervantes.uli.edadpersona {
    requires javafx.controls;
    requires javafx.fxml;

    opens cervantes.uli.edadpersona to javafx.fxml;
    exports cervantes.uli.edadpersona;
}
