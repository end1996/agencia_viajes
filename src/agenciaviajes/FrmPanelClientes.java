package agenciaviajes;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmPanelClientes extends javax.swing.JFrame {

    //Nueva instancia de conexión con la base de datos de Oracle
    ConexionOracle con = new ConexionOracle();
    Connection cn = con.conectar();

    /**
     * Creates new form frmPanelClientes
     */
    public FrmPanelClientes() {
        initComponents();
        mostrarDatos();
        this.setLocationRelativeTo(null);
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        txtDNI = new javax.swing.JTextField();
        txtDoc = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApePat = new javax.swing.JTextField();
        txtApeMat = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableDatos = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenciaviajes/borrar.png"))); // NOI18N
        jMenuItem1.setText("jMenuItem1");
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agencia de  viajes - Clientes");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DNI");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DNI");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellido Paterno");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Apellido Materno");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Teléfono");

        btnBuscar.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar registro");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 51, 153));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 51, 153));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(0, 204, 51));
        btnInicio.setText("Inicio");
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        txtDNI.setBackground(new java.awt.Color(255, 255, 255));
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });

        txtDoc.setBackground(new java.awt.Color(255, 255, 255));
        txtDoc.setToolTipText("");
        txtDoc.setName(""); // NOI18N

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));

        txtApePat.setBackground(new java.awt.Color(255, 255, 255));
        txtApePat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApePatActionPerformed(evt);
            }
        });

        txtApeMat.setBackground(new java.awt.Color(255, 255, 255));

        txtTel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnInicio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtApeMat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                                .addComponent(txtTel, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtApePat)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(76, 76, 76)
                                            .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnActualizar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar)))
                        .addGap(25, 123, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscar)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtApePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnActualizar)
                    .addComponent(btnInicio))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        JTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        JTableDatos.setToolTipText("");
        JTableDatos.setComponentPopupMenu(jPopupMenu1);
        JTableDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableDatos);

        btnBorrar.setBackground(new java.awt.Color(153, 0, 0));
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(btnBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrar)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        try {
            PreparedStatement ps = cn.prepareStatement("insert into clientes(DNI,NOMBRE,APELLIDO_PAT,APELLIDO_MAT,TELEFONO) values(?,?,?,?,?)");
            ps.setString(1, txtDoc.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtApePat.getText());
            ps.setString(4, txtApeMat.getText());
            ps.setString(5, txtTel.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            mostrarDatos();
            limpiarentradas();
        } catch (SQLException e) {
            System.out.println("Error al registrar cliente " + e);
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtApePatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApePatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApePatActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        try {
            // Obtener la fila seleccionada
            int filaSeleccionada = JTableDatos.getSelectedRow();

            // Verificar si se ha seleccionado una fila
            if (filaSeleccionada != -1) {
                // Obtener el DNI de la fila seleccionada
                String dni = JTableDatos.getValueAt(filaSeleccionada, 0).toString();

                // Confirmar si el usuario desea eliminar el registro
                int opcion = JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro de eliminar el registro?");

                if (opcion == JOptionPane.YES_OPTION) {
                    PreparedStatement ps = cn.prepareStatement("DELETE FROM clientes WHERE DNI=?");
                    ps.setString(1, dni);  // Pasar DNI como String

                    int indice = ps.executeUpdate();

                    if (indice > 0) {
                        JOptionPane.showMessageDialog(null, "Cliente Eliminado");
                        // Actualizar el modelo de la tabla después de eliminar el cliente
                        ((DefaultTableModel) JTableDatos.getModel()).removeRow(filaSeleccionada);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar cliente");
                    }
                } else if (opcion == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Se ha cancelado la eliminación");
                }

                limpiarentradas();
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        try {
            // Preparar la consulta SQL utilizando parámetros
            String sql = "UPDATE clientes SET nombre=?, apellido_pat=?, apellido_mat=?, telefono=? WHERE dni=?";
            PreparedStatement ps = cn.prepareStatement(sql);

            // Establecer los valores de los parámetros
            ps.setString(1, txtNombre.getText().trim());
            ps.setString(2, txtApePat.getText().trim());
            ps.setString(3, txtApeMat.getText().trim());
            ps.setString(4, txtTel.getText().trim());
            ps.setInt(5, Integer.parseInt(txtDoc.getText().trim())); // Asegurar de que 'dni' es un número

            // Ejecutar la actualización
            /*Guardar en la var indice un valor que se obtiene al ejecutar (executeUpdate)
            la instrucción sql(update).
             */
            int indice = ps.executeUpdate();

            // Verificar si se actualizó alguna fila
            if (indice > 0) { //Si el indice es > 0 es porque no hay error en la ejecución
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
                mostrarDatos(); // Método para refrescar los datos en la tabla
                limpiarentradas(); // Método para limpiar los campos después de la actualización
            } else {
                JOptionPane.showMessageDialog(null, "No se actualizó ninguna fila");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: El campo DNI debe ser un número válido.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void JTableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableDatosMouseClicked

        btnRegistrar.setEnabled(false);
        btnActualizar.setEnabled(true);
        txtDoc.setEnabled(false);
        //Captura los datos de la fila seleccionada por el usuario
        int fila = this.JTableDatos.getSelectedRow();
        //Mostrar en la caja txtDoc el valor de la columna 0
        //(dentro de la variable fila) y lo convierte a texto ya que el doc es
        //un valor numérico
        this.txtDoc.setText(this.JTableDatos.getValueAt(fila, 0).toString());
        this.txtNombre.setText(this.JTableDatos.getValueAt(fila, 1).toString());
        this.txtApePat.setText(this.JTableDatos.getValueAt(fila, 2).toString());
        this.txtApeMat.setText(this.JTableDatos.getValueAt(fila, 3).toString());
        this.txtTel.setText(this.JTableDatos.getValueAt(fila, 4).toString());

    }//GEN-LAST:event_JTableDatosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            // Consulta SQL para buscar un cliente por DNI
            String sql = "SELECT nombre, apellido_pat, apellido_mat, telefono FROM clientes WHERE dni=?";
            PreparedStatement ps = cn.prepareStatement(sql);

            // Establecer el valor del parámetro de búsqueda (DNI)
            ps.setString(1, txtDNI.getText().trim());

            // Ejecutar la consulta
            ResultSet rs = ps.executeQuery();

            // Obtener el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) JTableDatos.getModel();

            // Limpiar el contenido anterior de la tabla
            model.setRowCount(0);

            // Verificar si se obtuvo algún resultado
            if (rs.next()) {
                // Crear un arreglo de objetos para almacenar los datos de la fila
                Object[] fila = new Object[5];
                fila[0] = txtDNI.getText().trim(); // Usa txtDNI de manera consistente
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getString("apellido_pat");
                fila[3] = rs.getString("apellido_mat");
                fila[4] = rs.getString("telefono");

                // Agregar la fila al modelo de la tabla
                model.addRow(fila);

                JOptionPane.showMessageDialog(null, "Cliente encontrado.");
                limpiarentradas();
            } else {
                // Si no se encuentra un cliente con ese DNI, mostrar un mensaje
                JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con el DNI proporcionado.");
            }

            // Cerrar el ResultSet
            rs.close();

        } catch (SQLException e) {
            // Mostrar el error de manera más detallada
            JOptionPane.showMessageDialog(null, "Error al buscar los datos: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: El campo DNI debe ser un número válido.");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

        JTableDatos.clearSelection();
        limpiarentradas();
        btnRegistrar.setEnabled(true);
        txtDoc.setEnabled(true);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked

        this.setVisible(false);
        FrmPanelMainMenu fmm = new FrmPanelMainMenu();
        fmm.setVisible(true);
    }//GEN-LAST:event_btnInicioMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPanelClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPanelClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPanelClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPanelClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmPanelClientes().setVisible(true);
        });
    }

    private void mostrarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Teléfono");
        JTableDatos.setModel(modelo);
        //Ordena los clientes por nombre alfabeticamente
        String consultasql = "select * from clientes order by 2";
        String data[] = new String[5];

        Statement st;
        try {
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);

            while (rs.next()) {
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                modelo.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos " + e);
        }

    }

    private void limpiarentradas() {
        txtDoc.setText("");
        txtNombre.setText("");
        txtApePat.setText("");
        txtApeMat.setText("");
        txtTel.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableDatos;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApeMat;
    private javax.swing.JTextField txtApePat;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

}