
package FushimiStoreVista;

import FushimiStoreUtils.Utils;

/**
 *
 * @author Kate
 */
public class InicioFushimiStore extends javax.swing.JFrame {

    /**
     * Creates new form InicioFushimiStore
     */
    public InicioFushimiStore() {
        initComponents();
        this.setLocationRelativeTo(null);
        Utils.cambiarFondoJFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonInventario1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButtonInventario2 = new javax.swing.JButton();
        jLabelBotonSalirPrincipal = new javax.swing.JButton();
        jButtonIdeas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonCalendario = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonVentas = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Producto:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 70, 30));

        jLabel5.setBackground(new java.awt.Color(225, 214, 235));
        jLabel5.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jLabel5.setText("En inventario tendrás la opción de ver todos tus productos, además de ingresar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 450, 30));

        jLabel4.setBackground(new java.awt.Color(225, 214, 235));
        jLabel4.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jLabel4.setText(" y eliminar elementos.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 450, 30));

        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 470, 50));

        jButtonInventario1.setBackground(new java.awt.Color(164, 109, 164));
        jButtonInventario1.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButtonInventario1.setForeground(new java.awt.Color(153, 255, 204));
        jButtonInventario1.setText("INVENTARIO");
        jButtonInventario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInventario1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInventario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 160, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Materiales:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 70, 30));

        jButtonInventario2.setBackground(new java.awt.Color(164, 109, 164));
        jButtonInventario2.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButtonInventario2.setForeground(new java.awt.Color(153, 255, 204));
        jButtonInventario2.setText("INVENTARIO");
        jButtonInventario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInventario2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInventario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 160, 30));

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

        jButtonIdeas.setBackground(new java.awt.Color(164, 109, 164));
        jButtonIdeas.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButtonIdeas.setForeground(new java.awt.Color(153, 255, 204));
        jButtonIdeas.setText("NUEVAS IDEAS");
        jButtonIdeas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIdeasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIdeas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 160, 50));

        jLabel7.setBackground(new java.awt.Color(225, 214, 235));
        jLabel7.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jLabel7.setText("guardarás todas las inspiraciones para productos nuevos.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 310, 30));

        jLabel8.setBackground(new java.awt.Color(225, 214, 235));
        jLabel8.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jLabel8.setText("\"Nuevas ideas\" es tu biblioteca de creación, donde ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 30));

        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 320, 50));

        jButtonCalendario.setBackground(new java.awt.Color(164, 109, 164));
        jButtonCalendario.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButtonCalendario.setForeground(new java.awt.Color(153, 255, 204));
        jButtonCalendario.setText("CALENDARIO");
        jButtonCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalendarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 160, 50));

        jLabel10.setBackground(new java.awt.Color(225, 214, 235));
        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jLabel10.setText("este calendario para apuntar los eventos importantes.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 310, 30));

        jLabel11.setBackground(new java.awt.Color(225, 214, 235));
        jLabel11.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jLabel11.setText("Siempre es necesario mantener un orden, para ello esta");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, 30));

        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204)));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 320, 50));

        jButtonVentas.setBackground(new java.awt.Color(164, 109, 164));
        jButtonVentas.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButtonVentas.setForeground(new java.awt.Color(153, 255, 204));
        jButtonVentas.setText("VENTAS");
        jButtonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 160, 50));

        jLabel13.setBackground(new java.awt.Color(225, 214, 235));
        jLabel13.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jLabel13.setText("negocio, además de otra funciones útiles.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 310, 30));

        jLabel14.setBackground(new java.awt.Color(225, 214, 235));
        jLabel14.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jLabel14.setText("Aquí podrá tener un seguimiento de las ganancias de su");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, 30));

        jLabel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204)));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 320, 50));

        jPanel1.setBackground(new java.awt.Color(194, 246, 238));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(227, 168, 227), new java.awt.Color(227, 168, 227), new java.awt.Color(227, 168, 227), new java.awt.Color(227, 168, 227)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("¡Esta herramienta te apoyara en todo lo que necesites de manera fácil e intuitiva!.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Bienvenida/o a tu organizador de tienda Fushimi Store.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 480, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(92, 24, 125));
        jLabel1.setText("Fushimi Store");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FushimiStoreImg/fondo_blanco_corazon_morado.jpg"))); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255)));
        jLabel17.setMaximumSize(new java.awt.Dimension(564, 660));
        jLabel17.setMinimumSize(new java.awt.Dimension(564, 660));
        jLabel17.setPreferredSize(new java.awt.Dimension(564, 660));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBotonSalirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelBotonSalirPrincipalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jLabelBotonSalirPrincipalActionPerformed

    private void jButtonIdeasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIdeasActionPerformed
        IdeaFushimiStore idea = new IdeaFushimiStore();
        idea.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonIdeasActionPerformed

    private void jButtonCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalendarioActionPerformed
        CalendarioFushimiStore calendario = new CalendarioFushimiStore();
        calendario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCalendarioActionPerformed

    private void jButtonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentasActionPerformed
        VentaFushimiStore venta = new VentaFushimiStore();
        venta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVentasActionPerformed

    private void jButtonInventario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInventario1ActionPerformed
        InventarioProductoFushimiStore producto = new InventarioProductoFushimiStore();
        producto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonInventario1ActionPerformed

    private void jButtonInventario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInventario2ActionPerformed
        InventarioMaterialFushimiStore material = new InventarioMaterialFushimiStore();
        material.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonInventario2ActionPerformed

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
            java.util.logging.Logger.getLogger(InicioFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioFushimiStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalendario;
    private javax.swing.JButton jButtonIdeas;
    private javax.swing.JButton jButtonInventario1;
    private javax.swing.JButton jButtonInventario2;
    private javax.swing.JButton jButtonVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLabelBotonSalirPrincipal;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
