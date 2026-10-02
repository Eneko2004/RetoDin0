/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.reto0din;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import modelo.Cliente;
import modelo.Persona;
import modelo.Trabajador;

/**
 * FXML Controller class
 *
 * @author songo
 */
public class TrabajadorController implements Initializable {

    private int idUsuario;
    ArrayList<Persona> personas = Datos.getPersonas();
    
    private void cargarDatos() {

        for (Persona p : personas) {

                if (p.getId() == idUsuario && p instanceof Trabajador) {

                break;
            }
        }
    }
    
     public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
        cargarDatos();
    }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
