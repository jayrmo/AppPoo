/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dev.poo.View;

import com.dev.poo.Aux.Categoria;
import com.dev.poo.Entities.Desafio;
import com.dev.poo.Entities.Professor;
import com.dev.poo.Entities.Usuario;
import com.dev.poo.Repository.RepositoryDesafio;
import com.dev.poo.Service.ServiceDesafio;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListaDesafios extends javax.swing.JFrame {
    private Professor professor;
    private Object idLinhaSelecionada;

    public ListaDesafios(Professor professor) {
        setProfessor(professor);
        initComponents();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDesafios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desafios ");


        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar_35.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir_35.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar_35.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonVoltarActionPerformed(evt);
            }
        });


        ServiceDesafio sd = new ServiceDesafio();
        List<Desafio> desafios = new ArrayList<>();
        for (Desafio d : sd.buscarTodos()) {
            if (d.getProfessor().getEmail().equals(this.professor.getEmail())) {
                desafios.add(d);
                System.out.println("Lista Por campo: " + d.getId() + " = " + d.getTitulo() + " : " + d.getCategoria());
            }
        }


        Object[][] dados = new Object[desafios.size()][7];
        for (int i = 0; i < desafios.size(); i++) {
            Desafio desafio = desafios.get(i);
            dados[i][0] = desafio.getId();
            dados[i][1] = desafio.getTitulo();
            dados[i][2] = desafio.getDescricao();
            dados[i][3] = desafio.getResposta_certa();
            dados[i][4] = desafio.getEnivel().name();
            dados[i][5] = desafio.getCategoria().name();
            dados[i][6] = desafio.getPontuacao();

        }
        jTableDesafios.setModel(new javax.swing.table.DefaultTableModel(
                dados,
                new String[]{
                        "Id", "Titulo", "Descrição", "Resposta", "Nivel", "Categoria", "Pontuação"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Long.class,
                    java.lang.String.class,
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
        jTableDesafios.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = jTableDesafios.getSelectedRow(); // Obtém a linha selecionada
                if (selectedRow != -1) {
                    Object id = jTableDesafios.getValueAt(selectedRow, 0);
                    Object titulo = jTableDesafios.getValueAt(selectedRow, 1);
                    this.idLinhaSelecionada = id;
//                    System.out.println("Linha selecionada: ID = " + id + ", Título = " + titulo);
                }
            }
        });

        jTableDesafios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTableDesafios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGap(64, 64, 64)
                                .addComponent(jButtonEditar)
                                .addGap(53, 53, 53)
                                .addComponent(jButtonExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonVoltar)
                                .addGap(44, 44, 44))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonVoltar)
                                        .addComponent(jButtonEditar)
                                        .addComponent(jButtonExcluir))
                                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        TelaProfessor telaProfessor = new TelaProfessor(this.professor);
        telaProfessor.setVisible(true);
        this.dispose();
    }

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        RepositoryDesafio rd = new RepositoryDesafio(Desafio.class);
        Desafio desafioDB = rd.buscarPorId((Long) idLinhaSelecionada);
        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Deseja excluir o desafio " + desafioDB.getTitulo() + " ?",
                "Deletar " + desafioDB.getTitulo() + " ?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        if (resposta == JOptionPane.YES_OPTION) {
            if (!rd.deletarPorId(desafioDB.getId()).equals(null))
            {
                ListaDesafios listaDesafios = new ListaDesafios(this.professor);
                listaDesafios.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(
                        null,
                        "Desafio Deletado com sucesso",
                        "Deletado",
                        JOptionPane.INFORMATION_MESSAGE
                );
                return;
            }
            JOptionPane.showMessageDialog(null,
                    "Erro ao deletar Desafio, existem alunos vinculados a esse desafio!",
                    "Erro ao Deletar",
                    JOptionPane.ERROR_MESSAGE);
            setCursor(Cursor.getDefaultCursor());

        } else {
            JOptionPane.

                    showMessageDialog(
                            null,
                            "Operação cancelada. Nenhum desafio deletado.",
                            "Cancelado",
                            JOptionPane.INFORMATION_MESSAGE
                    );
        }

    }

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {
        RepositoryDesafio rd = new RepositoryDesafio(Desafio.class);
        Desafio desafio = rd.buscarPorId((Long) idLinhaSelecionada);
        CadastrarDesafio cadastrarDesafio = new CadastrarDesafio(desafio, this.professor);
        cadastrarDesafio.setVisible(true);
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(ListaDesafios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDesafios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDesafios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDesafios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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

//                new ListaDesafios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDesafios;
// End of variables declaration//GEN-END:variables
}
