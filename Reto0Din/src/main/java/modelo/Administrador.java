/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author songo
 */
public class Administrador extends Persona {

    private int codigo;

    public Administrador(int id, String nombre, String email, String contrasena, int codigo) {
        super(id, nombre, email, contrasena);
        this.codigo = codigo;
    }

    public Administrador() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    @Override
    public void visualizar() {
         System.out.println("id: "+this.getId()+" nombre: "+this.getNombre()+" email: "+this.getEmail()+" codigo: "+this.getCodigo());
    }
    
}
