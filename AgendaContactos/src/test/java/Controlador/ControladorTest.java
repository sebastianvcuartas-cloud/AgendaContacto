/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Agenda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControladorTest {

    private ControladorAgenda controlador;

    @BeforeEach
    public void Iniciar() {
        controlador = new ControladorAgenda();
    }

    @Test
    public void testAgregarYBuscarContacto() {
       
        controlador.agregarContacto("Alberto", "310628528");

       
        String telefonoEncontrado = controlador.buscarContacto("Alberto");

       
        assertNotNull(telefonoEncontrado);
        assertEquals("310628528", telefonoEncontrado);
    }

    @Test
    public void testBuscarContactoNoExistente() {
        
        String resultado = controlador.buscarContacto("Nada");

       
        assertNull(resultado); 
    }
}