
package FushimiStoreModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Loreto
 */
public class InventarioProductos {

    private static Object Tabla;
    DefaultTableModel modelo1;
    


    public InventarioProductos() {
    }
 /*   
    public static void mostrarProductos(DefaultTableModel modelo1) throws Exception {
        String sql = "SELECT * FROM PRODUCTO";
        try (Connection connection = ConexionBD.obtenerConexion();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String nombre = resultSet.getString("NOMBRE_PRODUCTO");
                String categoria = resultSet.getString("CATEGORÍA_PRODUCTO");
                String modelo = resultSet.getString("MODELO_PRODUCTO");
                int precio = resultSet.getInt("PRECIO_PRODUCTO");
                int cantidad = resultSet.getInt("CANTIDAD_PRODUCTO");
                Object[] PRODUCTO = new Object[6];
                modelo1 = (DefaultTableModel) Tabla.getModel();
                PRODUCTO [0] = id;
                PRODUCTO [1] = nombre;
                PRODUCTO [2] = categoria;
                PRODUCTO [3] = modelo;
                PRODUCTO [4] = precio;
                PRODUCTO [5] = cantidad;
                
                modelo1.addRow(PRODUCTO);
            }
            Tabla.setModel(modelo1);
            
        } catch (Exception e) {
                System.out.println("ID: " + id + ", NOMBRE: " + nombre + ", CATEGORÍA: " + categoria + ", MODELO: " + modelo + ", PRECIO: " + precio + ", CANTIDAD: " + cantidad);
            }
        
        catch (SQLException e) {
            System.err.println("Error al obtener la lista de productos: " + e.getMessage());
        }
    }/
*/
    public static void agregarProducto(String nombre,String categoria, String modelo,int precio1, int cantidad1 ) throws Exception {
        
        try (Connection connection = ConexionBD.obtenerConexion()) {
            String sql = "INSERT INTO PRODUCTO (ID, NOMBRE_PRODUCTO, CATEGORIA_PRODUCTO, MODELO_PRODUCTO, PRECIO_PRODUCTO, CANTIDAD_PRODUCTO) VALUES (PRODUCTO_SEQ.NEXTVAL, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, categoria);
            statement.setString(3, modelo);
            statement.setInt(4, precio1);
            statement.setInt(5, cantidad1);
            statement.executeUpdate();

            System.out.println("Producto añadido exitosamente.");
            
        } catch (SQLException e) {
            System.err.println("Error al agregar el producto: " + e.getMessage());
        }
    }
    
    public static void eliminarProducto() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del producto a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        try (Connection connection = ConexionBD.obtenerConexion()) {
            String sql = "DELETE FROM PRODUCTO WHERE ID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();

            System.out.println("Producto eliminado exitosamente.");
            
        } catch (SQLException e) {
            System.err.println("Error al eliminar el producto: " + e.getMessage());
        }
    }
}
