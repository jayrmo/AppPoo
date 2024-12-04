
package com.dev.poo.View;


import com.dev.poo.Aux.TipoUsuario;
import com.dev.poo.Entities.Usuario;
import com.dev.poo.Service.ControleDeAcesso;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    private void initComponents() {


        jButton1 = new javax.swing.JButton();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLQuadroVerde = new javax.swing.JLabel();
        jLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jardim do Conhecimento");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENTRAR");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 90, 40));

        jTextFieldEmail.setToolTipText("Digite seu e-mail");
        jTextFieldEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 250, 30));
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    jButton1.doClick();
                }
            }
        });

        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField1.setToolTipText("Digite sua senha");
        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField1.setName("");
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 250, 30));
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    jButton1.doClick();
                }
            }
        });


        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 60, 30));

        jLabelSenha.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Senha");
        getContentPane().add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 60, 30));


        jLQuadroVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login 600.png"))); // NOI18N
        jLQuadroVerde.setPreferredSize(new java.awt.Dimension(400, 600));
        getContentPane().add(jLQuadroVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 320, 350));

        jLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login 600.png"))); // NOI18N
        getContentPane().add(jLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 810, 710));


        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    jButton1.doClick();
                }
            }
        });

        this.setFocusable(true);
        this.requestFocusInWindow();
        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextFieldEmail.getText().isEmpty() || jPasswordField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Preencha todos os campos!",
                    "Erro de Login",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        ControleDeAcesso c = new ControleDeAcesso();
        Usuario usuario = c.autenticarUsuario(jTextFieldEmail.getText(), jPasswordField1.getText());
        if (usuario == null) {
            JOptionPane.showMessageDialog(null,
                    "Usuário ou senha incorretos!",
                    "Erro de Login",
                    JOptionPane.ERROR_MESSAGE);
            setCursor(Cursor.getDefaultCursor());
            return;
        }
        if (usuario.getTipo().equals(TipoUsuario.PROFESSOR)) {
            TelaProfessor telaProfessor = new TelaProfessor(usuario);
            telaProfessor.setVisible(true);
            setCursor(Cursor.getDefaultCursor());
            this.dispose();
        } else if (usuario.getTipo().equals(TipoUsuario.ALUNO)) {
            TelaAluno telaAluno = new TelaAluno(usuario);
            telaAluno.setVisible(true);
            setCursor(Cursor.getDefaultCursor());
            this.dispose();
        }
        setCursor(Cursor.getDefaultCursor());
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLQuadroVerde;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLogin;
    private javax.swing.JTextField jTextFieldEmail;
}
