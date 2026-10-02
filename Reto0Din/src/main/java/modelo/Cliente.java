/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author songo
 */
public class Cliente extends Persona {

    private int telefono;
    private String apodo;
    private String direccion;

    public Cliente(int id, String nombre, String email, String contrasena, int telefono, String apodo, String direccion) {
        super(id, nombre, email, contrasena);
        this.telefono = telefono;
        this.apodo = apodo;
        this.direccion = direccion;
    }

    public Cliente() {
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    @Override
    public void visualizar() {
        System.out.println("id: "+this.getId()+" nombre: "+this.getNombre()+" email: "+this.getEmail()+" contraseña: "+this.getContrasena()+" telefono: "+this.getTelefono()+" apodo: "+this.getApodo()+" direccion: "+this.getDireccion());
    }
    
}
