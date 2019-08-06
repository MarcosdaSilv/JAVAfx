
package Visao;

import Controle.ControleOlaMundoFXML;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Marcos
 */
public class OlaMundoFXML extends Application{
    
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      FXMLLoader load = new FXMLLoader(getClass().getResource("/Layout/OlaMundoFXML.fxml"));
      load.setController(new ControleOlaMundoFXML());
      primaryStage.setScene(new Scene(load.load()));
      primaryStage.show();
    }
    
    
    
}
