
package FushimiStoreVista;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Kate
 */
public class InventarioFushimiStore extends javax.swing.JFrame {

    /**
     * Creates new form InventarioFushimiStore
     */
    public InventarioFushimiStore() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("FushimiStoreImg/BunnyCatLogo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBotonSalirPrincipal = new javax.swing.JButton();
        jLabelBotonVolverPrincipal = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(549, 660));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(549, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBotonSalirPrincipal.setBackground(new java.awt.Color(193, 161, 224));
        jLabelBotonSalirPrincipal.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabelBotonSalirPrincipal.setForeground(new java.awt.Color(255, 255, 0));
        jLabelBotonSalirPrincipal.setText("Salir");
        jLabelBotonSalirPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelBotonSalirPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jLabelBotonSalirPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 70, -1));

        jLabelBotonVolverPrincipal.setBackground(new java.awt.Color(193, 161, 224));
        jLabelBotonVolverPrincipal.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabelBotonVolverPrincipal.setForeground(new java.awt.Color(255, 255, 0));
        jLabelBotonVolverPrincipal.setText("Volver");
        jLabelBotonVolverPrincipal.setMaximumSize(new java.awt.Dimension(72, 28));
        jLabelBotonVolverPrincipal.setMinimumSize(new java.awt.Dimension(72, 28));
        jLabelBotonVolverPrincipal.setPreferredSize(new java.awt.Dimension(72, 28));
        jLabelBotonVolverPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelBotonVolverPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jLabelBotonVolverPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FushimiStoreImg/fondo_blanco_corazon_morado.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBotonSalirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelBotonSalirPrincipalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jLabelBotonSalirPrincipalActionPerformed

    private void jLabelBotonVolverPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelBotonVolverPrincipalActionPerformed
        PrincipalFushimiStore principal = new PrincipalFushimiStore();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelBotonVolverPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(InventarioFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioFushimiStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jLabelBotonSalirPrincipal;
    private javax.swing.JToggleButton jLabelBotonVolverPrincipal;
    // End of variables declaration//GEN-END:variables
}
