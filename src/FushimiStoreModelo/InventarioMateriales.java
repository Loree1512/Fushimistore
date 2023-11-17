/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FushimiStoreModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Loreto
 */
public class InventarioMateriales {

    public InventarioMateriales() {
    }
    
    public static void mostrarMateriales() throws Exception {
        String sql = "SELECT * FROM MATERIAL";
        try (Connection connection = ConexionBD.obtenerConexion();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String nombre = resultSet.getString("NOMBRE");
                String categoria = resultSet.getString("CATEGORÍA");
                int precio = resultSet.getInt("PRECIO");
                int cantidad = resultSet.getInt("CANTIDAD");
                System.out.println("ID: " + id + ", NOMBRE: " + nombre + ", CATEGORÍA: " + categoria + ", PRECIO: " + precio + ", CANTIDAD: " + cantidad);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de materiales: " + e.getMessage());
        }
    }

    public static void agregarMaterial() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del material: ");
        String nombre = scanner.nextLine();
        System.out.print("Categoría del material: ");
        String categoria = scanner.nextLine();
        System.out.print("Precio del material: ");
        String precio = scanner.nextLine();
        System.out.print("Cantidad de material: ");
        String cantidad = scanner.nextLine();

        try (Connection connection = ConexionBD.obtenerConexion()) {
            String sql = "INSERT INTO MATERIAL (ID, NOMBRE, CATEGORÍA, PRECIO, CANTIDAD) VALUES (LIBRO_SEQ.NEXTVAL, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, categoria);
            statement.setString(4, precio);
            statement.setString(4, cantidad);
            statement.executeUpdate();

            System.out.println("Material añadido exitosamente.");
            
        } catch (SQLException e) {
            System.err.println("Error al agregar el material: " + e.getMessage());
        }
    }
    
    public static void eliminarMaterial() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID del material a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        try (Connection connection = ConexionBD.obtenerConexion()) {
            String sql = "DELETE FROM MATERIAL WHERE ID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();

            System.out.println("Material eliminado exitosamente.");
            
        } catch (SQLException e) {
            System.err.println("Error al eliminar el material: " + e.getMessage());
        }
    }
    
    

    
}
