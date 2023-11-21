
package FushimiStoreModelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.nio.file.Paths;
import java.util.Properties;
import java.sql.SQLException;
/**
 *
 
@author Loreto
*/

public class ConexionBD {
    private static final String WALLET_PATH = "C:\\Users\\gatit\\OneDrive\\Desktop\\Wallet_FushimiStore";
    private static final String WALLET_PASSWORD = "FushimiStore1";
    private static final String JDBC_URL = "jdbc:oracle:thin:@fushimistore_high";

    public static Connection obtenerConexion() {
        Connection conexionBD = null;
        try {

        // Configuración del wallet
        String trustStorePath = Paths.get(WALLET_PATH, "truststore.jks").toString();
        String keyStorePath = Paths.get(WALLET_PATH, "keystore.jks").toString();

        System.setProperty("oracle.net.tns_admin", WALLET_PATH);
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", WALLET_PASSWORD);
        System.setProperty("javax.net.ssl.keyStore", keyStorePath);
        System.setProperty("javax.net.ssl.keyStorePassword", WALLET_PASSWORD);

        Properties properties = new Properties();
        properties.put("user", "admin");
        properties.put("password", WALLET_PASSWORD);

        conexionBD = DriverManager.getConnection(JDBC_URL, properties);

        } catch (SQLException e){ 
             System.out.println(e);
        }
        return conexionBD;
    }

    public static void cerrarConexion (Connection conexionBD) {
        if (conexionBD != null){
            try {
                conexionBD.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}