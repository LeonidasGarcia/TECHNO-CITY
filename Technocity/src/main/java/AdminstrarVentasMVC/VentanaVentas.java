package AdminstrarVentasMVC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Conector_Firebase.conexion;
import java.awt.HeadlessException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author LENOVO
 */
public class VentanaVentas extends javax.swing.JFrame {
    /**
     * Creates new form Ventana_Ventass
     */
    public VentanaVentas() {
        conexion.conectarFirebase();
        initComponents();
        this.setLocationRelativeTo(null);
        ProductosProvider.cargarTabla(jTableVentas);
        jTextFieldID.setEnabled(false);
        jTextFieldBuscar.getDocument().addDocumentListener(new BusquedaPredictiva(jTableVentas));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldProducto = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jTextFieldUnidadesVendidas = new javax.swing.JTextField();
        jButtonMenos = new javax.swing.JButton();
        jButtonMas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVentas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Producto Vendido:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Unidades Vendidas:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ID:");

        jTextFieldProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductoActionPerformed(evt);
            }
        });

        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("LIMPIAR");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Precio:");

        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Ingrese el producto a buscar:");

        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });

        jTextFieldUnidadesVendidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUnidadesVendidasActionPerformed(evt);
            }
        });

        jButtonMenos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonMenos.setText("-");
        jButtonMenos.setAlignmentY(-0.5F);
        jButtonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosActionPerformed(evt);
            }
        });

        jButtonMas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonMas.setText("+");
        jButtonMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMasMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonMasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonMasMouseReleased(evt);
            }
        });
        jButtonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasActionPerformed(evt);
            }
        });
        jButtonMas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonMasKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jTextFieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextFieldUnidadesVendidas, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jButtonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jTextFieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUnidadesVendidas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductoActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jTableVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVentasMouseClicked
        int seleccion = jTableVentas.getSelectedRow();
        jTextFieldID.setText(jTableVentas.getValueAt(seleccion, 0) + "");
        jTextFieldProducto.setText(jTableVentas.getValueAt(seleccion, 1) + "");
        String unidadesVendidas = jTableVentas.getValueAt(seleccion, 2).toString();
        jTextFieldUnidadesVendidas.setText(String.valueOf((int) Double.parseDouble(unidadesVendidas)));
        jTextFieldPrecio.setText(jTableVentas.getValueAt(seleccion, 3) + "");

        if (evt.getClickCount() == 2) {

        }
    }//GEN-LAST:event_jTableVentasMouseClicked

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jTextFieldUnidadesVendidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUnidadesVendidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUnidadesVendidasActionPerformed

    private void jButtonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenosActionPerformed
        restar();
    }//GEN-LAST:event_jButtonMenosActionPerformed

    private void jButtonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasActionPerformed
        sumar();
    }//GEN-LAST:event_jButtonMasActionPerformed

    private void jButtonMasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMasMousePressed
        
    }//GEN-LAST:event_jButtonMasMousePressed

    private void jButtonMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMasMouseClicked

    }//GEN-LAST:event_jButtonMasMouseClicked

    private void jButtonMasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMasMouseEntered
  
    }//GEN-LAST:event_jButtonMasMouseEntered

    private void jButtonMasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonMasKeyPressed

    }//GEN-LAST:event_jButtonMasKeyPressed

    private void jButtonMasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMasMouseReleased
        
    }//GEN-LAST:event_jButtonMasMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonMas;
    private javax.swing.JButton jButtonMenos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTableVentas;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldProducto;
    private javax.swing.JTextField jTextFieldUnidadesVendidas;
    // End of variables declaration//GEN-END:variables

    @SuppressWarnings("empty-statement")
    private void guardar() {
        int id = (int) (Math.random() * 100000);
        int UnidadesVendidas = Integer.parseInt(jTextFieldUnidadesVendidas.getText());
        double Precio = Double.parseDouble(jTextFieldPrecio.getText());
        try {
            Map<String, Object> datos = new HashMap<>();
            datos.put("Nombre", jTextFieldProducto.getText());
            datos.put("Unidades Vendidas", UnidadesVendidas);
            datos.put("Precio", Precio);
            ProductosProvider.guardarProducto("Producto Vendido", String.valueOf(id), datos);
            JOptionPane.showMessageDialog(null, "Guardado con exito");
            clearForm();
        } catch (HeadlessException e) {
            System.err.println("Error" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally {
            ProductosProvider.cargarTabla(jTableVentas);
        }
    }

    private void actualizar() {
        int UnidadesVendidas = Integer.parseInt(jTextFieldUnidadesVendidas.getText());
        String idDoc = jTextFieldID.getText();
        double Precio = Double.parseDouble(jTextFieldPrecio.getText());
        try {
            Map<String, Object> datos = new HashMap<>();
            datos.put("Nombre", jTextFieldProducto.getText());
            datos.put("Unidades Vendidas", UnidadesVendidas);
            datos.put("Precio", Precio);
            ProductosProvider.actualizarProducto("Producto Vendido", idDoc, datos);
            JOptionPane.showMessageDialog(null, "Actualizado con exito");
            clearForm();
        } catch (HeadlessException e) {
            System.err.println("Error" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        } finally {
            ProductosProvider.cargarTabla(jTableVentas);
        }
    }

    private void eliminar() {
        String idDoc = jTextFieldID.getText();
        try {
            ProductosProvider.eliminarProducto("Producto Vendido", idDoc);
            JOptionPane.showMessageDialog(null, "Eliminado con exito");
            clearForm();
        } catch (HeadlessException e) {
            System.err.println("Error" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        } finally {
            ProductosProvider.cargarTabla(jTableVentas);
        }
    }

    private void limpiar() {
        clearForm();
    }

    void clearForm() {
        jTextFieldProducto.setText("");
        jTextFieldUnidadesVendidas.setText("");
        jTextFieldPrecio.setText("");
        jTextFieldID.setText("");
    }
    //Busqueda

    public class BusquedaPredictiva implements DocumentListener {

        private JTable table;

        public BusquedaPredictiva(JTable table) {
            this.table = table;
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            actualizarBusqueda();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            actualizarBusqueda();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            actualizarBusqueda();
        }

        private void actualizarBusqueda() {
            String textoBusqueda = jTextFieldBuscar.getText().trim();
            ProductosProvider.buscarProducto(textoBusqueda, table);
        }
    }

    private void sumar() {
        try {
            int unidadesVendidas = Integer.parseInt(jTextFieldUnidadesVendidas.getText());
            unidadesVendidas++;
            jTextFieldUnidadesVendidas.setText(Integer.toString(unidadesVendidas));
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir unidades vendidas a entero: " + e.getMessage());
            // Manejar el error si el texto no es un número válido
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void restar() {
        try {
            int unidadesVendidas = Integer.parseInt(jTextFieldUnidadesVendidas.getText());
            unidadesVendidas--;
            jTextFieldUnidadesVendidas.setText(Integer.toString(unidadesVendidas));
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir unidades vendidas a entero: " + e.getMessage());
            // Manejar el error si el texto no es un número válido
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}