package agenciaviajes;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Enmanuel Nava ID 00135538
 */
public class FrmPanelItinerario extends javax.swing.JFrame {

    //Nueva instancia de conexión con la base de datos de Oracle
    ConexionOracle con = new ConexionOracle();
    Connection cn = con.conectar();

    /**
     * Creates new form FrmPanelItinerario
     */
    public FrmPanelItinerario() {
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

        jPanel2 = new javax.swing.JPanel();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableDatos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        txtOrigen = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtItinerario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtItinerario1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agencia de viajes - Itinerarios");
        setLocation(new java.awt.Point(0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(153, 0, 0));
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        JTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(btnBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrar)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(487, 289));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Origen");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Destino");

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

        txtOrigen.setBackground(new java.awt.Color(255, 255, 255));

        txtDestino.setBackground(new java.awt.Color(255, 255, 255));

        txtItinerario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ID Itinerario");

        txtItinerario1.setEditable(false);
        txtItinerario1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(26, 26, 26))
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtItinerario1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnRegistrar)
                .addGap(30, 30, 30)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel8)
                    .addComponent(txtItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtItinerario1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnActualizar)
                    .addComponent(btnInicio))
                .addGap(118, 118, 118))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableDatosMouseClicked

        btnRegistrar.setEnabled(false);
        btnActualizar.setEnabled(true);
        txtItinerario1.setEnabled(false);
        int fila = this.JTableDatos.getSelectedRow();
        this.txtItinerario1.setText(this.JTableDatos.getValueAt(fila, 0).toString());
        this.txtOrigen.setText(this.JTableDatos.getValueAt(fila, 1).toString());
        this.txtDestino.setText(this.JTableDatos.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_JTableDatosMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        try {
            // Obtener la fila seleccionada en la tabla JTableDatos
            int filaSeleccionada = JTableDatos.getSelectedRow();

            // Verificar si se ha seleccionado una fila
            if (filaSeleccionada != -1) {
                // Obtener el valor de "itinerario" de la columna correspondiente
                // En este caso, se asume que el valor en la columna 0 (primera columna) es el id_itinerario
                String itinerario = JTableDatos.getValueAt(filaSeleccionada, 0).toString();

                // Confirmar si el usuario realmente desea eliminar el registro
                // Se muestra un cuadro de diálogo de confirmación
                int opcion = JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro de eliminar el registro?");

                // Si el usuario selecciona "Sí" en el cuadro de diálogo
                if (opcion == JOptionPane.YES_OPTION) {
                    // Preparar la consulta SQL para eliminar el registro en la tabla itinerarios
                    // Se utiliza un PreparedStatement para evitar inyecciones SQL
                    PreparedStatement ps = cn.prepareStatement("DELETE FROM itinerarios WHERE id_itinerario=?");
                    // Establecer el valor del parámetro de la consulta con el id_itinerario a eliminar
                    ps.setString(1, itinerario);

                    // Ejecutar la actualización y obtener el número de filas afectadas
                    int indice = ps.executeUpdate();

                    // Verificar si la eliminación fue exitosa (si se eliminaron filas)
                    if (indice > 0) {
                        // Mostrar un mensaje de éxito si el itinerario fue eliminado
                        JOptionPane.showMessageDialog(null, "Itinerario Eliminado");
                        // Actualizar el modelo de la tabla después de eliminar el itinerario
                        // Se elimina la fila seleccionada del modelo de la tabla
                        ((DefaultTableModel) JTableDatos.getModel()).removeRow(filaSeleccionada);
                    } else {
                        // Si no se eliminaron filas, mostrar un mensaje de error
                        JOptionPane.showMessageDialog(null, "Error al eliminar itinerario");
                    }
                } // Si el usuario selecciona "No" en el cuadro de diálogo
                else if (opcion == JOptionPane.NO_OPTION) {
                    // Mostrar un mensaje indicando que la eliminación fue cancelada
                    JOptionPane.showMessageDialog(null, "Se ha cancelado la eliminación");
                }

                // Limpiar los campos de entrada después de la operación
                limpiarentradas();
            } else {
                // Si no se ha seleccionado ninguna fila, mostrar un mensaje de advertencia
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            }
        } catch (HeadlessException | SQLException e) {
            // Capturar excepciones que pueden ocurrir durante la operación
            // HeadlessException si la interfaz gráfica no tiene un entorno gráfico
            // SQLException si hay un error en la base de datos
            System.err.println(e);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

        JTableDatos.clearSelection();
        limpiarentradas();
        btnRegistrar.setEnabled(true);
        txtItinerario1.setEnabled(true);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            // Consulta SQL para buscar un itinerario
            String sql = "SELECT id_itinerario,origen,destino FROM itinerarios WHERE id_itinerario=?";
            PreparedStatement ps = cn.prepareStatement(sql);

            // Establecer el valor del parámetro de búsqueda (ID Itinerario)
            ps.setString(1, txtItinerario.getText().trim());

            // Ejecutar la consulta
            ResultSet rs = ps.executeQuery();

            // Obtener el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) JTableDatos.getModel();

            // Limpiar el contenido anterior de la tabla
            model.setRowCount(0);

            // Verificar si se obtuvo algún resultado
            if (rs.next()) {
                // Crear un arreglo de objetos para almacenar los datos de la fila
                Object[] fila = new Object[3];
                fila[0] = rs.getString("id_itinerario");
                fila[1] = rs.getString("origen");
                fila[2] = rs.getString("destino");

                // Agregar la fila al modelo de la tabla
                model.addRow(fila);

                JOptionPane.showMessageDialog(null, "Itinerario encontrado.");
                limpiarentradas();
            } else {
                // Si no se encuentra un boleto con ese número, mostrar un mensaje
                JOptionPane.showMessageDialog(null, "No se encontró ningún itinerario con el número proporcionado.");
            }

            // Cerrar el ResultSet
            rs.close();

        } catch (SQLException e) {
            // Mostrar el error de manera más detallada
            JOptionPane.showMessageDialog(null, "Error al buscar los datos: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: El campo id de itinerario debe ser un número válido.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
            PreparedStatement ps = cn.prepareStatement("insert into itinerarios(id_itinerario,origen,destino) values(id_itin_seq.nextval,?,?)");
            ps.setString(1, txtOrigen.getText());
            ps.setString(2, txtDestino.getText().trim());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            mostrarDatos();
            limpiarentradas();
        } catch (SQLException e) {
            System.out.println("Error al registrar Itinerario " + e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        try {
            // Preparar la consulta SQL utilizando parámetros
            String sql = "UPDATE itinerarios SET origen=?,destino=? WHERE id_itinerario=?";
            PreparedStatement ps = cn.prepareStatement(sql);

            // Establecer los valores de los parámetros
            ps.setString(1, txtOrigen.getText().trim());
            ps.setString(2, txtDestino.getText().trim());
            ps.setString(3, txtItinerario1.getText());

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
            JOptionPane.showMessageDialog(null, "Error: El campo id itinerario debe ser un número válido.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPanelItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPanelItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPanelItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPanelItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmPanelItinerario().setVisible(true);
        });
    }

    private void mostrarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Itinerario");
        modelo.addColumn("Origen");
        modelo.addColumn("Destino");
        JTableDatos.setModel(modelo);
        String consultasql = "SELECT * FROM itinerarios order by 1";
        String data[] = new String[3];

        Statement st;
        try {
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);

            while (rs.next()) {
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                modelo.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos " + e);
        }

    }

    private void limpiarentradas() {
        txtItinerario.setText("");
        txtItinerario1.setText("");
        txtOrigen.setText("");
        txtDestino.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableDatos;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtItinerario;
    private javax.swing.JTextField txtItinerario1;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables
}
