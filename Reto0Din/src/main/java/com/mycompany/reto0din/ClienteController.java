package com.mycompany.reto0din;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.*;

public class ClienteController {

    private int idUsuario;
    ArrayList<Persona> personas = Datos.getPersonas();

    @FXML
    private TextField telefonoField;
    @FXML
    private TextField apodoField;
    @FXML
    private TextField direccionField;
    @FXML
    private Button modificarButton;
    @FXML
    private Button cerrarButton;

    private void cargarDatos() {

        for (Persona p : personas) {

            if (p.getId() == idUsuario && p instanceof Cliente) {

                Cliente cliente = (Cliente) p;

                telefonoField.setText(String.valueOf(cliente.getTelefono()));
                apodoField.setText(cliente.getApodo());
                direccionField.setText(cliente.getDireccion());

                break;
            }
        }
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
        cargarDatos();
    }

    @FXML
    private void modificarDatos() throws IOException {
        for (Persona p : personas) {
            if (p.getId() == idUsuario) {
                if (p instanceof Cliente) {
                    Cliente c = (Cliente) p;
                    c.setApodo(apodoField.getText());
                    c.setTelefono(Integer.parseInt(telefonoField.getText()));
                    c.setDireccion(direccionField.getText());
                    Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                    alerta.setTitle("Datos modificados");
                    alerta.setHeaderText(null);
                    alerta.setContentText("Los datos se han modificado correctamente.");
                    alerta.showAndWait();
                    c.visualizar();
                }
            }
        }
    }

    @FXML
    private void cerrarSesion() throws IOException {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("iniciarSesion.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) modificarButton.getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

}
