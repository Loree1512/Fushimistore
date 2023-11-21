/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FushimiStoreVista;

import FushimiStoreModelo.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Loreto
 */
public class test {
    
    public static void main (String [] args) throws Exception{
        mostrarEventos();
        
        
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
    
    public static void mostrarEventos() throws Exception {
        String sql = "SELECT * FROM EVENTO";
        try (Connection connection = ConexionBD.obtenerConexion();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String nombre = resultSet.getString("NOMBRE_EVENTO");
                String lugar = resultSet.getString("LUGAR_EVENTO");
                int telefono = resultSet.getInt("TELEFONO_EVENTO");
                int cuota = resultSet.getInt("CUOTA_EVENTO");
                Date fecha = resultSet.getDate("FECHA_EVENTO");
                System.out.println("ID: " + id + ", NOMBRE: " + nombre + ", LUGAR: " + lugar + ", TELEFONO: " + telefono + ", CUOTA: " + cuota + ", FECHA: " + fecha);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de eventos: " + e.getMessage());
        }
    }
}
