/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.clubdeportivo.Interfaz;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        foto1 = new javax.swing.JLabel();
        btnRegistrarDeporte = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnRegistrar.setText("Registrar Socio");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 190, -1));

        btnConsultar.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnConsultar.setText("Consultar datos");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 190, -1));

        btnSalir.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 190, -1));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Club Deportivo ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        foto1.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\deporte1.png")); // NOI18N
        jPanel1.add(foto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 360, 160));

        btnRegistrarDeporte.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnRegistrarDeporte.setText("Registrar deporte");
        btnRegistrarDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDeporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        Consultar_Datos consultar = new Consultar_Datos();
        consultar.setVisible(true);
        consultar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Registrar_Socio registrar = new Registrar_Socio();
        registrar.setVisible(true);
        registrar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegistrarDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDeporteActionPerformed
        Registrar_Deporte registrar = new Registrar_Deporte();
        registrar.setVisible(true);
        registrar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarDeporteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarDeporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
