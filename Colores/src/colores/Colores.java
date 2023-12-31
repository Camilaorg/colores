/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package colores;

/**
 *
 * @author User
 */
public class Colores extends javax.swing.JFrame {

    /**
     * Creates new form Colores
     */
    public Colores() {
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

        btnGColores = new javax.swing.ButtonGroup();
        lblColor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtnRojo = new javax.swing.JRadioButton();
        rbtnVerde = new javax.swing.JRadioButton();
        rbtnAzul = new javax.swing.JRadioButton();
        btnColorear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblColor.setBackground(new java.awt.Color(255, 204, 204));
        lblColor.setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Colores"));

        btnGColores.add(rbtnRojo);
        rbtnRojo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnRojo.setText("Rojo");
        rbtnRojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnRojoStateChanged(evt);
            }
        });

        btnGColores.add(rbtnVerde);
        rbtnVerde.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnVerde.setText("Verde");
        rbtnVerde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnVerdeStateChanged(evt);
            }
        });

        btnGColores.add(rbtnAzul);
        rbtnAzul.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnAzul.setText("Azul");
        rbtnAzul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnAzulStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbtnAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtnRojo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtnVerde, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnRojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnVerde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnAzul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnColorear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnColorear.setText("Colorear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnColorear)))
                .addGap(64, 64, 64)
                .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnColorear)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnRojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnRojoStateChanged
        // TODO add your handling code here:
        if (rbtnRojo.isSelected()) {
            rbtnVerde.setSelected(false);
            rbtnAzul.setSelected(false);
        }
    }//GEN-LAST:event_rbtnRojoStateChanged

    private void rbtnVerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnVerdeStateChanged
        // TODO add your handling code here:
        if (rbtnVerde.isSelected()) {
            rbtnAzul.setSelected(false);
            rbtnRojo.setSelected(false);
        }
    }//GEN-LAST:event_rbtnVerdeStateChanged

    private void rbtnAzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnAzulStateChanged
        // TODO add your handling code here:
        if (rbtnAzul.isSelected()) {
            rbtnRojo.setSelected(false);
            rbtnVerde.setSelected(false);
    }//GEN-LAST:event_rbtnAzulStateChanged

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
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColorear;
    private javax.swing.ButtonGroup btnGColores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblColor;
    private javax.swing.JRadioButton rbtnAzul;
    private javax.swing.JRadioButton rbtnRojo;
    private javax.swing.JRadioButton rbtnVerde;
    // End of variables declaration//GEN-END:variables
}
