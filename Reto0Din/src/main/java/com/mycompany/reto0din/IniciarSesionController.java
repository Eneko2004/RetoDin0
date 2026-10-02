package com.mycompany.reto0din;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.*;

public class IniciarSesionController {

    ArrayList<Persona> personas = Datos.getPersonas();
    int idUsuario;
    
    @FXML
    private TextField emailField;
    @FXML
    private TextField contrasenaField;
    @FXML
    private Button validarButton;
    
    @FXML
    private void validarButton() throws IOException { 
    String email = emailField.getText();
    String contrasena = contrasenaField.getText();
    
    Persona encontrada = null;

    for (Persona p : personas) {

        if (p.getEmail().equalsIgnoreCase(email)
                && p.getContrasena().equalsIgnoreCase(contrasena)) {
            idUsuario=p.getId();
            encontrada = p;
            break;
        }
    }

    if (encontrada == null) {

        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Error");
        alerta.setHeaderText("Inicio de sesión incorrecto");
        alerta.setContentText("El usuario o la contraseña no son correctos.");
        alerta.showAndWait();

    } else {

        if (encontrada instanceof Cliente) {
            abrirCliente(idUsuario);
          
        } else if (encontrada instanceof Trabajador) {
            abrirTrabajador(idUsuario);

        } else if (encontrada instanceof Administrador) {
            abrirAdministrador(idUsuario);
        }
        
    }
}

    private void abrirCliente(int idUsuario) throws IOException {

    FXMLLoader loader = new FXMLLoader(
            getClass().getResource("Cliente.fxml")
    );

    Parent root = loader.load();

    ClienteController controller = loader.getController();
    controller.setIdUsuario(idUsuario);

    Stage stage = (Stage) validarButton.getScene().getWindow();

    stage.setScene(new Scene(root));
    stage.show();
}
   
    private void abrirTrabajador(int idUsuario) throws IOException {

    FXMLLoader loader = new FXMLLoader(
            getClass().getResource("Trabajador.fxml")
    );

    Parent root = loader.load();

    TrabajadorController controller = loader.getController();
    controller.setIdUsuario(idUsuario);

    Stage stage = (Stage) validarButton.getScene().getWindow();

    stage.setScene(new Scene(root));
    stage.show();
}
    
    private void abrirAdministrador(int idUsuario) throws IOException {

    FXMLLoader loader = new FXMLLoader(
            getClass().getResource("Administrador.fxml")
    );

    Parent root = loader.load();

    AdministradorController controller = loader.getController();
    controller.setIdUsuario(idUsuario);

    Stage stage = (Stage) validarButton.getScene().getWindow();

    stage.setScene(new Scene(root));
    stage.show();
}


}
