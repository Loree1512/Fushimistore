
package FushimiStoreVista;

import FushimiStoreUtils.Utils;

/**
 *
 * @author Kate
 */
public class IdeaFushimiStore extends javax.swing.JFrame {

    /**
     * Creates new form IdeaFushimiStore
     */
    public IdeaFushimiStore() {
        initComponents();
        this.setLocationRelativeTo(null);
        Utils.cambiarFondoJFrame(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelBotonSalirPrincipal = new javax.swing.JButton();
        jLabelBotonVolverPrincipal = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(236, 255, 236));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(218, 246, 190), new java.awt.Color(218, 246, 190)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 360));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 150, 360));

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 190, 360));

        jLabel4.setBackground(new java.awt.Color(236, 255, 236));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 150, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("URL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 190, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 470, 390));

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

        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(112, 193, 193), new java.awt.Color(112, 193, 193)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 490, 410));

        jButtonAgregar.setBackground(new java.awt.Color(218, 246, 190));
        jButtonAgregar.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(0, 153, 0));
        jButtonAgregar.setText("Agregar");
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 100, 30));

        jButtonEliminar.setBackground(new java.awt.Color(218, 246, 190));
        jButtonEliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(0, 153, 0));
        jButtonEliminar.setText("Eliminar");
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 100, 30));

        jButtonModificar.setBackground(new java.awt.Color(218, 246, 190));
        jButtonModificar.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(0, 153, 0));
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 100, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Nuevas ideas!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 270, 40));

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Buscador");
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(204, 255, 204)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 440, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FushimiStoreImg/fondo_blanco_corazon_morado.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 51), new java.awt.Color(0, 255, 51)));
        jLabel1.setMaximumSize(new java.awt.Dimension(564, 660));
        jLabel1.setMinimumSize(new java.awt.Dimension(564, 660));
        jLabel1.setPreferredSize(new java.awt.Dimension(564, 660));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBotonSalirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelBotonSalirPrincipalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jLabelBotonSalirPrincipalActionPerformed

    private void jLabelBotonVolverPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelBotonVolverPrincipalActionPerformed
        InicioFushimiStore inicio = new InicioFushimiStore();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelBotonVolverPrincipalActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModificarActionPerformed

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
            java.util.logging.Logger.getLogger(IdeaFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IdeaFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IdeaFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IdeaFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IdeaFushimiStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jLabelBotonSalirPrincipal;
    private javax.swing.JToggleButton jLabelBotonVolverPrincipal;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
