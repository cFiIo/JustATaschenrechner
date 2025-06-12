module de.justataschenrechner {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.justataschenrechner to javafx.fxml;
    exports de.justataschenrechner;
}