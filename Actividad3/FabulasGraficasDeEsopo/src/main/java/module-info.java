module cervantes.uli.fabulasgraficasdeesopo {
    requires javafx.controls;
    requires javafx.fxml;

    opens cervantes.uli.fabulasgraficasdeesopo to javafx.fxml;
    exports cervantes.uli.fabulasgraficasdeesopo;
}
