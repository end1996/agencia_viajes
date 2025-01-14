package agenciaviajes;

import java.awt.HeadlessException;
import java.sql.*;
import java.time.LocalDate; // Para manejar fechas sin complicaciones
import java.time.format.DateTimeFormatter; // Para formatear fechas
import java.time.format.DateTimeParseException; // Para manejar excepciones de fecha
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmPanelBoleto extends javax.swing.JFrame {

    //Nueva instancia de conexión con la base de datos de Oracle
    ConexionOracle con = new ConexionOracle();
    Connection cn = con.conectar();

    /**
     * Creates new form FrmPanelBoleto
     */
    public FrmPanelBoleto() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        txtBoleto = new javax.swing.JTextField();
        txtDoc = new javax.swing.JTextField();
        txtFechaVuelo = new javax.swing.JTextField();
        txtHoraSalida = new javax.swing.JTextField();
        txtCompania = new javax.swing.JTextField();
        txtItinerario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBoleto1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableDatos = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agencia de viajes - Boletos");
        setPreferredSize(new java.awt.Dimension(1200, 400));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(487, 289));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nro Boleto");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DNI");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de vuelo");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Hora de salida");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ID Compañía");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ID Itinerario");

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

        txtBoleto.setBackground(new java.awt.Color(255, 255, 255));

        txtDoc.setBackground(new java.awt.Color(255, 255, 255));

        txtFechaVuelo.setBackground(new java.awt.Color(255, 255, 255));

        txtHoraSalida.setBackground(new java.awt.Color(255, 255, 255));
        txtHoraSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraSalidaActionPerformed(evt);
            }
        });

        txtCompania.setBackground(new java.awt.Color(255, 255, 255));

        txtItinerario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nro Boleto");

        txtBoleto1.setEditable(false);
        txtBoleto1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFechaVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel8))
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                            .addComponent(txtBoleto1)))
                                    .addComponent(txtCompania, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnInicio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnActualizar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 144, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscar)
                    .addComponent(txtBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBoleto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        JTableDatos.setToolTipText("");
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
                .addGap(228, 228, 228)
                .addComponent(btnBorrar)
                .addContainerGap(225, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrar)
                .addGap(0, 60, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            // Consulta SQL para buscar un boleto
            String sql = "SELECT nro_billete,fecha_vuelo,dni,id_compañia,id_itinerario,hora_salida FROM boletos WHERE nro_billete=?";
            PreparedStatement ps = cn.prepareStatement(sql);

            // Establecer el valor del parámetro de búsqueda (boleto)
            ps.setString(1, txtBoleto.getText().trim());

            // Ejecutar la consulta
            ResultSet rs = ps.executeQuery();

            // Obtener el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) JTableDatos.getModel();

            // Limpiar el contenido anterior de la tabla
            model.setRowCount(0);

            // Verificar si se obtuvo algún resultado
            if (rs.next()) {
                // Crear un arreglo de objetos para almacenar los datos de la fila
                Object[] fila = new Object[6];
                fila[0] = rs.getString("nro_billete");
                fila[1] = rs.getString("fecha_vuelo");
                fila[2] = rs.getString("dni");
                fila[3] = rs.getString("id_compañia");
                fila[4] = rs.getString("id_itinerario");
                fila[5] = rs.getString("hora_salida");

                // Agregar la fila al modelo de la tabla
                model.addRow(fila);

                JOptionPane.showMessageDialog(null, "Boleto encontrado.");
                limpiarentradas();
            } else {
                // Si no se encuentra un boleto con ese número, mostrar un mensaje
                JOptionPane.showMessageDialog(null, "No se encontró ningún boleto con el número proporcionado.");
            }

            // Cerrar el ResultSet
            rs.close();

        } catch (SQLException e) {
            // Mostrar el error de manera más detallada
            JOptionPane.showMessageDialog(null, "Error al buscar los datos: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: El campo número de boleto debe ser un número válido.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
            PreparedStatement ps = cn.prepareStatement("insert into boletos(NRO_BILLETE,FECHA_VUELO,HORA_SALIDA,DNI,ID_COMPAÑIA,ID_ITINERARIO) values(nro_billete_seq.nextval,?,?,?,?,?)");
            ps.setString(1, txtFechaVuelo.getText());
            ps.setString(2, txtHoraSalida.getText());
            ps.setString(3, txtDoc.getText().trim());
            ps.setString(4, txtCompania.getText());
            ps.setString(5, txtItinerario.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            mostrarDatos();
            limpiarentradas();
        } catch (SQLException e) {
            System.out.println("Error al registrar boleto " + e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        String fechaTexto = txtFechaVuelo.getText().trim();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        java.sql.Date fechaVuelo = null; // Declarar la variable aquí

        try {
            // Convertir la fecha de vuelo
            LocalDate localFechaVuelo = LocalDate.parse(fechaTexto, formatter);
            fechaVuelo = java.sql.Date.valueOf(localFechaVuelo); // Convertir a java.sql.Date

            // Preparar la consulta SQL utilizando parámetros
            String sql = "UPDATE boletos SET fecha_vuelo=?, hora_salida=?, id_compañia=?, id_itinerario=?, dni=? WHERE nro_billete=?";
            PreparedStatement ps = cn.prepareStatement(sql);

            // Establecer los valores de los parámetros
            ps.setDate(1, fechaVuelo); // Establecer la fecha
            ps.setString(2, txtHoraSalida.getText().trim());
            ps.setInt(3, Integer.parseInt(txtCompania.getText().trim())); // Asegurar que es un número
            ps.setInt(4, Integer.parseInt(txtItinerario.getText().trim())); // Asegurar que es un número
            ps.setString(5, txtDoc.getText().trim());
            ps.setString(6, txtBoleto1.getText().trim());

            // Ejecutar la actualización
            int indice = ps.executeUpdate();

            // Verificar si se actualizó alguna fila
            if (indice > 0) {
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
                mostrarDatos();
                limpiarentradas();
            } else {
                JOptionPane.showMessageDialog(null, "No se actualizó ninguna fila");
            }
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Use dd-MM-yyyy");
            System.err.print(e);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: ID de compañía e itinerario deben ser números.");
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtHoraSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraSalidaActionPerformed

    private void JTableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableDatosMouseClicked

        btnRegistrar.setEnabled(false);
        btnActualizar.setEnabled(true);
        txtBoleto1.setEnabled(false);
        int fila = this.JTableDatos.getSelectedRow();
        this.txtBoleto1.setText(this.JTableDatos.getValueAt(fila, 0).toString());
        this.txtDoc.setText(this.JTableDatos.getValueAt(fila, 2).toString());
        this.txtFechaVuelo.setText(this.JTableDatos.getValueAt(fila, 1).toString());
        this.txtHoraSalida.setText(this.JTableDatos.getValueAt(fila, 5).toString());
        this.txtCompania.setText(this.JTableDatos.getValueAt(fila, 3).toString());
        this.txtItinerario.setText(this.JTableDatos.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_JTableDatosMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
 
        try {
            // Obtener la fila seleccionada
            int filaSeleccionada = JTableDatos.getSelectedRow();

            // Verificar si se ha seleccionado una fila
            if (filaSeleccionada != -1) {
                // Obtener el valor de "boleto" de la fila seleccionada
                String boleto = JTableDatos.getValueAt(filaSeleccionada, 0).toString();

                // Confirmar si el usuario desea eliminar el registro
                int opcion = JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro de eliminar el boleto?");

                if (opcion == JOptionPane.YES_OPTION) {
                    PreparedStatement ps = cn.prepareStatement("DELETE FROM boletos WHERE nro_billete=?");
                    ps.setString(1, boleto);  // Pasar nro_billete como String

                    int indice = ps.executeUpdate();

                    if (indice > 0) {
                        JOptionPane.showMessageDialog(null, "Boleto Eliminado");
                        // Actualizar el modelo de la tabla después de eliminar el boleto
                        ((DefaultTableModel) JTableDatos.getModel()).removeRow(filaSeleccionada);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar boleto");
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

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

        JTableDatos.clearSelection();
        limpiarentradas();
        btnRegistrar.setEnabled(true);
        txtDoc.setEnabled(true);
        txtBoleto1.setEnabled(true);
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
            java.util.logging.Logger.getLogger(FrmPanelBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPanelBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPanelBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPanelBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmPanelBoleto().setVisible(true);
        });
    }

    private void mostrarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nro de boleto");
        modelo.addColumn("Fecha de vuelo");
        modelo.addColumn("DNI");
        modelo.addColumn("ID Compañía");
        modelo.addColumn("ID Itinerario");
        modelo.addColumn("Hora de salida");

        JTableDatos.setModel(modelo);
        //Se usa la funcion TO_NUMBER para convertir el string en número para ordenarlo correctamente
        //para asegurarse el funcionamiento se aplica REGEXP_SUBSTR que toma un String y define el patrón
        //de comportamiento. Por tanto buscará secuencias de 0-9 sin importar caracteres alfanuméricos
        String consultasql = "select * from boletos order by TO_NUMBER(REGEXP_SUBSTR(NRO_BILLETE, '^[0-9]+'))";
        String data[] = new String[6];

        Statement st;
        try {
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);

            while (rs.next()) {

                data[0] = rs.getString(1);
                //Obtiene las fechas almacenadas en la base de datos
                java.sql.Date sqlDate = rs.getDate(2);
                if (sqlDate != null) { //Si la consulta no es nula ejecuta lo siguiente
                    LocalDate localDate = sqlDate.toLocalDate(); //Convierte las fechas al tipo LocalDate
                    //Se define un formato personalizado para la fecha de día,mes, año.
                    DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
                    //Se declara una variable de tipo String para aplicarle el formato
                    String fecha = localDate.format(customFormatter);
                    //Mostrar la fecha formateada en la tabla
                    data[1] = fecha;
                } else {
                    //En caso de ser nulo se asigna una cadena vacía
                    data[1] = "";
                }
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                data[5] = rs.getString(6);
                modelo.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos " + e);
        }

    }

    private void limpiarentradas() {
        txtBoleto1.setText("");
        txtDoc.setText("");
        txtFechaVuelo.setText("");
        txtHoraSalida.setText("");
        txtCompania.setText("");
        txtItinerario.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableDatos;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBoleto;
    private javax.swing.JTextField txtBoleto1;
    private javax.swing.JTextField txtCompania;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtFechaVuelo;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtItinerario;
    // End of variables declaration//GEN-END:variables
}
