package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ContactoTest {

    @Test
    public void testCrearContactoYGetters() {
        Contacto contacto = new Contacto("Juan", "310628528");

        assertEquals("Juan", contacto.getNombre());
        assertEquals("310628528", contacto.getTelefono());
    }
}