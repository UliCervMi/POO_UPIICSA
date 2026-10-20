module cervantes.uli.desglosedinero {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens cervantes.uli.desglosedinero to javafx.fxml;
    exports cervantes.uli.desglosedinero;
}
