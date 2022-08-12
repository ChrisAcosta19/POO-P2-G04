package gui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class PrimaryController{

    @FXML
    private BorderPane mainPane;
    @FXML
    private Button btnSalir;
    @FXML
    private GridPane buttonsPane;
    @FXML
    private Button btnSrvs;
    @FXML
    private Button btnEmpl;
    @FXML
    private Button btnClients;
    @FXML
    private Button btnAtens;
    @FXML
    private Button btnCitas;
    @FXML
    private ImageView iconCitas;
    @FXML
    private ImageView iconSrv;
    @FXML
    private ImageView iconAtens;
    @FXML
    private ImageView iconEmpl;
    @FXML
    private ImageView iconClientes;

    @FXML
    private void initialize() {
        cargarIcons();

    }
    
    
    private void cargarIcons() {
        InputStream input = null;
        InputStream input1 = null;
        InputStream input2 = null;
        InputStream input3 = null;
        InputStream input4 = null;
        try {
            input = new FileInputStream(App.pathImg + "iconCitas.png");
            Image image = new Image(input, 100, 100, false, false);
            iconCitas.setImage(image);
            input1 = new FileInputStream(App.pathImg + "iconServicios.png");
            Image image1 = new Image(input1, 100, 100, false, false);
            iconSrv.setImage(image1);
            input2 = new FileInputStream(App.pathImg + "iconAtenciones.png");
            Image image2 = new Image(input2, 100, 100, false, false);
            iconAtens.setImage(image2);
            input3 = new FileInputStream(App.pathImg + "iconEmpleados.png");
            Image image3 = new Image(input3, 100, 100, false, false);
            iconEmpl.setImage(image3);
            input4 = new FileInputStream(App.pathImg + "iconClientes.png");
            Image image4 = new Image(input4, 100, 100, false, false);
            iconClientes.setImage(image4);
        } catch (Exception ex) {
            System.out.println("No se pudo cargar los iconos");
        } 
    }
    
    @FXML
    private void salir(ActionEvent event) {
    }

    @FXML
    private void menuServicios(ActionEvent event) throws IOException{
        App.setRoot("servicios");
    }

    @FXML
    private void menuEmpleados(ActionEvent event) throws IOException{
        App.setRoot("empleados");
    }

    @FXML
    private void menuClientes(ActionEvent event) throws IOException{
        App.setRoot("clientes");
    }

    @FXML
    private void menuAtenciones(ActionEvent event) throws IOException{
        App.setRoot("atenciones");
    }

    @FXML
    private void menuCitas(ActionEvent event) throws IOException{
        App.setRoot("citas");
    }
}
