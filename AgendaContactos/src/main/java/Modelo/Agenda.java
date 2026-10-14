/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Agenda {
    private Contacto[] contactos;
    private int contador;
    
    public Agenda() {
        this.contactos = new Contacto[100];
        this.contador = 0;
}
    public void agregarContacto(Contacto contacto) {
        if (contador < contactos.length) {
            contactos[contador] = contacto;
            contador++;
        }
    }
    public String buscarTelefono(String Nombre) {
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(Nombre.trim())) {
                return contactos[i].getTelefono();
            }
        }
        return null;
    }
}
