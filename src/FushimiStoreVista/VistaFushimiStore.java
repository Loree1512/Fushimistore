
package FushimiStoreVista;
import static FushimiStoreModelo.ConexionBD.obtenerConexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import static oracle.security.pki.ldap.LdapSSLSocketFactory.WALLET_PASSWORD;



public class VistaFushimiStore extends javax.swing.JFrame {


    public VistaFushimiStore() {
        initComponents();
        //Centra la pestaña..
        this.setLocationRelativeTo(null);
    }
    
    public static Connection obtenerConexion(Connection conexionBD) throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexionBD = DriverManager.getConnection(JDBC_URL,WALLET_PATH,WALLET_PASSWORD);
        } catch ( ClassNotFoundException e) {
            System.out.println("Error conexion" + e);
        }
        return conexionBD;
    }

    /**
     *
     * @return 
    } 
     */
    @SuppressWarnings("override")
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("FushimiStoreImg/BunnyCatLogo.png"));
        return retValue;
    }    
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBotonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista_InicioUsuario");
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBotonSalir.setBackground(new java.awt.Color(193, 161, 224));
        jLabelBotonSalir.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabelBotonSalir.setForeground(new java.awt.Color(255, 255, 0));
        jLabelBotonSalir.setText("Salir");
        jLabelBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelBotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jLabelBotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 70, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(92, 24, 125));
        jLabel1.setText("Fushimi Store");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 120, -1));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FushimiStoreImg/BunnyCatLogo.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 430, 230));

        jLabelUsuario.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(92, 24, 125));
        jLabelUsuario.setText("Usuario: ");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        jLabelContraseña.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(92, 24, 125));
        jLabelContraseña.setText("Contraseña:");
        getContentPane().add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        jTextFieldUsuario.setBackground(new java.awt.Color(247, 239, 255));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 220, 30));

        jPasswordFieldContraseña.setBackground(new java.awt.Color(247, 239, 255));
        getContentPane().add(jPasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 220, 30));

        jButton1.setBackground(new java.awt.Color(248, 233, 248));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(92, 24, 125));
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 150, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FushimiStoreImg/fondo_blanco_corazon_morado.jpg"))); // NOI18N
        jLabelFondo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204)));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 549, 660));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelBotonSalirActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jLabelBotonSalirActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection obtenerConexion = obtenerConexion();
            
            PrincipalFushimiStore principal = new PrincipalFushimiStore();
            
            principal.setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(VistaFushimiStore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VistaFushimiStore().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jLabelBotonSalir;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    private static class SQLException extends Exception {

        public SQLException() {
        }
    }
}

