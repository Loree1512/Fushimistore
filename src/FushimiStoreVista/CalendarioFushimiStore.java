
package FushimiStoreVista;

import FushimiStoreUtils.Utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class CalendarioFushimiStore extends javax.swing.JFrame {
    String[] strNombre = new String[10];
    String[] strTelefono = new String[10];
    String[] strDireccion = new String[10];
    int RegistroTotal = -1;
    int RegistroActual = -1;

    /**
     * Creates new form CalendarioFushimiStore
     */
    public CalendarioFushimiStore() {
        initComponents();
        this.setLocationRelativeTo(null);
        Utils.cambiarFondoJFrame(this);
    }
    
    public void LimpiarTxt()
    {
        jNombreEvento.setText("");
        jTelefonoEvento.setText("");
        jDireccionEvento.setText("");
    }

    public void txtEditable(boolean bool)
    {
        jNombreEvento.setEditable(bool);
        jTelefonoEvento.setEditable(bool);
        jDireccionEvento.setEditable(bool);
    }
    
    public void MostrarRegistros(int Registro)
    {
        jNombreEvento.setText(strNombre[Registro]);
        jTelefonoEvento.setText(strTelefono[Registro]);
        jDireccionEvento.setText(strDireccion[Registro]);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jNombreEvento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDireccionEvento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTelefonoEvento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPrecioPuesto = new javax.swing.JTextField();
        jBotonGuardar = new javax.swing.JButton();
        jBotonEliminar = new javax.swing.JButton();
        jLabelBotonSalirPrincipal = new javax.swing.JButton();
        jLabelBotonVolverPrincipal = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Nombre del evento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, -1));

        jNombreEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreEventoActionPerformed(evt);
            }
        });
        getContentPane().add(jNombreEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 82, 120, 30));

        jLabel7.setText("Dirección:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 30));
        getContentPane().add(jDireccionEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 350, 30));

        jLabel8.setText("Teléfono:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jTelefonoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefonoEventoActionPerformed(evt);
            }
        });
        getContentPane().add(jTelefonoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 82, 130, 30));

        jLabel3.setText("Precio puesto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));
        getContentPane().add(jPrecioPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 110, 30));

        jBotonGuardar.setBackground(new java.awt.Color(255, 153, 204));
        jBotonGuardar.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jBotonGuardar.setForeground(new java.awt.Color(153, 0, 102));
        jBotonGuardar.setText("Guardar");
        jBotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 30));

        jBotonEliminar.setBackground(new java.awt.Color(255, 153, 204));
        jBotonEliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jBotonEliminar.setForeground(new java.awt.Color(153, 0, 102));
        jBotonEliminar.setText("Eliminar");
        jBotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jBotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 90, 30));

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 470, 470, 120));

        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(185, 231, 185), new java.awt.Color(185, 231, 185)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 490, 140));

        jLabel4.setText("Fecha evento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, 30));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 120, 30));

        jCalendar1.setBackground(new java.awt.Color(249, 196, 222));
        jCalendar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(243, 103, 173), new java.awt.Color(243, 103, 173)));
        jCalendar1.setDecorationBackgroundColor(new java.awt.Color(251, 186, 227));
        jCalendar1.setDecorationBordersVisible(true);
        jCalendar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCalendar1.setWeekdayForeground(new java.awt.Color(123, 123, 211));
        getContentPane().add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 440, 190));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("EVENTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FushimiStoreImg/fondo_blanco_corazon_morado.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(564, 660));
        jLabel1.setMinimumSize(new java.awt.Dimension(564, 660));
        jLabel1.setPreferredSize(new java.awt.Dimension(564, 660));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void jNombreEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreEventoActionPerformed

    private void jTelefonoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelefonoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTelefonoEventoActionPerformed

    private void jBotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonGuardarActionPerformed
        //jCalendar para la fecha
        String fecha;
        java.util.Date date = new java.util.Date(); //Instanciamos porque necesitaremos de la fecha
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        
        //Posiciono en la variable
        fecha = f.format(jDateChooser1.getDate());
        
        System.out.println("Mostrando la fecha: " + fecha);
        
        //Procedimiento almacenado
        
        
        
    }//GEN-LAST:event_jBotonGuardarActionPerformed

    private void jBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBotonEliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String ls_fecha = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1));
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date fecha;
        try {
            fecha = (java.util.Date) s.parse(ls_fecha);
            jDateChooser1.setDate(fecha);
            
        } catch (ParseException e) {
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(CalendarioFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarioFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarioFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarioFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarioFushimiStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonEliminar;
    private javax.swing.JButton jBotonGuardar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JTextField jDireccionEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jLabelBotonSalirPrincipal;
    private javax.swing.JToggleButton jLabelBotonVolverPrincipal;
    private javax.swing.JTextField jNombreEvento;
    private javax.swing.JTextField jPrecioPuesto;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTelefonoEvento;
    // End of variables declaration//GEN-END:variables
}
