/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm;

import gdm.entidades.clases.Contrato;
import gdm.entidades.clases.Escuela;
import java.awt.Cursor;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.Clases.ContratoNegocio;

/**
 *
 * @author Chuy
 */
public class JPanelContrato extends javax.swing.JPanel {
     private List<Contrato> contratos;

    /**
     * Creates new form JPanelContratoPendiente
     */
    public JPanelContrato() {
        initComponents();
        cargarContrato();
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
        tblGraduacion = new javax.swing.JTable();
        btnVer = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbEscuela = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        cbCiudad = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblGraduacion.getTableHeader().setFont(new java.awt.Font("Euphemia", 0, 14));
        tblGraduacion.getTableHeader().setBackground(new java.awt.Color(255,255,255));
        tblGraduacion.setFont(new java.awt.Font("Euphemia", 0, 14));
        tblGraduacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Número", "Escuela", "Carrera/Grupo", "Ciudad", "Generación", "Fecha del evento", "Misa", "Baile", "Foto panorámica", "Comentarios", "idMisa", "idFoto", "idbaile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGraduacion.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblGraduacion.setRowHeight(23);
        jScrollPane1.setViewportView(tblGraduacion);
        if (tblGraduacion.getColumnModel().getColumnCount() > 0) {
            tblGraduacion.getColumnModel().getColumn(0).setMinWidth(80);
            tblGraduacion.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblGraduacion.getColumnModel().getColumn(0).setMaxWidth(80);
            tblGraduacion.getColumnModel().getColumn(1).setMinWidth(150);
            tblGraduacion.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblGraduacion.getColumnModel().getColumn(1).setMaxWidth(150);
            tblGraduacion.getColumnModel().getColumn(2).setMinWidth(200);
            tblGraduacion.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblGraduacion.getColumnModel().getColumn(2).setMaxWidth(200);
            tblGraduacion.getColumnModel().getColumn(3).setMinWidth(150);
            tblGraduacion.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblGraduacion.getColumnModel().getColumn(3).setMaxWidth(150);
            tblGraduacion.getColumnModel().getColumn(4).setMinWidth(200);
            tblGraduacion.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblGraduacion.getColumnModel().getColumn(4).setMaxWidth(200);
            tblGraduacion.getColumnModel().getColumn(5).setMinWidth(100);
            tblGraduacion.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblGraduacion.getColumnModel().getColumn(5).setMaxWidth(100);
            tblGraduacion.getColumnModel().getColumn(6).setMinWidth(500);
            tblGraduacion.getColumnModel().getColumn(6).setPreferredWidth(500);
            tblGraduacion.getColumnModel().getColumn(6).setMaxWidth(500);
            tblGraduacion.getColumnModel().getColumn(7).setMinWidth(500);
            tblGraduacion.getColumnModel().getColumn(7).setPreferredWidth(500);
            tblGraduacion.getColumnModel().getColumn(7).setMaxWidth(500);
            tblGraduacion.getColumnModel().getColumn(8).setMinWidth(500);
            tblGraduacion.getColumnModel().getColumn(8).setPreferredWidth(500);
            tblGraduacion.getColumnModel().getColumn(8).setMaxWidth(500);
            tblGraduacion.getColumnModel().getColumn(9).setMinWidth(300);
            tblGraduacion.getColumnModel().getColumn(9).setPreferredWidth(300);
            tblGraduacion.getColumnModel().getColumn(9).setMaxWidth(300);
            tblGraduacion.getColumnModel().getColumn(10).setMinWidth(0);
            tblGraduacion.getColumnModel().getColumn(10).setPreferredWidth(0);
            tblGraduacion.getColumnModel().getColumn(10).setMaxWidth(0);
            tblGraduacion.getColumnModel().getColumn(11).setMinWidth(0);
            tblGraduacion.getColumnModel().getColumn(11).setPreferredWidth(0);
            tblGraduacion.getColumnModel().getColumn(11).setMaxWidth(0);
            tblGraduacion.getColumnModel().getColumn(12).setMinWidth(0);
            tblGraduacion.getColumnModel().getColumn(12).setPreferredWidth(0);
            tblGraduacion.getColumnModel().getColumn(12).setMaxWidth(0);
        }

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Ver1.png"))); // NOI18N
        btnVer.setContentAreaFilled(false);
        btnVer.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Ver2.png"))); // NOI18N
        btnVer.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Ver3.png"))); // NOI18N
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Finalizar1.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Finalizar2.png"))); // NOI18N
        jButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Finalizar3.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar1.png"))); // NOI18N
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar2.png"))); // NOI18N
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar3.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Editar1.png"))); // NOI18N
        btnEditar.setContentAreaFilled(false);
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Editar2.png"))); // NOI18N
        btnEditar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Editar3.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Eliminar1.png"))); // NOI18N
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Eliminar2.png"))); // NOI18N
        btnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Eliminar3.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Euphemia", 0, 18)); // NOI18N
        jLabel1.setText("Contrato de servicio");

        cbEscuela.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escuela", "Item 2", "Item 3", "Item 4" }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carrera o Especialidad", "Item 2", "Item 3", "Item 4" }));

        cbCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ciudad", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Generación:");

        jButton1.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cbEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(149, 149, 149)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
         try
        {
            btnEditar.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if(tblGraduacion.getSelectedRow()!= -1){
                int id = Integer.parseInt(tblGraduacion.getValueAt(tblGraduacion.getSelectedRow(), 0).toString());

                JDialogAgregarContrato agregar = new JDialogAgregarContrato(null, true);
                agregar.id = id;
                agregar.editar=true;
                agregar.setVisible(true);
                if (agregar.DialogResult)
                {
                    cargarContrato();
                }
            }else{
                JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("SeleccionElemento")
                    , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloContrato"), JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
        }finally{
            btnEditar.setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        try
        {
         this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if(tblGraduacion.getSelectedRow()!= -1)
            {    
                JDialogContratoCliente contrato = new JDialogContratoCliente(null, true);
                contrato.idContrato =  Integer.parseInt(tblGraduacion.getValueAt(tblGraduacion.getSelectedRow(), 0).toString());
                contrato.setVisible(true);
            }  
        }
        catch(Exception ex)
        {
            
        }finally
        {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
      try
        {
            btnAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            JDialogAgregarContrato contrato = new JDialogAgregarContrato(null, true);
            contrato.setVisible(true);
            if(contrato.DialogResult)
            {
                cargarContrato();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
        }finally{
            btnAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
             try
        {   btnEditar.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if(tblGraduacion.getSelectedRow()!= -1){
                int id = Integer.parseInt(tblGraduacion.getValueAt(tblGraduacion.getSelectedRow(), 0).toString());

                JDialogAgregarContrato agregar = new JDialogAgregarContrato(null, true);

                //this.setVisible(true);
                agregar.id = id;
                agregar.editar=true;
                agregar.setVisible(true);
                if (agregar.DialogResult)
                {
                    cargarContrato();
                }
            }else{
                JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("SeleccionElemento")
                    , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloContrato"), JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
        }finally{
            btnEditar.setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
           try
        {
            btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if(tblGraduacion.getSelectedRow()!= -1){

                int opcion = JOptionPane.showConfirmDialog(null, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("Eliminar"), ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloContrato"), JOptionPane.YES_NO_OPTION);
                   if(opcion==0){
                    int idMisa = Integer.parseInt(tblGraduacion.getValueAt(tblGraduacion.getSelectedRow(), 10).toString());
                    int idBaile = Integer.parseInt(tblGraduacion.getValueAt(tblGraduacion.getSelectedRow(), 11).toString());
                    int idFoto = Integer.parseInt(tblGraduacion.getValueAt(tblGraduacion.getSelectedRow(), 12).toString());
                   
                    int id = Integer.parseInt(tblGraduacion.getValueAt(tblGraduacion.getSelectedRow(), 0).toString());
                    if(ContratoNegocio.Eliminar(id,idMisa,idBaile,idFoto)){
                        cargarContrato();
                    }
                }

            }else{
                JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("SeleccionElemento")
                    , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloContrato"), JOptionPane.INFORMATION_MESSAGE);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
        }finally{
            btnEliminar.setCursor(Cursor.getDefaultCursor());
        }       
                           
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox cbCiudad;
    private javax.swing.JComboBox cbEscuela;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblGraduacion;
    // End of variables declaration//GEN-END:variables

    private void cargarContrato() {
       try
        {
            DefaultTableModel mod = (DefaultTableModel)tblGraduacion.getModel();
            while(mod.getRowCount() > 0)
                mod.removeRow(0);

            contratos = ContratoNegocio.Listado();
            for(Contrato entidad : contratos){
                int id = entidad.getId();
                String escuela = entidad.getEscuela().getNombre();
                String ciudad = entidad.getEscuela().getCiudad();
                String especialidad= entidad.getEspecialidad().getNombre();
                String generacion = entidad.getGeneracion();
                String misa = "En "+entidad.getMisa().getLugar()+" el "+entidad.getMisa().getFecha()+" a las "+
                        entidad.getMisa().getHora()+":"+entidad.getMisa().getMinutos()+" horas";
                String baile = "En "+entidad.getBaile().getLugar()+" el "+entidad.getBaile().getFecha()+" a las "+
                        entidad.getBaile().getHora()+":"+entidad.getBaile().getMinutos()+" horas";
                String fotoPanoramica = "En "+entidad.getFotoPanoramica().getLugar()+" el "+entidad.getFotoPanoramica().getFecha()+" a las "+
                        entidad.getFotoPanoramica().getHora()+":"+entidad.getFotoPanoramica().getMinutos()+" horas";
                String comentarios = entidad.getComentarios();
                Date fechaEvento = entidad.getFechaEvento();
                int  idMisa= entidad.getMisa().getId();
                int  idFoto= entidad.getFotoPanoramica().getId();
                int  idBaile= entidad.getBaile().getId();
                mod.addRow(new Object[] {id,escuela,especialidad,ciudad,generacion,fechaEvento,misa,baile,fotoPanoramica,comentarios,idMisa,idFoto,idBaile});
            } 
            tblGraduacion.setModel(mod);
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }
        finally
        {
            this.setCursor(Cursor.getDefaultCursor());
        }
    }

 
}
