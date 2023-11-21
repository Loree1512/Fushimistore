
package FushimiStoreModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kate
 */

public class RegistroUsuario {

    public RegistroUsuario() {
    }
    
  public static void mostrarUsuario() throws Exception {
        String sql = "SELECT * FROM USUARIO";
        try (Connection connection = ConexionBD.obtenerConexion();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String usuario = resultSet.getString("USUARIO");
                String contraseña = resultSet.getString("CONTRASENA");
                
                System.out.println("ID: " + id + ", USUARIO: " + usuario + ", CONTRASEÑA: " + contraseña);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de productos: " + e.getMessage());
        }
    }
    
}
