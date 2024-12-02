/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author dimit
 */
public class TelaJardim extends javax.swing.JFrame {

    /**
     * Creates new form TelaJardim
     */
    public TelaJardim() {
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

        jButtonVoltar = new javax.swing.JButton();
        jLabelPlanta5 = new javax.swing.JLabel();
        jLabelPlanta6 = new javax.swing.JLabel();
        jLabelPlanta2 = new javax.swing.JLabel();
        jLabelPlanta4 = new javax.swing.JLabel();
        jLabelPlanta3 = new javax.swing.JLabel();
        jLabelPlanta7 = new javax.swing.JLabel();
        jLabelBackgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jardim do Conhecimento ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar_35.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, -1, -1));

        jLabelPlanta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jarro_150.png"))); // NOI18N
        getContentPane().add(jLabelPlanta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        jLabelPlanta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arvore_2.png"))); // NOI18N
        getContentPane().add(jLabelPlanta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jLabelPlanta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flores_resized.png"))); // NOI18N
        getContentPane().add(jLabelPlanta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jLabelPlanta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jarro_150.png"))); // NOI18N
        getContentPane().add(jLabelPlanta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabelPlanta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flores_resized.png"))); // NOI18N
        getContentPane().add(jLabelPlanta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));

        jLabelPlanta7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lemon_150.png"))); // NOI18N
        getContentPane().add(jLabelPlanta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 150, 160));

        jLabelBackgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jardim 2.png"))); // NOI18N
        getContentPane().add(jLabelBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        TelaAluno telaAluno = new TelaAluno();
        telaAluno.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJardim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJardim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJardim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJardim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJardim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelBackgroud;
    private javax.swing.JLabel jLabelPlanta2;
    private javax.swing.JLabel jLabelPlanta3;
    private javax.swing.JLabel jLabelPlanta4;
    private javax.swing.JLabel jLabelPlanta5;
    private javax.swing.JLabel jLabelPlanta6;
    private javax.swing.JLabel jLabelPlanta7;
    // End of variables declaration//GEN-END:variables
}
