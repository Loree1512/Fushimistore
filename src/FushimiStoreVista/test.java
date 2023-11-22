
package FushimiStoreVista;

import FushimiStoreModelo.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class test {
    
    public static void main (String [] args) throws Exception{
        mostrarProductos();
        
    }
    
    public static void mostrarProductos() throws Exception {
        String sql = "SELECT * FROM PRODUCTO";
        try {
             Connection connection = ConexionBD.obtenerConexion();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String nombre = resultSet.getString("NOMBRE_PRODUCTO");
                String categoria = resultSet.getString("CATEGORIA_PRODUCTO");
                String modelo = resultSet.getString("MODELO_PRODUCTO");
                int precio = resultSet.getInt("PRECIO_PRODUCTO");
                int cantidad = resultSet.getInt("CANTIDAD_PRODUCTO");
                
                System.out.println("ID: " + id + ", NOMBRE: " + nombre + ", CATEGORÍA: " + categoria + ", MODELO: " + modelo + ", PRECIO: " + precio + ", CANTIDAD: " + cantidad);
            }

        } catch (SQLException e) {
     
            System.err.println("Error al obtener la lista de productos: " + e.getMessage());
        }
    }
}
