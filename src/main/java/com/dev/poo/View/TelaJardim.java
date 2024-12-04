/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dev.poo.View;

import com.dev.poo.Aux.ENivel;
import com.dev.poo.Entities.Aluno;

public class TelaJardim extends javax.swing.JFrame {

    private Aluno aluno;

    public TelaJardim(Aluno aluno) {
        this.aluno = aluno;
        initComponents();
    }
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jLabelPlanta1 = new javax.swing.JLabel();
        jLabelPlanta2 = new javax.swing.JLabel();
        jLabelPlanta3 = new javax.swing.JLabel();
        jLabelPlanta4 = new javax.swing.JLabel();
        jLabelPlanta5 = new javax.swing.JLabel();
        jLabelPlanta6 = new javax.swing.JLabel();
        jLabelPlanta7 = new javax.swing.JLabel();
        planta6 = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jardim do Conhecimento - " + this.aluno.getClassificacao().getNivel());
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar_35.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, -1, -1));


        jLabelPlanta1.setVisible(false);
        jLabelPlanta2.setVisible(false);
        jLabelPlanta3.setVisible(false);
        jLabelPlanta4.setVisible(false);
        jLabelPlanta5.setVisible(false);
        jLabelPlanta6.setVisible(false);

        jLabelPlanta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jardim/planta1.png"))); // NOI18N
        getContentPane().add(jLabelPlanta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 80));

        jLabelPlanta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jardim/planta2.png"))); // NOI18N
        getContentPane().add(jLabelPlanta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 110, 100));

        jLabelPlanta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jardim/planta3.png"))); // NOI18N
        getContentPane().add(jLabelPlanta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 120, 130));

        jLabelPlanta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jardim/planta4.png"))); // NOI18N
        getContentPane().add(jLabelPlanta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 160, 200));

        jLabelPlanta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jardim/planta5.png"))); // NOI18N
        getContentPane().add(jLabelPlanta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 370, 400));

        jLabelPlanta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jardim/planta6.png"))); // NOI18N
        getContentPane().add(jLabelPlanta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 480, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jardim/jardim.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 610));

        pack();
        setLocationRelativeTo(null);

        switch (this.aluno.getClassificacao().getNivel()){
            case ENivel.CONHECIMENTO -> {
                jLabelPlanta1.setVisible(true);
            }
            case ENivel.SINTESE -> {
                jLabelPlanta1.setVisible(true);
                jLabelPlanta2.setVisible(true);

            }
            case ENivel.COMPREENSAO -> {
                jLabelPlanta1.setVisible(true);
                jLabelPlanta2.setVisible(true);
                jLabelPlanta3.setVisible(true);

            }
            case ENivel.ANALISE -> {
                jLabelPlanta1.setVisible(true);
                jLabelPlanta2.setVisible(true);
                jLabelPlanta3.setVisible(true);
                jLabelPlanta4.setVisible(true);

            }
            case ENivel.AVALIACAO -> {
                jLabelPlanta1.setVisible(true);
                jLabelPlanta2.setVisible(true);
                jLabelPlanta3.setVisible(true);
                jLabelPlanta4.setVisible(true);
                jLabelPlanta5.setVisible(true);

            }
            case ENivel.APLICACAO -> {
                jLabelPlanta1.setVisible(true);
                jLabelPlanta2.setVisible(true);
                jLabelPlanta3.setVisible(true);
                jLabelPlanta4.setVisible(true);
                jLabelPlanta5.setVisible(true);
                jLabelPlanta6.setVisible(true);

            }
            case null, default -> {

            }
        }
    }

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        TelaAluno telaAluno = new TelaAluno(aluno);
        telaAluno.setVisible(true);
        this.dispose();
    }


    public static void main(String args[]) {
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


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

//                new TelaJardim().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPlanta1;
    private javax.swing.JLabel jLabelPlanta2;
    private javax.swing.JLabel jLabelPlanta3;
    private javax.swing.JLabel jLabelPlanta4;
    private javax.swing.JLabel jLabelPlanta5;
    private javax.swing.JLabel jLabelPlanta6;
    private javax.swing.JLabel jLabelPlanta7;
    private javax.swing.JLabel planta6;
}
