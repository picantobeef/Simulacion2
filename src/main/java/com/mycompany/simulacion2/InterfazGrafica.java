/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simulacion2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *.
 * @author scont
 */
public class InterfazGrafica extends javax.swing.JFrame {

    private TableRowSorter trsfiltro;
    static DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"Nombre del Artículo", "Cantidad", "Precio", "Total"};
    static ArrayList<Articulo> arreglo; //

//    Set<Articulo> a = new HashSet<>();
    static ArrayList<Contador> arregloClient;

    public InterfazGrafica() {
        arreglo = new ArrayList<>();
        arregloClient = new ArrayList<>();

        initComponents();

        md = new DefaultTableModel(data, cabeza);
        jTableListaArticulos.setModel(md);

        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jlListaArticulos = new javax.swing.JLabel();
        jlNomArticulo = new javax.swing.JLabel();
        jlCantidad = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jtfNomArticulo = new javax.swing.JTextField();
        jtfCantidad = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListaArticulos = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jlMensaje = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel1PropertyChange(evt);
            }
        });

        jlListaArticulos.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jlListaArticulos.setText("Lista de Artículos");

        jlNomArticulo.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jlNomArticulo.setText("Nombre del Artículo");

        jlCantidad.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jlCantidad.setText("Cantidad");

        jlPrecio.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jlPrecio.setText("Precio");

        jbAgregar.setBackground(new java.awt.Color(204, 204, 204));
        jbAgregar.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jtfNomArticulo.setBackground(new java.awt.Color(244, 241, 241));
        jtfNomArticulo.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jtfNomArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomArticuloActionPerformed(evt);
            }
        });

        jtfCantidad.setBackground(new java.awt.Color(244, 241, 241));
        jtfCantidad.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        jtfPrecio.setBackground(new java.awt.Color(244, 241, 241));
        jtfPrecio.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jtfPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPrecioActionPerformed(evt);
            }
        });

        jTableListaArticulos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableListaArticulos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTableListaArticulosComponentShown(evt);
            }
        });
        jTableListaArticulos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTableListaArticulosPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(jTableListaArticulos);

        jbSalir.setBackground(new java.awt.Color(204, 204, 204));
        jbSalir.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlMensaje.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jlMensaje.setForeground(new java.awt.Color(204, 0, 51));
        jlMensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlMensaje.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlNomArticulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNomArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 319, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlListaArticulos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCantidad)
                                    .addComponent(jlPrecio))
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(jtfCantidad)
                                    .addComponent(jtfPrecio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlListaArticulos)
                            .addComponent(jbSalir))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNomArticulo)
                            .addComponent(jtfNomArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCantidad)
                            .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPrecio)
                            .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jbAgregar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Este metodo lee la información del ArrayList y la pasa a la Tabla

    public static void Listar() {
        DefaultListModel Md = new DefaultListModel();
        DefaultTableModel tabla = new DefaultTableModel();

        for (int i = 0; i < arreglo.size(); i++) {

            String nombre = arreglo.get(i).getNomArticulo();
            String cantidad = arreglo.get(i).getCantidad();
            String precio = arreglo.get(i).getPrecio();

            /*
             aqui se hace el calculo del total 
             */
            Double resultado = Integer.valueOf(arreglo.get(i).getCantidad())
                    * Double.valueOf(arreglo.get(i).getPrecio());
            String total = String.valueOf(resultado);

            String datos[] = {nombre, cantidad, precio, total};
            md.addRow(datos);
        }
    }

    public void Limpiar() {
        this.jtfNomArticulo.setText("");
        this.jtfCantidad.setText("");
        this.jtfPrecio.setText("");

    }

    public void BorrarTabla() {
        for (int i = 0; i < jTableListaArticulos.getRowCount(); i++) {
            md.removeRow(i);
            i -= 1;
        }
    }

    public static void CargarDatos() {
        try {
            FileInputStream Archivo = new FileInputStream("BasedeDatos.dat");
            ObjectInputStream Obj = new ObjectInputStream(Archivo);
            arreglo = (ArrayList<Articulo>) Obj.readObject();
        } catch (Exception e) {

        }

        Listar();
    }


    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        boolean siEsta = true;
        if (this.jtfNomArticulo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos!!");
        } else if (this.jtfCantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos!!");
        } else if (this.jtfPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos!!");
        } else {
            Articulo L = new Articulo();

            arreglo.add(new Articulo(jtfNomArticulo.getText(), jtfCantidad.getText(),
                    jtfPrecio.getText()));

            JOptionPane.showMessageDialog(null, "La información fue agregada correctamente.", "", -1);
            BorrarTabla();
            Listar();
            Limpiar();
        }

        GuardarDatos();

    }//GEN-LAST:event_jbAgregarActionPerformed


    private void jtfNomArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomArticuloActionPerformed

    private void jtfPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPrecioActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jTableListaArticulosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTableListaArticulosPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableListaArticulosPropertyChange

    private void jTableListaArticulosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableListaArticulosComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableListaArticulosComponentShown

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentShown

    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1PropertyChange

    public void GuardarDatos() {
        try {
            FileOutputStream Archivo = new FileOutputStream("BasedeDatos.dat");
            ObjectOutputStream Obj = new ObjectOutputStream(Archivo);
            Obj.writeObject(arreglo);

            jlMensaje.setText("El archivo se guardo correctamente");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "No se encontró el archivo.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "No se cargó el archivo.");
        }
    }

    //windowOpened no sale entre los events disponibles para el jPanel
//    private void formWindowOpened(java.awt.event.WindowEvent evt) {
//        CargarDatos();
//    }

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
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableListaArticulos;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlCantidad;
    private javax.swing.JLabel jlListaArticulos;
    private javax.swing.JLabel jlMensaje;
    private javax.swing.JLabel jlNomArticulo;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfNomArticulo;
    private javax.swing.JTextField jtfPrecio;
    // End of variables declaration//GEN-END:variables
}
