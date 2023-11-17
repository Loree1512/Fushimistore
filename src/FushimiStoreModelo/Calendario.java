/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FushimiStoreModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Loreto
 */
public class Calendario {

    public Calendario() {
    }
    
    public static void mostrarEventos() throws Exception {
        String sql = "SELECT * FROM EVENTO";
        try (Connection connection = ConexionBD.obtenerConexion();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String nombre = resultSet.getString("NOMBRE");
                String lugar = resultSet.getString("LUGAR");
                int cuota = resultSet.getInt("CUOTA");
                Date fecha = resultSet.getDate("FECHA");
                System.out.println("ID: " + id + ", NOMBRE: " + nombre + ", LUGAR: " + lugar + ", CUOTA: " + cuota + ", FECHA: " + fecha);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de eventos: " + e.getMessage());
        }
    }
    
    public static void agregarLibro() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del evento : ");
        String nombre = scanner.nextLine();
        System.out.print("Lugar del evento: ");
        String lugar = scanner.nextLine();
        System.out.print("Cuota a pagar: ");
        String cuota = scanner.nextLine();
        System.out.print("Fecha de evento (formato YYYY-MM-DD): ");
        String fecha = scanner.nextLine();
        

        try (Connection connection = ConexionBD.obtenerConexion()) {
            String sql = "INSERT INTO EVENTO (ID, NOMBRE, LUGAR, CUOTA, FECHA_PUBLICACION) VALUES (LIBRO_SEQ.NEXTVAL, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'))";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, lugar);
            statement.setString(4, cuota);
            statement.setString(3, fecha);
            statement.executeUpdate();

            System.out.println("Evento añadido exitosamente.");
            
        } catch (SQLException e) {
            System.err.println("Error al agregar el evento: " + e.getMessage());
        }
    }
}
