module com.example.graphworks {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.graphworks to javafx.fxml;
    exports com.example.graphworks;
}