/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dev.poo.View;

import com.dev.poo.Aux.ENivel;
import com.dev.poo.Entities.Aluno;
import com.dev.poo.Entities.Desafio;
import com.dev.poo.Entities.Professor;
import com.dev.poo.Repository.RepositoryAluno;
import com.dev.poo.Service.ServiceDesafio;
import com.dev.poo.View.TelaProfessor;

import java.util.ArrayList;
import java.util.List;

public class ListaAlunos extends javax.swing.JFrame {

    private Professor professor;

    public ListaAlunos(Professor professor) {
        this.professor = professor;
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jButtonSair1 = new javax.swing.JButton();
        jButtonSair2 = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RepositoryAluno ra = new RepositoryAluno(Aluno.class);
        List<Aluno> alunos = new ArrayList<>();
        for (Aluno d : ra.buscarTodos()) {
            alunos.add(d);
        }


        Object[][] dados = new Object[alunos.size()][6];
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            dados[i][0] = aluno.getId();
            dados[i][1] = aluno.getNome();
            dados[i][2] = aluno.getEmail();
            dados[i][3] = aluno.getSenha();
            if (aluno.getClassificacao() != null) {
                dados[i][4] = aluno.getClassificacao().getNivel().name();
                dados[i][5] = aluno.getPontosAcumulados();
            } else {
                dados[i][4] = "INICIANTE";
                dados[i][5] = 0;
            }

        }
        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
                dados,
                new String[]{
                        "Id", "Nome", "Email", "Senha", "Nivel", "Pontos Acumulados"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Long.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.Integer.class,
            };


            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });


        jScrollPane1.setViewportView(jTableAlunos);
//        if (jTableAlunos.getColumnModel().getColumnCount() > 0) {
//            jTableAlunos.getColumnModel().getColumn(0).setHeaderValue("Id");
//            jTableAlunos.getColumnModel().getColumn(1).setHeaderValue("Nome");
//            jTableAlunos.getColumnModel().getColumn(2).setHeaderValue("Nível");
//            jTableAlunos.getColumnModel().getColumn(3).setHeaderValue("Progresso");
//        }

        jButtonSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar_35.png"))); // NOI18N
        jButtonSair1.setText("Editar");

        jButtonSair2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir_35.png"))); // NOI18N
        jButtonSair2.setText("Excluir");

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar_35.png"))); // NOI18N
        jButtonSair.setText("Voltar");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButtonSair1)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonSair2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSair)
                                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonSair)
                                        .addComponent(jButtonSair1)
                                        .addComponent(jButtonSair2))
                                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

        TelaProfessor telaProfessor = new TelaProfessor(this.professor);
        telaProfessor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(ListaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSair1;
    private javax.swing.JButton jButtonSair2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlunos;
    // End of variables declaration//GEN-END:variables
}
