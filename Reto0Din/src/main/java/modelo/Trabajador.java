/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author songo
 */
public class Trabajador extends Persona {

    private double salario;

    public Trabajador(int id, String nombre, String email, String contrasena,double salario) {
        super(id, nombre, email, contrasena);
        this.salario = salario;
    }

    public Trabajador() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    @Override
    public void visualizar() {
        System.out.println("id: "+this.getId()+" nombre: "+this.getNombre()+" email: "+this.getEmail()+" contraseña: "+this.getContrasena()+" salario: "+this.getSalario());
    }
    
}
