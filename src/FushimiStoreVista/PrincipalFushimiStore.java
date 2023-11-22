

package FushimiStoreVista;

import FushimiStoreUtils.Utils;


/**
 *
 * @author Kate
 */
public class PrincipalFushimiStore extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalFushimiStore
     */
    public PrincipalFushimiStore() {
        initComponents();
        this.setLocationRelativeTo(null);
        Utils.cambiarFondoJFrame(this);
        
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuInventario = new javax.swing.JPopupMenu();
        jMenuInventarioProducto = new javax.swing.JMenuItem();
        jMenuInventarioMaretial = new javax.swing.JMenuItem();
        jLabelBotonSalirPrincipal = new javax.swing.JButton();
        jButtonInventario1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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

        jPopupMenuInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204)));
        jPopupMenuInventario.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jPopupMenuInventarioPopupMenuWillBecomeVisible(evt);
            }
        });
        jPopupMenuInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPopupMenuInventarioMouseClicked(evt);
            }
        });

        jMenuInventarioProducto.setText("Inventario de productos");
        jMenuInventarioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInventarioProductoActionPerformed(evt);
            }
        });
        jPopupMenuInventario.add(jMenuInventarioProducto);

        jMenuInventarioMaretial.setText("Inventario de materiales");
        jMenuInventarioMaretial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInventarioMaretialActionPerformed(evt);
            }
        });
        jPopupMenuInventario.add(jMenuInventarioMaretial);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(549, 660));
        setUndecorated(true);
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

        jButtonInventario1.setBackground(new java.awt.Color(164, 109, 164));
        jButtonInventario1.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButtonInventario1.setForeground(new java.awt.Color(153, 255, 204));
        jButtonInventario1.setText("INVENTARIO");
        jButtonInventario1.setComponentPopupMenu(jPopupMenuInventario);
        jButtonInventario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInventario1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInventario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 160, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 153, 255));
        jLabel16.setText("Click derecho");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 140, -1));

        jLabel4.setBackground(new java.awt.Color(225, 214, 235));
        jLabel4.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jLabel4.setText("productos, además de ingresar y eliminar elementos.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 290, 30));

        jLabel5.setBackground(new java.awt.Color(225, 214, 235));
        jLabel5.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jLabel5.setText("En inventario tendrás la opción de ver todos tus ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 320, 50));

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FushimiStoreImg/fondo_blanco_corazon_morado.jpg"))); // NOI18N
        jLabel17.setMaximumSize(new java.awt.Dimension(564, 660));
        jLabel17.setMinimumSize(new java.awt.Dimension(564, 660));
        jLabel17.setPreferredSize(new java.awt.Dimension(564, 660));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
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

    private void jPopupMenuInventarioPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jPopupMenuInventarioPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jPopupMenuInventarioPopupMenuWillBecomeVisible

    private void jPopupMenuInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenuInventarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPopupMenuInventarioMouseClicked

    private void jButtonInventario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInventario1ActionPerformed
        // TODO add your handling code here: InventarioMaterialFushimiStore
    }//GEN-LAST:event_jButtonInventario1ActionPerformed

    private void jMenuInventarioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInventarioProductoActionPerformed
        InventarioProductoFushimiStore inventarioProducto = new InventarioProductoFushimiStore();
        inventarioProducto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuInventarioProductoActionPerformed

    private void jMenuInventarioMaretialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInventarioMaretialActionPerformed
        InventarioMaterialFushimiStore inventarioMaterial = new InventarioMaterialFushimiStore();
        inventarioMaterial.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuInventarioMaretialActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalendario;
    private javax.swing.JButton jButtonIdeas;
    private javax.swing.JButton jButtonInventario1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLabelBotonSalirPrincipal;
    private javax.swing.JMenuItem jMenuInventarioMaretial;
    private javax.swing.JMenuItem jMenuInventarioProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenuInventario;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        @Override
        public void run() {
            new PrincipalFushimiStore().setVisible(true);
        }
    }
    }
