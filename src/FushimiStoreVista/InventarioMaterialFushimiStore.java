/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FushimiStoreVista;

import FushimiStoreModelo.ConexionBD;
import FushimiStoreModelo.InventarioMateriales;
import FushimiStoreUtils.Utils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Kate
 */
public class InventarioMaterialFushimiStore extends javax.swing.JFrame {
    

    /**
     * Creates new form InventarioMaterialFushimiStore
     */
    private final InventarioMateriales invp ;
    ConexionBD con = new ConexionBD();
        Connection conect;
        DefaultTableModel modelo;
        Statement st;
        ResultSet rs;
        int idc;
    
    
    
    public InventarioMaterialFushimiStore() {
        initComponents();
        this.setLocationRelativeTo(null);
        Utils.cambiarFondoJFrame(this);
        invp = new InventarioMateriales();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabelBotonSalirPrincipal = new javax.swing.JButton();
        jLabelBotonVolverPrincipal = new javax.swing.JToggleButton();
        jPanelDatos = new javax.swing.JPanel();
        jLabelBuscador1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jCheckBoxNombre1 = new javax.swing.JCheckBox();
        jCheckBoxCategoria1 = new javax.swing.JCheckBox();
        jCheckBoxModelo1 = new javax.swing.JCheckBox();
        jLabelBuscador2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();
        jLabelBuscador4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabelBuscador5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabelBuscador6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldBarraBuscador6 = new javax.swing.JTextField();
        jPanelBotones = new javax.swing.JPanel();
        jButtonAgregar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonEliminar1 = new javax.swing.JButton();
        TablaM = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
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

        jPanelDatos.setBackground(new java.awt.Color(241, 196, 218));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        jPanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBuscador1.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabelBuscador1.setForeground(new java.awt.Color(153, 0, 153));
        jLabelBuscador1.setText("Nombre");
        jPanelDatos.add(jLabelBuscador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 20));

        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 255), new java.awt.Color(255, 153, 255)));
        jPanelDatos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 20));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanelDatos.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 130, 20));

        jCheckBoxNombre1.setText("Nombre");
        jPanelDatos.add(jCheckBoxNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jCheckBoxCategoria1.setText("Categoria");
        jPanelDatos.add(jCheckBoxCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jCheckBoxModelo1.setText("Modelo");
        jPanelDatos.add(jCheckBoxModelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jLabelBuscador2.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabelBuscador2.setForeground(new java.awt.Color(153, 0, 153));
        jLabelBuscador2.setText("Categoria");
        jPanelDatos.add(jLabelBuscador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 20));

        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 255), new java.awt.Color(255, 153, 255)));
        jPanelDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 90, 20));

        jTextFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaActionPerformed(evt);
            }
        });
        jPanelDatos.add(jTextFieldCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 130, 20));

        jLabelBuscador4.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabelBuscador4.setForeground(new java.awt.Color(153, 0, 153));
        jLabelBuscador4.setText("Precio");
        jPanelDatos.add(jLabelBuscador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 20));

        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 255), new java.awt.Color(255, 153, 255)));
        jPanelDatos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 80, 20));

        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });
        jPanelDatos.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 130, 20));

        jLabelBuscador5.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabelBuscador5.setForeground(new java.awt.Color(153, 0, 153));
        jLabelBuscador5.setText("Cantidad");
        jPanelDatos.add(jLabelBuscador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 20));

        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 255), new java.awt.Color(255, 153, 255)));
        jPanelDatos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 20));

        jTextFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadActionPerformed(evt);
            }
        });
        jPanelDatos.add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 130, 20));

        jLabelBuscador6.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabelBuscador6.setForeground(new java.awt.Color(153, 0, 153));
        jLabelBuscador6.setText("Buscador");
        jPanelDatos.add(jLabelBuscador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, 20));

        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 255), new java.awt.Color(255, 153, 255)));
        jPanelDatos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 20));

        jTextFieldBarraBuscador6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBarraBuscador6ActionPerformed(evt);
            }
        });
        jPanelDatos.add(jTextFieldBarraBuscador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 360, 20));

        getContentPane().add(jPanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 480, 160));

        jPanelBotones.setBackground(new java.awt.Color(245, 255, 255));

        jButtonAgregar1.setBackground(new java.awt.Color(241, 219, 232));
        jButtonAgregar1.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jButtonAgregar1.setForeground(new java.awt.Color(153, 0, 153));
        jButtonAgregar1.setText("Agregar");
        jButtonAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregar1ActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonAgregar1);

        jButton1.setBackground(new java.awt.Color(241, 219, 232));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("Modificar");
        jPanelBotones.add(jButton1);

        jButtonEliminar1.setBackground(new java.awt.Color(241, 219, 232));
        jButtonEliminar1.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jButtonEliminar1.setForeground(new java.awt.Color(153, 0, 153));
        jButtonEliminar1.setText("Eliminar");
        jButtonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminar1ActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonEliminar1);

        getContentPane().add(jPanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 290, -1));

        TablaM.setBackground(new java.awt.Color(241, 196, 218));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(249, 205, 227));
        jTable1.setSelectionBackground(new java.awt.Color(249, 205, 227));
        jScrollPane1.setViewportView(jTable1);

        TablaM.add(jScrollPane1);

        getContentPane().add(TablaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 460, 240));

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(92, 24, 125));
        jLabel3.setText("Fushimi Store");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, 70));

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Inventario de productos ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FushimiStoreImg/fondo_blanco_corazon_morado.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 204), new java.awt.Color(255, 102, 204)));
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

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoriaActionPerformed

    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jTextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadActionPerformed

    private void jTextFieldBarraBuscador6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBarraBuscador6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBarraBuscador6ActionPerformed

    private void jButtonAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregar1ActionPerformed
        try {
             Agregar();
                
            } catch (Exception ex) {
                Logger.getLogger(InventarioProductoFushimiStore.class.getName()).log(Level.SEVERE, null, ex);
            }
        consultar();
   
    }//GEN-LAST:event_jButtonAgregar1ActionPerformed

    private void jButtonEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminar1ActionPerformed

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
            java.util.logging.Logger.getLogger(InventarioMaterialFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioMaterialFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioMaterialFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioMaterialFushimiStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioMaterialFushimiStore().setVisible(true);
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
            Object[] MATERIAL = new Object[5];
            modelo = (DefaultTableModel) jTable1.getModel();
            while (rs.next()){
                MATERIAL [0] = rs.getInt("ID");
                MATERIAL [1] = rs.getString("NOMBRE_MATERIAL");
                MATERIAL [2] = rs.getString("CATEGORIA_PRODUCTO");
                MATERIAL [3] = rs.getInt("PRECIO_MATERIAL");
                MATERIAL [4] = rs.getInt("CANTIDAD_MATERIAL");
                
                modelo.addRow(MATERIAL);
            }
            jTable1.setModel(modelo);
            
        } catch (Exception e) {
        }
    }
    
    void Agregar() throws Exception {

        String nombre = jTextFieldNombre.getText();
        String categoria = jTextFieldCategoria.getText();      
        String precio = jTextFieldPrecio.getText();
        int precio1 = Integer.parseInt(precio);
        String cantidad = jTextFieldCantidad.getText();
        int cantidad1 = Integer.parseInt(cantidad);
        invp.agregarMaterial( nombre, categoria, precio1, cantidad1);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TablaM;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregar1;
    private javax.swing.JButton jButtonEliminar1;
    private javax.swing.JCheckBox jCheckBoxCategoria1;
    private javax.swing.JCheckBox jCheckBoxModelo1;
    private javax.swing.JCheckBox jCheckBoxNombre1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLabelBotonSalirPrincipal;
    private javax.swing.JToggleButton jLabelBotonVolverPrincipal;
    private javax.swing.JLabel jLabelBuscador1;
    private javax.swing.JLabel jLabelBuscador2;
    private javax.swing.JLabel jLabelBuscador4;
    private javax.swing.JLabel jLabelBuscador5;
    private javax.swing.JLabel jLabelBuscador6;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldBarraBuscador6;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
