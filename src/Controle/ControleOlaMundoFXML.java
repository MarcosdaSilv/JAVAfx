
package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Marcos
 */
public class ControleOlaMundoFXML {
    @FXML
    Button ButtonOk;
    @FXML
    TextField textFieldNome;
    @FXML
    Label labelNome;
    
    public void escreverNome(ActionEvent evento){
        System.out.println("Olá "+ textFieldNome.getText());
    
    }
    
}
