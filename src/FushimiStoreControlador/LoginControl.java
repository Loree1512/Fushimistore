/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FushimiStoreControlador;

import FushimiStoreModelo.ConexionBD;
import FushimiStoreVista.VistaFushimiStore;
import FushimiStoreVista.PrincipalFushimiStore;
import javax.swing.JOptionPane;

/**
 *
 * @author Kate
 */
public class LoginControl {
    
    private ConexionBD bd;
    private VistaFushimiStore vistaLogin;
    private PrincipalFushimiStore vistaPrincipal;

    public LoginControl(ConexionBD bd, VistaFushimiStore vista) {
        this.bd = bd;
        this.vistaLogin = vista;
    }

    public void handleLogin(String email, String password) {
        if (bd.validarCredenciales(email, password)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión correcto.", "Confirmación Login", 1);
            redirectLogin(email);
        } else {
            JOptionPane.showMessageDialog(null, "Error en el inicio de sesión.", "Confirmación Login", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void redirectLogin(String email) {
        vistaLogin.dispose(); // Cerramos la ventana de login
        this.vistaPrincipal = new VistaPrincipal(bd.obtenerBibliotecario(email));
        vistaPrincipal.setVisible(true); // Mostramos la ventana principal
    }
    
}
