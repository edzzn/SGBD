/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGBD_LCE_UC.capa.GUI;

import SGBD_LCE_UC.capa.logica.GestorDBAdapter;
import SGBD_LCE_UC.capa.logica.TEST_Script;

/**
 *
 * @author mariabelen
 */
public class FramePrincipalBD extends javax.swing.JFrame {
    private String comando = null;
    /**
     * Creates new form vInicial
     */
    public FramePrincipalBD() {
        initComponents();
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
        jLabelSGBD = new javax.swing.JLabel();
        jLabelIngresarComando = new javax.swing.JLabel();
        ingresoComandos = new javax.swing.JTextField();
        botonVisualizar = new javax.swing.JButton();
        botonEjecutar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSintaxis = new javax.swing.JMenu();
        menuTablas = new javax.swing.JMenu();
        menuCrearT = new javax.swing.JMenuItem();
        menuModificarT = new javax.swing.JMenuItem();
        menuEliminarT = new javax.swing.JMenuItem();
        menuRegistro = new javax.swing.JMenu();
        menuCrearR = new javax.swing.JMenuItem();
        menuModificarR = new javax.swing.JMenuItem();
        menuEliminarR = new javax.swing.JMenuItem();
        menuSeleccionar = new javax.swing.JMenuItem();
        menuUnir = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSGBD.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabelSGBD.setText("SISTEMA DE GESTION DE BASE DE DATOS - SGDB LCE UC");

        jLabelIngresarComando.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelIngresarComando.setText("INGRESAR COMANDO:");

        botonVisualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonVisualizar.setText("EJECUTAR");
        botonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVisualizarActionPerformed(evt);
            }
        });

        botonEjecutar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonEjecutar.setText("LIMPIAR");
        botonEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEjecutarActionPerformed(evt);
            }
        });

        menuSintaxis.setText("Sintaxis Comandos");

        menuTablas.setText("TABLAS");

        menuCrearT.setText("CREAR TABLA");
        menuCrearT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCrearTActionPerformed(evt);
            }
        });
        menuTablas.add(menuCrearT);

        menuModificarT.setText("MODIFICAR TABLA");
        menuModificarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificarTActionPerformed(evt);
            }
        });
        menuTablas.add(menuModificarT);

        menuEliminarT.setText("ELIMINAR TABLA");
        menuEliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarTActionPerformed(evt);
            }
        });
        menuTablas.add(menuEliminarT);

        menuSintaxis.add(menuTablas);

        menuRegistro.setText("REGISTROS");

        menuCrearR.setText("CREAR REGISTRO");
        menuCrearR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCrearRActionPerformed(evt);
            }
        });
        menuRegistro.add(menuCrearR);

        menuModificarR.setText("MODIFICAR REGISTRO");
        menuModificarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificarRActionPerformed(evt);
            }
        });
        menuRegistro.add(menuModificarR);

        menuEliminarR.setText("ELIMINAR REGISTRO");
        menuEliminarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarRActionPerformed(evt);
            }
        });
        menuRegistro.add(menuEliminarR);

        menuSintaxis.add(menuRegistro);

        menuSeleccionar.setText("SELECCIONAR");
        menuSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSeleccionarActionPerformed(evt);
            }
        });
        menuSintaxis.add(menuSeleccionar);

        menuUnir.setText("UNIR");
        menuUnir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUnirActionPerformed(evt);
            }
        });
        menuSintaxis.add(menuUnir);

        jMenuBar1.add(menuSintaxis);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelSGBD)
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelIngresarComando)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingresoComandos)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonEjecutar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelSGBD)
                .addGap(13, 13, 13)
                .addComponent(jLabelIngresarComando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresoComandos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEjecutar)
                    .addComponent(botonVisualizar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVisualizarActionPerformed
        // TODO add your handling code here:
        if(ingresoComandos.getText().equals("SCRIPT")){
            System.out.println("TEXT");
            TEST_Script script = new TEST_Script();
            script.iniciar();
        } else {
            comando = ingresoComandos.getText();
            GestorDBAdapter gestor = GestorDBAdapter.getGestor();
            gestor.operar(comando); 
        }
        
        
    }//GEN-LAST:event_botonVisualizarActionPerformed

    private void botonEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEjecutarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_botonEjecutarActionPerformed

    private void menuSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSeleccionarActionPerformed
        // TODO add your handling code here:
        ingresoComandos.setText("SELECCIONAR DE nombre_tabla DONDE cedulacamp1 =\"123\"");
    }//GEN-LAST:event_menuSeleccionarActionPerformed

    private void menuCrearTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCrearTActionPerformed
        // TODO add your handling code here:
        ingresoComandos.setText("CREAR TABLA nombre_tabla CAMPOS camp1,camp2,campN CLAVE camp1 LONGITUD len1,len2,lenN ENCRIPTADO camp1,camp2 ");
    }//GEN-LAST:event_menuCrearTActionPerformed

    private void menuModificarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificarTActionPerformed
        // TODO add your handling code here:
        ingresoComandos.setText("MODIFICAR TABLA nombre_tabla CAMPO nombre_campo POR nombre_campo");
    }//GEN-LAST:event_menuModificarTActionPerformed

    private void menuCrearRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCrearRActionPerformed
        // TODO add your handling code here:
        ingresoComandos.setText("INSERTAR EN nombre_tabla VALORES vC1 , vC2 ,... , vCn ");
    }//GEN-LAST:event_menuCrearRActionPerformed

    private void menuEliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarTActionPerformed
        // TODO add your handling code here:
        ingresoComandos.setText("ELIMINAR TABLA nombre_tabla");
    }//GEN-LAST:event_menuEliminarTActionPerformed

    private void menuModificarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificarRActionPerformed
        // TODO add your handling code here:
        ingresoComandos.setText("ACTUALIZAR REGISTRO nombre_tabla CLAVE valorCampoClave CAMPO campo POR valor_campo_nuevo");
    }//GEN-LAST:event_menuModificarRActionPerformed

    private void menuEliminarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarRActionPerformed
        // TODO add your handling code here:
        ingresoComandos.setText("BORRAR REGISTRO nombre_tabla CLAVE valorCampoClave");
    }//GEN-LAST:event_menuEliminarRActionPerformed

    private void menuUnirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUnirActionPerformed
        // TODO add your handling code here:
        ingresoComandos.setText("UNIR nombre_tabla1, nombre_tabla2 POR nombre_campo = ”Algo” ORDENADO asc/desc VER número_registros");
    }//GEN-LAST:event_menuUnirActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipalBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipalBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEjecutar;
    private javax.swing.JButton botonVisualizar;
    public static javax.swing.JTextField ingresoComandos;
    private javax.swing.JLabel jLabelIngresarComando;
    private javax.swing.JLabel jLabelSGBD;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuCrearR;
    private javax.swing.JMenuItem menuCrearT;
    private javax.swing.JMenuItem menuEliminarR;
    private javax.swing.JMenuItem menuEliminarT;
    private javax.swing.JMenuItem menuModificarR;
    private javax.swing.JMenuItem menuModificarT;
    private javax.swing.JMenu menuRegistro;
    private javax.swing.JMenuItem menuSeleccionar;
    private javax.swing.JMenu menuSintaxis;
    private javax.swing.JMenu menuTablas;
    private javax.swing.JMenuItem menuUnir;
    // End of variables declaration//GEN-END:variables
}
