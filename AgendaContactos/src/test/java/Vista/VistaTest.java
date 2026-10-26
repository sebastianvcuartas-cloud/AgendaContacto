/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author USUARIO
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VistaTest {

    private VistaAgenda vista;

    @BeforeEach
    public void Iniciar() {
        vista = new VistaAgenda();
    }

    @Test
    public void testGuardarContactoDesdeVista() {
  
        vista.txtNombreGuardar.setText("Sofia");
        vista.txtTelefonoGuardar.setText("312345678");
        vista.jButton1.doClick();
        assertEquals("", vista.txtNombreGuardar.getText());
        assertEquals("", vista.txtTelefonoGuardar.getText());
    }

    @Test
    public void testBuscarContactoDesdeVista() {

        vista.txtNombreGuardar.setText("Carlos");
        vista.txtTelefonoGuardar.setText("3109998877");
        vista.jButton1.doClick();
        vista.txtNombreBuscar.setText("Carlos");
        vista.jButton2.doClick();


        assertEquals("Teléfono: 3109998877", vista.lblResultado.getText());
    }
}