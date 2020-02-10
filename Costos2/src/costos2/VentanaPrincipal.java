/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costos2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tamay
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMateriaPrima = new javax.swing.JButton();
        btManoObra = new javax.swing.JButton();
        btIndirectos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textMateriaPrima = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textManoObra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textIndirectos = new javax.swing.JTextField();
        btDatos = new javax.swing.JButton();
        txtUnidades = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btUnidades = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCostoUnidades = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCostoT = new javax.swing.JTextField();
        btCalcularT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");
        setResizable(false);

        btnMateriaPrima.setText("Agregar Materia Prima");
        btnMateriaPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaPrimaActionPerformed(evt);
            }
        });

        btManoObra.setText("Agregar Mano de Obra");
        btManoObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManoObraActionPerformed(evt);
            }
        });

        btIndirectos.setText("Agregar Costo Indirecto");
        btIndirectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIndirectosActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Materia Prima:");

        textMateriaPrima.setEditable(false);
        textMateriaPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMateriaPrimaActionPerformed(evt);
            }
        });

        jLabel2.setText("Total Mano de Obra:");

        textManoObra.setEditable(false);
        textManoObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textManoObraActionPerformed(evt);
            }
        });

        jLabel3.setText("Total Costos Indirectos:");

        textIndirectos.setEditable(false);
        textIndirectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIndirectosActionPerformed(evt);
            }
        });

        btDatos.setText("Mostrar Datos");
        btDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDatosActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese la cantdad de unidades a producir:");

        btUnidades.setText("Agregar");
        btUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUnidadesActionPerformed(evt);
            }
        });

        jLabel5.setText("Total Costos de Fabricacion por unidad:");

        txtCostoUnidades.setEditable(false);

        jLabel6.setText("Total Costos de Fabricacion:");

        txtCostoT.setEditable(false);

        btCalcularT.setText("Calcular");
        btCalcularT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularTActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Tutorio de Contabilidad y Costos por Jhon Peña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textManoObra, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btManoObra))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textMateriaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMateriaPrima))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(btDatos))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btUnidades))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textIndirectos, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCostoUnidades)
                                        .addComponent(txtCostoT)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btCalcularT)
                                    .addComponent(btIndirectos))))
                        .addGap(133, 133, 133))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(btDatos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMateriaPrima))
                            .addComponent(textMateriaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(btManoObra))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38))
                    .addComponent(textManoObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btIndirectos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38))
                    .addComponent(textIndirectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUnidades))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCostoUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCalcularT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCostoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textMateriaPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMateriaPrimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMateriaPrimaActionPerformed

    private void btnMateriaPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaPrimaActionPerformed
        VentanaMateriaPrima v1 = new VentanaMateriaPrima();
        v1.setVisible(true);
    }//GEN-LAST:event_btnMateriaPrimaActionPerformed

    private void textManoObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textManoObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textManoObraActionPerformed

    private void textIndirectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIndirectosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIndirectosActionPerformed

    private void btManoObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManoObraActionPerformed
        VentanaManoObra v2 = new VentanaManoObra();
        v2.setVisible(true);
    }//GEN-LAST:event_btManoObraActionPerformed

    private void btIndirectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIndirectosActionPerformed
        VentanaIndirectos v3 = new VentanaIndirectos();
        v3.setVisible(true);
    }//GEN-LAST:event_btIndirectosActionPerformed

    private void btDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDatosActionPerformed
        this.textMateriaPrima.setText(String.format("%.2f", this.tMateria));
        this.textManoObra.setText(String.format("%.2f", this.tManoObra));
        this.textIndirectos.setText(String.format("%.2f", this.tIndirectos));
    }//GEN-LAST:event_btDatosActionPerformed

    private void btUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUnidadesActionPerformed
        // TODO add your handling code here:
        if (this.txtUnidades.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "los datos no pueden estar vacios");
        }else{
            this.unidades = Integer.valueOf(this.txtUnidades.getText());
        }
    }//GEN-LAST:event_btUnidadesActionPerformed

    private void btCalcularTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularTActionPerformed
        // TODO add your handling code here:
        this.total = this.tMateria+this.tManoObra+this.tIndirectos;
        this.txtCostoUnidades.setText(String.format("%.2f", this.total/this.unidades));
        this.txtCostoT.setText(String.format("%.2f", this.total));
        this.total = 0;
    }//GEN-LAST:event_btCalcularTActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcularT;
    private javax.swing.JButton btDatos;
    private javax.swing.JButton btIndirectos;
    private javax.swing.JButton btManoObra;
    private javax.swing.JButton btUnidades;
    private javax.swing.JButton btnMateriaPrima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textIndirectos;
    private javax.swing.JTextField textManoObra;
    private javax.swing.JTextField textMateriaPrima;
    private javax.swing.JTextField txtCostoT;
    private javax.swing.JTextField txtCostoUnidades;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
    //Variables publicas
    public static double tMateria = 0;
    public static double tManoObra = 0;
    public static double tIndirectos = 0;
    public static ArrayList<MateriaPrima> materiales = new ArrayList();
    public static ArrayList<Salario> salarios = new ArrayList();
    public static ArrayList<Indirectos> indirectos = new ArrayList();
    int unidades = 0;
    double total = 0;
}
