

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Fernando_Huilca
 */
public class Laberinto extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Presentation/ConfiguracionMemorias.fxml"));
            Parent root = loader.load();
            // Cambia la escena en el Stage actual
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        launch(args);
    }
}
