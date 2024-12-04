
package com.dev.poo.View;

import com.dev.poo.Aux.TipoUsuario;
import com.dev.poo.Entities.Aluno;
import com.dev.poo.Entities.Professor;
import com.dev.poo.Entities.Usuario;
import com.dev.poo.Repository.RepositoryAluno;

import javax.swing.*;
import java.awt.*;

public class CadastrarAluno extends javax.swing.JFrame {

    private Professor professor;

    public CadastrarAluno(Professor professor) {
        this.professor = professor;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTelaProfessor = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldnome = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabelCadastroDeDesafio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Desafio");

        jPanelTelaProfessor.setBorder(javax.swing.BorderFactory.createEtchedBorder());


        jLabelNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNome.setText("Nome:");

        jLabelEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelEmail.setText("E-mail:");


        jLabelSenha.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelSenha.setText("Senha:");

        jPasswordFieldSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordFieldSenha.setName("");

        jButtonSalvar.setBackground(new java.awt.Color(0, 204, 51));
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar_35.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar_35.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar_35.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTelaProfessorLayout = new javax.swing.GroupLayout(jPanelTelaProfessor);
        jPanelTelaProfessor.setLayout(jPanelTelaProfessorLayout);
        jPanelTelaProfessorLayout.setHorizontalGroup(
                jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                                .addGap(87, 87, 87)
                                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                                                .addComponent(jLabelEmail)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelNome)
                                                                        .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                                                                .addGap(23, 23, 23)
                                                                        ))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                ))
                                                        .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                                                .addComponent(jLabelSenha)
                                                                .addGap(21, 21, 21)
                                                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                                                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                        ))
                                .addContainerGap(517, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaProfessorLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jButtonCancelar)
                                .addGap(91, 91, 91)
                                .addComponent(jButtonVoltar)
                                .addGap(173, 173, 173))
        );
        jPanelTelaProfessorLayout.setVerticalGroup(
                jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                )
                                .addGap(18, 18, 18)
                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNome)
                                        .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelEmail)
                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSenha)
                                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                )
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(131, 131, 131))
        );

        jLabelCadastroDeDesafio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelCadastroDeDesafio.setText("CADASTRO DE ALUNO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelTelaProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(345, 345, 345)
                                .addComponent(jLabelCadastroDeDesafio, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(14, Short.MAX_VALUE)
                                .addComponent(jLabelCadastroDeDesafio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelTelaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        TelaProfessor telaProfessor = new TelaProfessor(this.professor);
        telaProfessor.setVisible(true);
        this.dispose();
    }

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextFieldEmail.getText().isEmpty() || jTextFieldnome.getText().isEmpty() || jPasswordFieldSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Preencha todos os Campos!",
                    "Campo vazio",
                    JOptionPane.ERROR_MESSAGE);
            setCursor(Cursor.getDefaultCursor());
        } else {
            Aluno aluno = new Aluno();
            aluno.setNome(jTextFieldnome.getText());
            aluno.setEmail(jTextFieldEmail.getText());
            aluno.setSenha(jPasswordFieldSenha.getText());
            aluno.setTipo(TipoUsuario.ALUNO);

            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja Salvar o Aluno",
                    "Salvar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (resposta == JOptionPane.YES_OPTION) {
                RepositoryAluno ra = new RepositoryAluno(Aluno.class);
                ra.salvar(aluno);
                TelaProfessor telaProfessor = new TelaProfessor(this.professor);
                telaProfessor.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(
                        null,
                        "Aluno Salvo com Sucesso!",
                        "Aluno Salvo",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Operação cancelada. Nenhuma alteração foi salva.",
                        "Cancelado",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }


        }


        TelaProfessor telaProfessor = new TelaProfessor(this.professor);
        telaProfessor.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelCadastroDeDesafio;
    private javax.swing.JPanel jPanelTelaProfessor;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JTextField jTextFieldEmail;
}
