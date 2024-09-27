module com.alesandro.ejercicio15a {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.alesandro.ejercicio15a to javafx.fxml;
    exports com.alesandro.ejercicio15a;
}