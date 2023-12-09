/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.clubdeportivo.Interfaz;

import com.mycompany.clubdeportivo.Modelo.Controladora;
import com.mycompany.clubdeportivo.Modelo.Socio;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Consultar_Datos extends javax.swing.JFrame {
    
    Controladora control = null;
    
    public Consultar_Datos() {
        this.control = new Controladora();
        initComponents();
        cmbFiltro.addItem("Ver Todos");
        cmbFiltro.addItem("Futbol");
        cmbFiltro.addItem("Voley");
        cmbFiltro.addItem("Basquetbol");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        cmbFiltro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta de datos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel2.setText("Filtros: ");

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel3.setText("Socios registrados: ");

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\eliminar.png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\modificar.png")); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnFiltrar.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        btnFiltrar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\Actualizar.png")); // NOI18N
        btnFiltrar.setText("Actualizar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFiltrar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 710, 420));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\ClubDeportivo\\Images\\casita.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 40, 40));

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
        List<Socio> listaSocios = control.traerSocios();
        this.cargarTabla(listaSocios); 
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        if (cmbFiltro.getSelectedItem().equals("Futbol")) {
            List<Socio> socios = control.traerSocios();
            List<Socio> lista_nueva = socios.stream().filter(socio -> socio.getDeporte().getNombre().equals("Futbol"))
                    .collect(Collectors.toList());
            this.cargarTabla(lista_nueva);
        } else if (cmbFiltro.getSelectedItem().equals("Voley")) {
            List<Socio> socios = control.traerSocios();
            List<Socio> lista_nueva = socios.stream().filter(socio -> socio.getDeporte().getNombre().equals("Voley"))
                    .collect(Collectors.toList());
            this.cargarTabla(lista_nueva);
        } else if (cmbFiltro.getSelectedItem().equals("Basquetbol")) {
            List<Socio> socios = control.traerSocios();
            List<Socio> lista_nueva = socios.stream().filter(socio -> socio.getDeporte().getNombre().equals("Basquetbol"))
                    .collect(Collectors.toList());
            this.cargarTabla(lista_nueva);
        } else if (cmbFiltro.getSelectedItem().equals("Ver Todos")) {
            List<Socio> socios = control.traerSocios();
            this.cargarTabla(socios);
        }
    
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (tblTabla.getRowCount() > 0) {
            if (tblTabla.getSelectedRow() != -1) {
                int id_socio = Integer.parseInt(String.valueOf(tblTabla.getValueAt(tblTabla.getSelectedRow(), 0)));
                Editar_Socio editar_socio = new Editar_Socio(id_socio);
                editar_socio.setVisible(true);
                editar_socio.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado a un socio!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla esta vacia!!");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tblTabla.getRowCount() > 0) {
            if (tblTabla.getSelectedRow() != -1) {
                int id_socio = Integer.parseInt(String.valueOf(tblTabla.getValueAt(tblTabla.getSelectedRow(), 0)));
                Socio socio = control.traerSocio(id_socio);
                
                int seleccion = JOptionPane.showOptionDialog(
                null, //Componenete
                "Esta seguro que desea eliminar el socio"+socio.getNombre(), //Mensaje
                "Intento de eliminacion", //Titulo
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, //Icono... al poner null el icono sera por defecto
                new Object[] {"Si","No"}, 
                "Si");
                
                if (seleccion == 0) {
                    control.eliminarSocio(id_socio);
                    JOptionPane.showMessageDialog(null, "Socio eliminado con exito!!");
                    List<Socio> listaSocios;
                    listaSocios = control.traerSocios();
                    this.cargarTabla(listaSocios);
                }  
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado a un socio!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla esta vacia!!");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla(List<Socio> listaSocios) {
        DefaultTableModel tabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String titulos[] = {"ID", "Nombre", "Apellido", "Dni", "Deporte"};
        tabla.setColumnIdentifiers(titulos);
        if (listaSocios != null) {
            for (int i=0; i<listaSocios.size(); i++) {
                Object[] objecto = {listaSocios.get(i).getId_Socio(),listaSocios.get(i).getNombre(), listaSocios.get(i).getApellido(), 
                listaSocios.get(i).getDni(),listaSocios.get(i).getDeporte().getNombre()};
                tabla.addRow(objecto);
            }
        }
        tblTabla.setModel(tabla);      
    }
}
