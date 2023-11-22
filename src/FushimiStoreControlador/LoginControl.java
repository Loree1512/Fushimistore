
package FushimiStoreControlador;

import FushimiStoreModelo.ConexionBD;
import FushimiStoreVista.VistaFushimiStore;
import FushimiStoreVista.PrincipalFushimiStore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LoginControl {

    private final ConexionBD bd;
    private JFrame frame;
    private final VistaFushimiStore vistaLogin;
    private PrincipalFushimiStore vistaPrincipal;

    public LoginControl(ConexionBD bd, VistaFushimiStore vista) {
        this.bd = bd;
        this.vistaLogin = vista;
    }

    public void handleLogin(String usuario, String vpsw) {

        try (Connection connection = ConexionBD.obtenerConexion()) {
            String sql = "SELECT CONTRASENA FROM USUARIO WHERE NOMBRE_USUARIO = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, usuario);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                String dbpsw = resultSet.getString("CONTRASENA");
                if (vpsw.equals(dbpsw)){
                     frame.dispose(); 
                     PrincipalFushimiStore vp = new PrincipalFushimiStore();
                     vp.setVisible(true);
                     

                } else {
                    JOptionPane.showMessageDialog(null, "Error en el inicio de sesión.", "Confirmación Login", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al iniciar sesión: " + e.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(LoginControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*    public void handleLogin(String usuario, String vpsw) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}