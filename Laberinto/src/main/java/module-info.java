module com.example.laberinto {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.laberinto to javafx.fxml;
    exports com.example.laberinto;
}