
package com.dev.poo.View;

import com.dev.poo.Aux.Categoria;
import com.dev.poo.Aux.ENivel;
import com.dev.poo.Entities.Desafio;
import com.dev.poo.Entities.Professor;
import com.dev.poo.Service.ServiceDesafio;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.util.Date;

public class CadastrarDesafio extends javax.swing.JFrame {

    private Professor professor;

    public CadastrarDesafio(Professor professor) {
        this.professor = professor;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTelaProfessor = new javax.swing.JPanel();
        jLabelPontuacao = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelNivel = new javax.swing.JLabel();
        jTextFieldPontuacao = new javax.swing.JTextField();
        jTextFieldTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBoxNivel = new javax.swing.JComboBox<>(ENivel.values());
        jComboBoxCategoria = new javax.swing.JComboBox<>(Categoria.values());
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelResposta = new javax.swing.JLabel();
        jTextFieldResposta = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jLabelCadastroDeDesafio = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Desafio");

        jPanelTelaProfessor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelPontuacao.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelPontuacao.setText("Pontuação:");

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTitulo.setText("Título:");

        jLabelDescricao.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelDescricao.setText("Descrição:");

        jLabelNivel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNivel.setText("Nível:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

//        jComboBoxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(ENivel.values());
        jButtonSalvar.setBackground(new java.awt.Color(0, 204, 51));
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar_35.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar_35.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");


        jLabelCategoria.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCategoria.setText("Categoria:");


        jLabelResposta.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelResposta.setText("Resposta:");

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar_35.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPontuacao.setText("");
                jTextFieldTitulo.setText("");
                jTextFieldResposta.setText("");
                jTextArea1.setText("");
                jComboBoxNivel.setSelectedIndex(0);
                jComboBoxCategoria.setSelectedIndex(0);
            }
        });

        javax.swing.GroupLayout jPanelTelaProfessorLayout = new javax.swing.GroupLayout(jPanelTelaProfessor);
        jPanelTelaProfessor.setLayout(jPanelTelaProfessorLayout);
        jPanelTelaProfessorLayout.setHorizontalGroup(
                jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(jLabelPontuacao)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTelaProfessorLayout.createSequentialGroup()
                                                        .addGap(58, 58, 58)
                                                        .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                                                                .addComponent(jLabelNivel)
                                                                .addComponent(jLabelResposta))
                                                        .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                                                        .addGap(17, 17, 17)
                                                                        .addComponent(jTextFieldResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                                                                        .addComponent(jComboBoxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(105, 105, 105)
                                                                                        .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                                                                                        .addComponent(jLabelCategoria)
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                                                                                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(15)
                                                                                                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(15)
                                                                                                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                                .addGap(40)
//                                                                                                        .addGap(44, 44, 44)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTelaProfessorLayout.createSequentialGroup()
                                                        .addGap(52, 52, 52)
                                                        .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabelTitulo)
                                                                .addComponent(jLabelDescricao))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanelTelaProfessorLayout.setVerticalGroup(
                jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTelaProfessorLayout.createSequentialGroup()
                                .addGap(35, 35, 35)

                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPontuacao)
                                        .addComponent(jTextFieldPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)

                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelTitulo))
                                .addGap(18, 18, 18)

                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDescricao)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelResposta)
                                        .addComponent(jTextFieldResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabelNivel)
                                                .addComponent(jComboBoxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabelCategoria)
                                                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addGap(40))
                                .addGap(13, 13, 13)
                                .addGroup(jPanelTelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93))
        );

        jLabelCadastroDeDesafio.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelCadastroDeDesafio.setText("Cadastrar novo DESAFIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelTelaProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(345, 345, 345)
                                .addComponent(jLabelCadastroDeDesafio, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(13, Short.MAX_VALUE)
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
        if (jTextFieldTitulo.getText().isEmpty() || jTextFieldPontuacao.getText().isEmpty() ||
                jTextFieldResposta.getText().isEmpty() || jTextArea1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Preencha todos os Campos!",
                    "Campo vazio",
                    JOptionPane.ERROR_MESSAGE);
            setCursor(Cursor.getDefaultCursor());
        } else {
            Desafio desafio = new Desafio();
            desafio.setProfessor(this.professor);
            desafio.setPontuacao(Integer.valueOf(jTextFieldPontuacao.getText()));
            desafio.setTitulo(jTextFieldTitulo.getText());
            desafio.setDescricao(jTextArea1.getText());
            desafio.setResposta_certa(jTextFieldResposta.getText());
//        ENivel nivel = (ENivel) jComboBoxNivel.getSelectedItem();
            desafio.setEnivel((ENivel) jComboBoxNivel.getSelectedItem());
            desafio.setCategoria((Categoria) jComboBoxCategoria.getSelectedItem());

            ServiceDesafio sv = new ServiceDesafio();
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja salvar o Desafio",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );
            if (resposta == JOptionPane.YES_OPTION) {
                if (sv.cadastrarDesafio(desafio, this.professor) != null) {
                    TelaProfessor telaProfessor = new TelaProfessor(this.professor);
                    telaProfessor.setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(
                            null,
                            "Dados salvos com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Erro ao Salvar Desafio!",
                            "Erro ao Salvar",
                            JOptionPane.ERROR_MESSAGE);
                    setCursor(Cursor.getDefaultCursor());
                }
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Operação cancelada. Nenhuma alteração foi salva.",
                        "Cancelado",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        }


    }


    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

//                new CadastrarDesafio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<ENivel> jComboBoxNivel;
    private javax.swing.JComboBox<Categoria> jComboBoxCategoria;
    private javax.swing.JLabel jLabelPontuacao;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelResposta;
    private javax.swing.JLabel jLabelCadastroDeDesafio;
    private javax.swing.JPanel jPanelTelaProfessor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldPontuacao;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTextField jTextFieldResposta;
    // End of variables declaration//GEN-END:variables
}
