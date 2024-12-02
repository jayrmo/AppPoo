
package view;

import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldSenha = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLQuadroVerde = new javax.swing.JLabel();
        jLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jardim do Conhecimento");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluno", "Professor" }));
        jComboBox1.setToolTipText("Selecione o tipo de acesso");
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 100, -1));

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

        jTextFieldSenha.setToolTipText("Digite sua senha");
        getContentPane().add(jTextFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 250, 30));

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 60, 30));

        jLabelSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Senha");
        getContentPane().add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 60, 30));

        jLQuadroVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background login.png"))); // NOI18N
        jLQuadroVerde.setPreferredSize(new java.awt.Dimension(400, 600));
        getContentPane().add(jLQuadroVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 320, 350));

        jLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login 600.png"))); // NOI18N
        getContentPane().add(jLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 810, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            String tipoAcesso = (String) jComboBox1.getSelectedItem(); // Obtém o tipo selecionado

    switch (tipoAcesso) {
        case "Aluno":
            TelaAluno telaAluno = new TelaAluno();
            telaAluno.setVisible(true);
            break;
        case "Professor":
            TelaProfessor telaProfessor = new TelaProfessor();
            telaProfessor.setVisible(true);
            break;
    }

    // Fecha a tela de login (opcional)
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLQuadroVerde;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLogin;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables
}
