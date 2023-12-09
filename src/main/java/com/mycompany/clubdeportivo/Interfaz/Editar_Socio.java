/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.clubdeportivo.Interfaz;

import com.mycompany.clubdeportivo.Modelo.Controladora;
import com.mycompany.clubdeportivo.Modelo.Deporte;
import com.mycompany.clubdeportivo.Modelo.Socio;
import java.util.List;
import javax.swing.JOptionPane;

public class Editar_Socio extends javax.swing.JFrame {
    
    Controladora control = null;
    int id_socio;
    List<Deporte> listas_deportes = null;
    
    public Editar_Socio(int id) {
        this.control = new Controladora();
        this.id_socio = id;
        initComponents();
        cmbDeporte.addItem("-");
        this.listas_deportes = control.traerDeportes();
        this.cargarDeportes();
        this.mostrarDatos(id);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnIr_Principal = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        cmbDeporte = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpiar.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\escoba.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, -1, -1));

        btnGuardar.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\guardar.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, -1, -1));

        txtNombre.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 140, -1));

        txtApellido.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 140, -1));

        txtDni.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 140, -1));

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editar socio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dni: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Deporte: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\usuario.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 300, 320));

        btnIr_Principal.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\casita.png")); // NOI18N
        btnIr_Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIr_PrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnIr_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 40, 40));

        btnAtras.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\atras.png")); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 40, 40));

        cmbDeporte.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jPanel1.add(cmbDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 130, -1));

        Fondo.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\Fondo1.png")); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void btnIr_PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIr_PrincipalActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnIr_PrincipalActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Consultar_Datos consultar_datos = new Consultar_Datos();
        consultar_datos.setVisible(true);
        consultar_datos.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        cmbDeporte.setSelectedItem(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String dni = txtDni.getText();
        Deporte deporte = null;
        
        //Para poder obtener el nombre del deporte
        String nombre_deporte = String.valueOf(cmbDeporte.getSelectedItem());
        
        //Para poder obtener el deporte seleccionado
        for (int i=0; i<listas_deportes.size(); i++) {
            if (nombre_deporte.equals(listas_deportes.get(i).getNombre())) {
                deporte = listas_deportes.get(i);
            }
        }
        
        control.actualizarSocio(nombre, apellido, dni, deporte, this.id_socio);
        JOptionPane.showMessageDialog(null, "Se actualizaron los datos correctamente!!");
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIr_Principal;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbDeporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    
    private void mostrarDatos(int id) {
        Socio socio = control.traerSocio(id);
        txtNombre.setText(socio.getNombre());
        txtApellido.setText(socio.getApellido());
        txtDni.setText(socio.getDni());
        
        for (int i=0; i<listas_deportes.size(); i++) {
            if (listas_deportes.get(i).getNombre().equals(socio.getDeporte().getNombre())) {
                cmbDeporte.setSelectedIndex(i+1);
            }
        }
    }
    
    private void cargarDeportes() {
        for (int i=0; i<listas_deportes.size(); i++) {
            cmbDeporte.addItem(listas_deportes.get(i).getNombre());
        }
    }

}
