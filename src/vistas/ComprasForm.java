package vistas;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import modelo.Compras;
import dao.ComprasDAO;
import modelo.DetalleCompras;
import modelo.Producto;
import dao.ProductoDAO;
import modelo.Proveedor;
import dao.ProveedorDAO;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jesé
 */
public class ComprasForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form ComprasForm
     */
    ProductoDAO pdao = new ProductoDAO();
    Producto p = new Producto();
    ComprasDAO cdao = new ComprasDAO();
    Compras c = new Compras();
    DetalleCompras dc = new DetalleCompras();
    Proveedor pr = new Proveedor();
    ProveedorDAO prdao = new ProveedorDAO();

    DefaultTableModel modelo = new DefaultTableModel();
    int idp;
    int cantidad;
    double precio;
    double tpagar = 0;
    int item = 0;
    int idpr = 0;

    ImageIcon icon = new ImageIcon("");

    public ComprasForm() {
        initComponents();
        this.setFrameIcon(icon);
        generarSerie();
        fecha();
        SpinnerNumberModel n = new SpinnerNumberModel();
        n.setMinimum(0);
        txtCantidad.setModel(n);
    }

    void fecha() {
        Calendar calendar = new GregorianCalendar();
        int anno = calendar.get(Calendar.YEAR);
        int mes = calendar.get(calendar.MONTH) + 1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        txtFecha.setText("" + anno + "-" + mes + "-" + dia);
    }

    void generarSerie() {
        String serie = cdao.nroSeriecompras();
        if (serie == null) {
            txtSerie.setText("1");
        } else {
            int incrementar = Integer.parseInt(serie);
            incrementar = incrementar + 1;
            txtSerie.setText("" + incrementar);
        }
    }

    boolean esNumerico(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        txtCodigoP = new javax.swing.JTextField();
        btnBuscarProveedor = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        btnBuscarPorCod = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();

        menuEliminar.setText("Eliminar Item");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuEliminar);

        setClosable(true);
        setMaximizable(true);
        setTitle("Modulo Compras");

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel10.setText("Fecha:");

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel2.setText("Nro Serie:");

        txtSerie.setEditable(false);
        txtSerie.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("id Prod:");

        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        jLabel4.setText("Producto:");

        txtNombre.setEditable(false);

        jLabel5.setText("Precio Venta:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel6.setText("Stock:");

        txtStock.setEditable(false);

        jLabel7.setText("Cantidad:");

        jLabel11.setText("Dni Prov:");

        btnBuscarProveedor.setText("Buscar");
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });

        jLabel12.setText("Proveedor:");

        txtProveedor.setEditable(false);

        jLabel1.setText("Precio Compra:");

        btnBuscarPorCod.setText("Buscar");
        btnBuscarPorCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorCodActionPerformed(evt);
            }
        });

        jLabel8.setText("cod Prod:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCod)
                            .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBuscarPorCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProveedor)
                    .addComponent(jLabel12)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarPorCod)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setBorder(null);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Prod", "Producto", "Cantidad", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        txtTotal.setEditable(false);

        jLabel9.setText("Total:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnComprar.setText("Generar Compra");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComprar)
                .addGap(93, 93, 93)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnCancelar)
                    .addComponent(btnComprar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        buscarProducto(false);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese codigo de Producto");
        } else if (txtCodigoP.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese DNI de Proveedor");
        } else if (txtPrecioCompra.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese precio de Compra");
        } else {
            agregarProducto();
            actualizarPrecio();
            limpiar();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (!txtTotal.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Desea cancelar la Compra?");
            if (confirmacion == 0) {
                nuevo();
                fecha();
            }
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if (txtTotal.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos");
        } else {
            guardarCompra();
            guardarDetalle();
            actualizarStock();
            JOptionPane.showMessageDialog(this, "Compra exitosa");
            nuevo();
            generarSerie();
            fecha();
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    void limpiar() {
        txtCod.setText("");
        txtId.setText("");
        txtNombre.setText("");
        txtCantidad.setValue(0);
        txtStock.setText("");
        txtPrecioVenta.setText("");
        txtPrecioCompra.setText("");
    }

    void nuevo() {
        limpiarTabla();
        limpiar();
        txtFecha.setText("");
        txtSerie.setText("");
        txtTotal.setText("");
        txtCodigoP.setText("");
        txtProveedor.setText("");
    }

    void actualizarStock() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Producto pr = new Producto();
            idp = Integer.parseInt(tabla.getValueAt(i, 0).toString());
            cantidad = Integer.parseInt(tabla.getValueAt(i, 2).toString());
            pr = pdao.listarId(idp);
            int s = pr.getStock() + cantidad;
            pdao.actualizarStock(s, idp);
        }
    }

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
        buscarProveedor();
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        eliminarItem();
    }//GEN-LAST:event_menuEliminarActionPerformed

    private void btnBuscarPorCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorCodActionPerformed
        buscarProducto(true);
    }//GEN-LAST:event_btnBuscarPorCodActionPerformed

    void eliminarItem() {
        int row = tabla.getSelectedRow();
        if (tabla.getSelectedRowCount() == 1) {
            double precio = Double.parseDouble(tabla.getValueAt(row, 4).toString());
            double precioActual = Double.parseDouble(txtTotal.getText()) - precio;
            txtTotal.setText("" + precioActual);
            modelo.removeRow(tabla.getSelectedRow());
        }
    }

    void guardarCompra() {
        String serie = txtSerie.getText();
        String fecha = txtFecha.getText();
        double monto = tpagar;

        c.setIdProveedor(idpr);
        c.setSerie(serie);
        c.setFecha(fecha);
        c.setMonto(monto);
        cdao.guardarCompras(c);
    }

    void guardarDetalle() {
        int idc = Integer.parseInt(cdao.idCompras());
        for (int i = 0; i < tabla.getRowCount(); i++) {
            int idp = Integer.parseInt(tabla.getValueAt(i, 0).toString());
            int cantidad = Integer.parseInt(tabla.getValueAt(i, 2).toString());
            double precio = Double.parseDouble(tabla.getValueAt(i, 4).toString());
            dc.setIdCompra(idc);
            dc.setIdProducto(idp);
            dc.setCantidad(cantidad);
            dc.setPrecompra(precio);
            cdao.guardarDetalleCompras(dc);
        }
    }

    void buscarProducto(boolean cod) {
        if (cod) {
            String codBarra = txtCod.getText();
            if (txtCod.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Debe ingresar Codigo de Barra del producto");
            } else {
                p = pdao.listarCod(codBarra);
                if (p.getId() != 0) {
                    txtId.setText("" + p.getId());
                    txtNombre.setText(p.getNombre());
                    txtPrecioVenta.setText("" + p.getPrecio());
                    txtStock.setText("" + p.getStock());
                } else {
                    JOptionPane.showMessageDialog(this, "Producto no registrado");
                    txtCantidad.requestFocus();
                }
            }
        } else {
            if (esNumerico(txtId.getText())) {
                int id = Integer.parseInt(txtId.getText());
                if (txtId.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Debe ingresar codigo de producto");
                } else {
                    p = pdao.listarId(id);
                    if (p.getId() != 0) {
                        txtCod.setText(p.getCodBarra());
                        txtNombre.setText(p.getNombre());
                        txtPrecioVenta.setText("" + p.getPrecio());
                        txtStock.setText("" + p.getStock());
                    } else {
                        JOptionPane.showMessageDialog(this, "Producto no registrado");
                        txtCantidad.requestFocus();
                    }
                }
            }
        }
    }

    void buscarProveedor() {
        if (esNumerico(txtCodigoP.getText())) {
            int dni = Integer.parseInt(txtCodigoP.getText());
            if (txtCodigoP.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Debe ingresar DNI del Proveedor");
            } else {
                pr = prdao.listarDni(dni);
                if (pr.getDni() != null) {
                    txtProveedor.setText(pr.getNombre());
                    idpr = pr.getId();
                } else {
                    JOptionPane.showMessageDialog(this, "Proveedor no registrado");
                    txtCantidad.requestFocus();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar DNI del Proveedor");
        }
    }

    void agregarProducto() {
        double total;

        modelo = (DefaultTableModel) tabla.getModel();
        idp = p.getId();
        String nombre = txtNombre.getText();
        precio = Double.parseDouble(txtPrecioCompra.getText());
        cantidad = Integer.parseInt(txtCantidad.getValue().toString());
        int stock = Integer.parseInt(txtStock.getText());
        total = cantidad * precio;
        ArrayList lista = new ArrayList();
        try {
            lista.add(idp);
            lista.add(nombre);
            lista.add(cantidad);
            lista.add(precio);
            lista.add(total);
            Object[] ob = new Object[5];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
            ob[2] = lista.get(2);
            ob[3] = lista.get(3);
            ob[4] = lista.get(4);
            modelo.addRow(ob);
            tabla.setModel(modelo);

            calcularTotal();
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Debe ingrear el codigo el producto");
        }

    }

    void calcularTotal() {
        tpagar = 0;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            cantidad = Integer.parseInt(tabla.getValueAt(i, 2).toString());
            precio = Double.parseDouble(tabla.getValueAt(i, 3).toString());
            tpagar = tpagar + (cantidad * precio);
        }
        txtTotal.setText("" + tpagar);
    }

    void actualizarPrecio() {
        int idp = Integer.parseInt(txtId.getText());
        double precio = Double.parseDouble(txtPrecioVenta.getText());

        p.setId(idp);
        p.setPrecio(precio);
        pdao.actualizarPrecio(p);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarPorCod;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JTable tabla;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCodigoP;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
