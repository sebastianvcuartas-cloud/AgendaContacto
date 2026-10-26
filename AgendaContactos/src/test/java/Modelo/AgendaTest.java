/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgendaTest {

    private Agenda agenda;

    @BeforeEach
    public void Iniciar() {
        agenda = new Agenda();
    }

    @Test
    public void testAgregarYBuscarTelefono() {
        Contacto c = new Contacto("Mariana ", "3209821231");
        agenda.agregarContacto(c);

        String telefono = agenda.buscarTelefono("Mariana");
        assertEquals("3209821231", telefono);
    }

    @Test
    public void testBuscarTelefonoConEspaciosYMayusculas() {
        Contacto c = new Contacto("Carlos Ruiz", "3111111111");
        agenda.agregarContacto(c);

        String telefono = agenda.buscarTelefono("  carlos ruiz  ");
        assertEquals("3111111111", telefono);
    }

    @Test
    public void testBuscarTelefonoNoEncontrado() {
        String telefono = agenda.buscarTelefono("Nada");
        assertNull(telefono);
    }
}