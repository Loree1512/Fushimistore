
package FushimiStoreVista;

import FushimiStoreModelo.ConexionBD;
import FushimiStoreUtils.Utils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Kate
 */
public class InventarioProductoFushimiStore extends javax.swing.JFrame {
    
        ConexionBD con = new ConexionBD();
        Connection conect;
        DefaultTableModel modelo;
        Statement st;
        ResultSet rs;
        int idc;

    /**
     * Creates new form InventarioFushimiStore
     */
    public InventarioProductoFushimiStore() {
        initComponents();
        this.setLocationRelativeTo(null);
        Utils.cambiarFondoJFrame(this);
        consultar();
        
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabelBotonSalirPrincipal = new javax.swing.JButton();
        jLabelBotonVolverPrincipal = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelDatos = new javax.swing.JPanel();
        jLabelBuscador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldBarraBuscador = new javax.swing.JTextField();
        jCheckBoxNombre = new javax.swing.JCheckBox();
        jCheckBoxCategoria = new javax.swing.JCheckBox();
        jCheckBoxModelo = new javax.swing.JCheckBox();
        jLabelBuscador1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldBarraBuscador1 = new javax.swing.JTextField();
        jLabelBuscador2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldBarraBuscador2 = new javax.swing.JTextField();
        jLabelBuscador3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldBarraBuscador3 = new javax.swing.JTextField();
        jLabelBuscador4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldBarraBuscador4 = new javax.swing.JTextField();
        jLabelBuscador5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldBarraBuscador5 = new javax.swing.JTextField();
        jPanelBotones = new javax.swing.JPanel();
        jButtonAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

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

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(92, 24, 125));
        jLabel3.setText("Fushimi Store");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, 70));

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Inventario de productos ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 220, -1));

        jPanelDatos.setBackground(new java.awt.Color(233, 211, 255));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        jPanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBuscador.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabelBuscador.setForeground(new java.awt.Color(153, 0, 153));
        jLabelBuscador.setText("Nombre");
        jPanelDatos.add(jLabelBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 20));

        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 255), new java.awt.Color(255, 153, 255)));
        jPanelDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 20));

        jTextFieldBarraBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBarraBuscadorActionPerformed(evt);
            }
        });
        jPanelDatos.add(jTextFieldBarraBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 130, 20));

        jCheckBoxNombre.setText("Nombre");
        jPanelDatos.add(jCheckBoxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jCheckBoxCategoria.setText("Categoria");
        jPanelDatos.add(jCheckBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jCheckBoxModelo.setText("Modelo");
        jPanelDatos.add(jCheckBoxModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabelBuscador1.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabelBuscador1.setForeground(new java.awt.Color(153, 0, 153));
        jLabelBuscador1.setText("Categoria");
        jPanelDatos.add(jLabelBuscador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 20));

        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 255), new java.awt.Color(255, 153, 255)));
        jPanelDatos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 90, 20));

        jTextFieldBarraBuscador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBarraBuscador1ActionPerformed(evt);
            }
        });
        jPanelDatos.add(jTextFieldBarraBuscador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 130, 20));

        jLabelBuscador2.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabelBuscador2.setForeground(new java.awt.Color(153, 0, 153));
        jLabelBuscador2.setText("Modelo");
        jPanelDatos.add(jLabelBuscador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 20));

        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 255), new java.awt.Color(255, 153, 255)));
        jPanelDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 20));

        jTextFieldBarraBuscador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBarraBuscador2ActionPerformed(evt);
            }
        });
        jPanelDatos.add(jTextFieldBarraBuscador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 130, 20));

        jLabelBuscador3.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabelBuscador3.setForeground(new java.awt.Color(153, 0, 153));
        jLabelBuscador3.setText("Precio");
        jPanelDatos.add(jLabelBuscador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 20));

        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 255), new java.awt.Color(255, 153, 255)));
        jPanelDatos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 80, 20));

        jTextFieldBarraBuscador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBarraBuscador3ActionPerformed(evt);
            }
        });
        jPanelDatos.add(jTextFieldBarraBuscador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 130, 20));

        jLabelBuscador4.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabelBuscador4.setForeground(new java.awt.Color(153, 0, 153));
        jLabelBuscador4.setText("Cantidad");
        jPanelDatos.add(jLabelBuscador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 255), new java.awt.Color(255, 153, 255)));
        jPanelDatos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 20));

        jTextFieldBarraBuscador4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBarraBuscador4ActionPerformed(evt);
            }
        });
        jPanelDatos.add(jTextFieldBarraBuscador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 130, 20));

        jLabelBuscador5.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabelBuscador5.setForeground(new java.awt.Color(153, 0, 153));
        jLabelBuscador5.setText("Buscador");
        jPanelDatos.add(jLabelBuscador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, 20));

        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 255), new java.awt.Color(255, 153, 255)));
        jPanelDatos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 20));

        jTextFieldBarraBuscador5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBarraBuscador5ActionPerformed(evt);
            }
        });
        jPanelDatos.add(jTextFieldBarraBuscador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 360, 20));

        getContentPane().add(jPanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 480, 160));

        jPanelBotones.setBackground(new java.awt.Color(245, 255, 255));

        jButtonAgregar.setBackground(new java.awt.Color(219, 241, 241));
        jButtonAgregar.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(153, 0, 153));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonAgregar);

        jButton1.setBackground(new java.awt.Color(219, 241, 241));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("Modificar");
        jPanelBotones.add(jButton1);

        jButtonEliminar.setBackground(new java.awt.Color(219, 241, 241));
        jButtonEliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(153, 0, 153));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonEliminar);

        getContentPane().add(jPanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 290, -1));

        jPanelTabla.setBackground(new java.awt.Color(233, 211, 255));

        Tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Categoria", "Modelo", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setGridColor(new java.awt.Color(160, 203, 203));
        Tabla.setInheritsPopupMenu(true);
        Tabla.setSelectionBackground(new java.awt.Color(163, 218, 218));
        jScrollPane1.setViewportView(Tabla);

        jPanelTabla.add(jScrollPane1);

        getContentPane().add(jPanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FushimiStoreImg/fondo_blanco_corazon_morado.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
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

    private void jTextFieldBarraBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBarraBuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBarraBuscadorActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jTextFieldBarraBuscador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBarraBuscador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBarraBuscador1ActionPerformed

    private void jTextFieldBarraBuscador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBarraBuscador2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBarraBuscador2ActionPerformed

    private void jTextFieldBarraBuscador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBarraBuscador3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBarraBuscador3ActionPerformed

    private void jTextFieldBarraBuscador4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBarraBuscador4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBarraBuscador4ActionPerformed

    private void jTextFieldBarraBuscador5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBarraBuscador5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBarraBuscador5ActionPerformed

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
            java.util.logging.Logger.getLogger(InventarioProductoFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioProductoFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioProductoFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioProductoFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioProductoFushimiStore().setVisible(true);
            }
        });
    }
    
    void consultar(){
        String sql = "SELECT * FROM PRODUCTO";
        try 
        {
            conect = con.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            Object[] PRODUCTO = new Object[6];
            modelo = (DefaultTableModel) Tabla.getModel();
            while (rs.next()){
                PRODUCTO [0] = rs.getInt("ID");
                PRODUCTO [1] = rs.getString("NOMBRE_PRODUCTO");
                PRODUCTO [2] = rs.getString("CATEGORIA_PRODUCTO");
                PRODUCTO [3] = rs.getString("MODELO_PRODUCTO");
                PRODUCTO [4] = rs.getInt("PRECIO_PRODUCTO");
                PRODUCTO [5] = rs.getInt("CANTIDAD_PRODUCTO");
                
                modelo.addRow(PRODUCTO);
            }
            Tabla.setModel(modelo);
            
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JCheckBox jCheckBoxCategoria;
    private javax.swing.JCheckBox jCheckBoxModelo;
    private javax.swing.JCheckBox jCheckBoxNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLabelBotonSalirPrincipal;
    private javax.swing.JToggleButton jLabelBotonVolverPrincipal;
    private javax.swing.JLabel jLabelBuscador;
    private javax.swing.JLabel jLabelBuscador1;
    private javax.swing.JLabel jLabelBuscador2;
    private javax.swing.JLabel jLabelBuscador3;
    private javax.swing.JLabel jLabelBuscador4;
    private javax.swing.JLabel jLabelBuscador5;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldBarraBuscador;
    private javax.swing.JTextField jTextFieldBarraBuscador1;
    private javax.swing.JTextField jTextFieldBarraBuscador2;
    private javax.swing.JTextField jTextFieldBarraBuscador3;
    private javax.swing.JTextField jTextFieldBarraBuscador4;
    private javax.swing.JTextField jTextFieldBarraBuscador5;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
