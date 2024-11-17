package Ejecutar;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Vista/laberinto.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1020, 665);
        stage.setScene(scene);
        stage.setTitle("Laberinto");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}