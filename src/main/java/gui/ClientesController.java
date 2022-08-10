
package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class ClientesController {


    @FXML
    private BorderPane mainPane;
    @FXML
    private Button btnMainMenu;
     
    
    @FXML
    private void salir(ActionEvent event) throws IOException{
        App.setRoot("primary");
    }

}
