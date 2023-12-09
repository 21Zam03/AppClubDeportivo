/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.clubdeportivo.Interfaz;

import com.mycompany.clubdeportivo.Modelo.Controladora;
import com.mycompany.clubdeportivo.Modelo.Deporte;
import java.util.List;
import javax.swing.JOptionPane;

public class Registrar_Socio extends javax.swing.JFrame {
    
    Controladora control = null;
    List<Deporte> listas_deportes = null;
    
    public Registrar_Socio() {
        this.control = new Controladora();
        initComponents();
        cmbDeporte.addItem("-");
        this.listas_deportes = control.traerDeportes();
        this.cargarDeportes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        cmbDeporte = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnVolverAprincipal = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de socios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dni: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Deporte: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        txtNombre.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 190, -1));

        txtApellido.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 190, -1));

        txtDni.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 190, -1));

        cmbDeporte.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jPanel1.add(cmbDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 120, -1));

        btnGuardar.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\guardar.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\escoba.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\usuario.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 290, 310));

        btnVolverAprincipal.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\casita.png")); // NOI18N
        btnVolverAprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAprincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolverAprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 40, 40));

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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        cmbDeporte.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (cmbDeporte.getSelectedItem().equals("-")) {
            JOptionPane.showMessageDialog(null, "Seleccione un deporte");
        } else {
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String dni = txtDni.getText();
        
            int id_deporte = cmbDeporte.getSelectedIndex();
            Deporte deporte = listas_deportes.get(id_deporte-1);
            control.RegistrarSocio(nombre, apellido, dni, deporte); 
        }         
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverAprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAprincipalActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverAprincipalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolverAprincipal;
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
    
    private void cargarDeportes() {
        for (int i=0; i<listas_deportes.size(); i++) {
            cmbDeporte.addItem(listas_deportes.get(i).getNombre());
        }
    }

}
