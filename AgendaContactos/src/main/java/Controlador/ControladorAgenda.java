/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Agenda;
import Modelo.Contacto;
/**
 *
 * @author USUARIO
 */
public class ControladorAgenda {
    private Agenda agenda;

    public ControladorAgenda() {
       this.agenda = new Agenda();
    }
    
    public void agregarContacto(String Nombre, String Telefono) {
        Contacto nuevo = new Contacto(Nombre, Telefono);
        agenda.agregarContacto(nuevo);
    }
    public String buscarContacto(String Nombre) {
        return agenda.buscarTelefono(Nombre);
    }
}
