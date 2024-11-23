module com.example.laberintoapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.laberintoapp to javafx.fxml;
    exports com.example.laberintoapp;
}