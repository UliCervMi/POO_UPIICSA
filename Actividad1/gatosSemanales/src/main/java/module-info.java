module cervantes.uli.gatossemanales {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens cervantes.uli.gatossemanales to javafx.fxml;
    exports cervantes.uli.gatossemanales;
}
