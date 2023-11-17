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
public class InventarioProductos {

    public InventarioProductos() {
    }
    
    public static void mostrarProductos() throws Exception {
        String sql = "SELECT * FROM PRODUCTO";
        try (Connection connection = ConexionBD.obtenerConexion();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String nombre = resultSet.getString("NOMBRE");
                String categoria = resultSet.getString("CATEGORÍA");
                String modelo = resultSet.getString("MODELO");
                int precio = resultSet.getInt("PRECIO");
                int cantidad = resultSet.getInt("CANTIDAD");
                System.out.println("ID: " + id + ", NOMBRE: " + nombre + ", CATEGORÍA: " + categoria + ", MODELO: " + modelo + ", PRECIO: " + precio + ", CANTIDAD: " + cantidad);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de productos: " + e.getMessage());
        }
    }

    public static void agregarProducto() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Categoría del producto: ");
        String categoria = scanner.nextLine();
        System.out.print("Modelo del producto: ");
        String modelo = scanner.nextLine();
        System.out.print("Precio del producto: ");
        String precio = scanner.nextLine();
        System.out.print("Cantidad de productos: ");
        String cantidad = scanner.nextLine();

        try (Connection connection = ConexionBD.obtenerConexion()) {
            String sql = "INSERT INTO PRODUCTO (ID, NOMBRE, CATEGORÍA, MODELO, PRECIO, CANTIDAD) VALUES (LIBRO_SEQ.NEXTVAL, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, categoria);
            statement.setString(3, modelo);
            statement.setString(4, precio);
            statement.setString(4, cantidad);
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
